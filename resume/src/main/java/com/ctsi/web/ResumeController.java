package com.ctsi.web;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import com.ctsi.domain.dto.ResumeDTO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.apache.axis.message.BodyBuilder;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ctsi.service.ResumeService;
import com.ctsi.domain.Resume;

import com.ctsi.ssdc.exception.BadRequestAlertException;
import com.ctsi.ssdc.model.PageResult;
import com.ctsi.ssdc.util.HeaderUtil;
import com.ctsi.ssdc.util.ResponseUtil;

/**
 * REST controller for managing Resume.
 *
 * @author ctsi-biyi-generator
 *
 */
@RestController //返回字符串，相当于@Controller+@RestMapping，放在控制器上，表明映射地址，可放在类和方法上。用在前后端分离上。表示这是个控制器bean，并且是将函数的返回值直接填入HTTP响应体中
@RequestMapping("/api")
public class ResumeController {

    private final Logger log = LoggerFactory.getLogger(ResumeController.class);

    private static final String ENTITY_NAME = "resume";

    private final ResumeService resumeService;

    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @InitBinder   
    public void initBinder(WebDataBinder binder) {   
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");   
        dateFormat.setLenient(true);   
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));   
    } 
   
    /**
     * POST  /resumes : Create a new resume.
     *
     * @param resume the resume to create
     * @return the ResponseEntity with status 201 (Created) and with body the new resume, or with status 400 (Bad Request) if the resume has already an 
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/resumes/add")//增加操作，增加实体类操作，post操作中有实体类post操作数据在body，post方式放在requestbody上
    public ResponseEntity<Resume> createResume(@RequestBody Resume resume) throws URISyntaxException {
        log.debug("REST request to save Resume : {}", resume);//log日志中输出日志调试信息，打印输出debug日志，在输出日志中会标记为括号中内容
        if (resume.getId() != null) {
            throw new BadRequestAlertException("A new cscpUser cannot already have an ID", "cscpUser", "idexists");
        }else{

        }
        //resume.setId(new Random(1).nextInt(100));
        Resume result = this.resumeService.insert(resume);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, ""))
            .body(result);
    }

    /**
    * GET  /resumes : get the resumes firstStringBaseColumn.
    *
    * @return the ResponseEntity with status 200 (OK) and the list of resumes in body
    */
    @GetMapping("/resumes/list")//查询简历信息，对于get没有body只有url
    public PageResult<Resume> getResumesList(String name,String sex ,Integer status,Pageable pageable) {
        log.debug("REST request to get ResumesList");
        return resumeService.findFirstStringColumn(name ,sex, status ,pageable);
    }

    @PutMapping("/resumes/update")//更新简历信息，使用的是put方法
    public ResponseEntity<Resume> updateResume(@RequestBody Resume resume) throws URISyntaxException {
        this.log.debug("REST request to update Resume : {}", resume);
        if(resume.getId() == null) {
            return this.createResume(resume);
        }else{
            Resume result = this.resumeService.update(resume);
            return ((ResponseEntity.BodyBuilder)ResponseEntity.ok().headers(HeaderUtil.createEntityUpdateAlert("cscpUser", resume.getId().toString()))).body(result);
        }//返回实体类resume属性信息
    }

    /*
    * DELETE /Resume/：id
    *
    * @param id of the Resume to delete
    * @return the ResponseEntity with status 200(ok)
    * */
    @DeleteMapping("/Resume/{id}")//删除实体类resume信息，根据主键id删除数据
    public ResponseEntity<Void> deleteResume(@PathVariable Integer id) {
        log.debug("REST request to delete Resume:{}", id);
        resumeService.deleteinfo(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }

    /*
    审核功能
    */
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "id值",readOnly = true)//用在一组参数上注解，表示参数说明
    })
    @PutMapping(value = "/resumes/updateStatus")//审核功能，审核会修改更新简历表中status
        public ResponseEntity<Map> update( Integer id){
        Resume resume = resumeService.findOne(id);
        Map<String, Object> map = new HashMap<>();

        if (resume != null){
            resume.setStatus(1);
            Resume result = this.resumeService.update(resume);

            map.put("name",result.getName()); //在K-V中将指定的value放入到key中
            String strDateFormat = "yyyy-MM-dd HH:mm:ss";
            SimpleDateFormat std = new SimpleDateFormat(strDateFormat);
            Date date = new Date();
            System.out.println(std.format(date));
            map.put("time",std.format(date));
        }


            return ResponseUtil.wrapOrNotFound(Optional.of(map));//返回审核人ID和审核时间
        }
}

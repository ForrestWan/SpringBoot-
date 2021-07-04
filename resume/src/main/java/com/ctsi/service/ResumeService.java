package com.ctsi.service;
import com.ctsi.domain.Resume;
import com.ctsi.domain.ResumeExample;
import com.ctsi.domain.dto.ResumeDTO;
import com.ctsi.ssdc.admin.domain.dto.CscpUserCriteria;
import com.ctsi.ssdc.admin.domain.dto.CscpUserDTO;
import com.ctsi.ssdc.model.PageResult;
import com.ctsi.ssdc.service.StrengthenBaseService;
import org.springframework.data.domain.Pageable;

import java.util.List;


/**
 * Service Interface for managing Resume.
 *
 * @author ctsi-biyi-generator
 *
 */
public interface ResumeService 
	extends StrengthenBaseService<Resume, Integer, ResumeExample>{

    /**
    * GET  /resumes : get the resumes firstStringBaseColumn.
    */
    PageResult<Resume> findFirstStringColumn(String name,String sex,Integer status,Pageable pageable);

    Resume insert(Resume var1);
    Resume update(Resume var1);
    PageResult<Resume> findAll();
    Resume findOne(Integer var1);
    void deleteinfo(Integer var1);


}

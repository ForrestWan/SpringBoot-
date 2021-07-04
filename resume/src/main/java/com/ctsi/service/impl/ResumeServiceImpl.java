package com.ctsi.service.impl;


import com.ctsi.domain.dto.ResumeDTO;
import com.ctsi.service.mapper.ResumeMapper;
import com.ctsi.ssdc.service.impl.StrengthenBaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.apache.commons.collections.CollectionUtils;
import com.ctsi.domain.Resume;
import com.ctsi.domain.ResumeExample;
import com.ctsi.service.ResumeService;
import com.ctsi.repository.ResumeRepository;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import com.ctsi.ssdc.model.PageResult;
import org.springframework.data.domain.Pageable;
import com.github.pagehelper.PageHelper;

/**
 * Service Implementation for managing Resume.
 *
 * @author ctsi-biyi-generator
 */
@Service
public class ResumeServiceImpl extends StrengthenBaseServiceImpl<ResumeRepository, Resume, Integer, ResumeExample> implements ResumeService {
    private final Logger log = LoggerFactory.getLogger(ResumeServiceImpl.class);
    @Autowired
    private ResumeRepository resumeRepository;
    @Autowired
    private ResumeMapper resumeMapper;


    /**
     * GET  /resumes : get the resumes firstStringBaseColumn.
     */

    public ResumeDTO insert(ResumeDTO resumeDTO) {
        this.log.debug("Request to insert Resume : {}", resumeDTO);
        Resume resume = (Resume) this.resumeMapper.toEntity(resumeDTO);
//        String id = UUID.randomUUID().toString();
        resumeDTO.setId(123);
        this.resumeRepository.insert(resume);
        //ResumeDetail userDetail = new ResumeDetail();
        //userDetail.setUserId(resume.getId());
        //userDetail.setRegisterTime(new Date());
        //this.resumeDetailRepository.insert(userDetail);
        return (ResumeDTO) this.resumeMapper.toDto(resume);
    }


    public Resume update(Resume resume) {
        this.log.debug("Request to update Resume : {}", resume);
//        Resume resume = (Resume) this.resumeMapper.toEntity(resumeDTO);
        ResumeExample example = new ResumeExample();
//        this.resumeRepository.updateByPrimaryKeySelective(resume);
        example.createCriteria().andIdEqualTo(resume.getId());
        resumeRepository.updateByExample(resume,example);
        return resume;
    }


    @Override
    public PageResult<Resume> findFirstStringColumn(String name,String sex,Integer status, Pageable pageable) {
        String str = name;
        if (Objects.nonNull(pageable)) {
            PageHelper.startPage(pageable.getPageNumber() + 1, pageable.getPageSize());
        }
        ResumeExample resumeExample = new ResumeExample();
        ResumeExample.Criteria criteria = null;
        String orderBy = getPageOrderBy(pageable);
        if (StringUtils.isNotEmpty(orderBy)) {
            resumeExample.setOrderByClause(orderBy);
        }
        if (sex!=null&&!sex.equals("")) {
            criteria = resumeExample.createCriteria().andSexEqualTo(sex);
        }
        if (StringUtils.isNotBlank(str)) {
            if (criteria==null)
                criteria = resumeExample.createCriteria().andNameLike("%" + str + "%");
            else
                criteria = criteria.andNameLike("%" + str + "%");
        }
        if(status != null){
            criteria = resumeExample.createCriteria().andStatusEqualTo(status);
        }
        List<Resume> data = resumeRepository.selectByExample(resumeExample);

        long count = 0L;
        if (CollectionUtils.isNotEmpty(data)) {
            count = resumeRepository.countByExample(resumeExample);
        }
        return new PageResult<Resume>(data, count, count);
    }

    @Override
    public void deleteinfo(Integer id){
        ResumeExample example = new ResumeExample();
        example.createCriteria().andIdEqualTo(id);
        resumeRepository.deleteByExample(example);
    }

    private String getPageOrderBy(Pageable page) {
        if (page != null && page.getSort() != null) {
            StringBuilder sb = new StringBuilder();
            page.getSort().forEach(sort -> sb.append(sort.getProperty())
                    .append(" ").append(sort.getDirection()).append(","));
            if (sb.length() > 1) {
                return (sb.substring(0, sb.length() - 1));
            }
        }
        return null;
    }
}

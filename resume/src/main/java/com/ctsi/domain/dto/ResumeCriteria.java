package com.ctsi.domain.dto;

import com.ctsi.domain.ResumeExample;
import com.ctsi.ssdc.criteria.IntegerCriteria;
import com.ctsi.ssdc.criteria.StringCriteria;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

public class ResumeCriteria implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final String LIKE_FORMAT = "%%%s%%";
    private IntegerCriteria id;
    private StringCriteria name;

    public ResumeCriteria(){

    }
    public IntegerCriteria getId() {
        return this.id;
    }

    public void setId(IntegerCriteria id) {
        this.id = id;
    }

    public StringCriteria getName() {
        return this.name;
    }
    public void setName(StringCriteria userName) {
        this.name = name;
    }

    public ResumeExample.Criteria buildCriteria(ResumeExample.Criteria criteria){
        if (criteria == null){
            return criteria;
        }else{
            this.buildIdCriteria(criteria);
            this.buildNameCriteria(criteria);
            return criteria;
        }
    }

    private void buildIdCriteria(ResumeExample.Criteria criteria){
        if (this.getId() != null){
            if (this.getId().getEquals() != null){
                criteria.andIdEqualTo((Integer)this.getId().getEquals());
            }else {
                if (this.getId().getGreaterOrEqualThan() != null){
                    criteria.andIdGreaterThanOrEqualTo((Integer)this.getId().getGreaterOrEqualThan());
                }

                if(this.getId().getLessOrEqualThan() != null){
                    criteria.andIdLessThanOrEqualTo((Integer)this.getId().getLessOrEqualThan());
                }

                if(this.getId().getLessOrEqualThan() != null){
                    criteria.andIdLessThanOrEqualTo((Integer)this.getId().getLessOrEqualThan());
                }
            }
        }
    }

    private void buildNameCriteria(ResumeExample.Criteria criteria){
        if (this.getName() != null){
            if (this.getName().getEquals() != null) {
                criteria.andNameEqualTo((String) this.getName().getEquals());
            }else if (StringUtils.isNotBlank(this.getName().getContains())){
                criteria.andNameLike(String.format("%%%s%%", this.getName().getContains()));
            }
            }
        }
    }


package com.ctsi.domain;

import com.ctsi.ssdc.admin.domain.CscpLogLoginExample;
import com.ctsi.ssdc.criteria.IntegerCriteria;
import com.ctsi.ssdc.criteria.StringCriteria;
import com.ctsi.ssdc.example.BaseExample;
import io.swagger.annotations.ApiParam;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * @author ctsi-biyi-generator
 */
public class ResumeExample extends BaseExample {
    /**
     * resume
     */
    protected String orderByClause;

    /**
     * resume
     */
    protected boolean distinct;

    /**
     * resume
     */
    protected List<Criteria> oredCriteria;

    /**
     * resume
     */
    private static final String LIKE_FORMAT = "%%%s%%";

    private IntegerCriteria id;

    /**
     * @Fields name
     */
    private StringCriteria name;

    /**
     * @Fields sex
     */
    private StringCriteria sex;

    /**
     * @Fields birth
     */
    private StringCriteria birth;

    /**
     * @Fields nation
     */
    private StringCriteria nation;

    /**
     * @Fields politics
     */
    private StringCriteria politics;

    /**
     * @Fields height
     */
    private StringCriteria height;

    /**
     * @Fields education
     */
    private StringCriteria education;

    /**
     * @Fields record
     */
    private StringCriteria record;

    /**
     * @Fields register
     */
    private StringCriteria register;

    /**
     * @Fields major
     */
    private StringCriteria major;

    /**
     * @Fields school
     */
    private StringCriteria school;

    /**
     * @Fields english
     */
    private StringCriteria english;

    /**
     * @Fields computer
     */
    private StringCriteria computer;

    /**
     * @Fields experience
     */
    private StringCriteria experience;

    /**
     * @Fields photo
     */
    private StringCriteria photo;

    /**
     * @Fields address
     */
    private StringCriteria address;

    /**
     * @Fields telephone
     */
    private StringCriteria telephone;

    /**
     * @Fields email
     */
    private StringCriteria email;

    /**
     * @Fields postcode
     */
    private StringCriteria postcode;

    /**
     * @Fields judge
     */
    private StringCriteria judge;

    /**
     * @Fields status
     */
    private IntegerCriteria status;

    /**
     *
     * @mbg.generated
     */
    public ResumeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public IntegerCriteria getId(){return id;}
    public void setId(IntegerCriteria id){this.id = id;}
    private void buildIdCriteria(Criteria criteria) {
        if (this.getId() == null) {
            return ;
        }
        if (this.getId().getEquals() != null) {
            criteria.andIdEqualTo(this.getId().getEquals());
        } else {
            if(this.getId().getGreaterOrEqualThan() != null){
                criteria.andIdGreaterThanOrEqualTo(this.getId().getGreaterOrEqualThan());
            }
            if(this.getId().getLessOrEqualThan() != null){
                criteria.andIdLessThanOrEqualTo(this.getId().getLessOrEqualThan());
            }
            }
        }


    /**
     *
     * @mbg.generated
     */
    public StringCriteria getName() {
        return name;
    }

    /**
     *
     * @mbg.generated
     */
    public void setName(StringCriteria name) {
        this. name = name;
    }

    /**
     *
     * @mbg.generated
     */
    private void buildNameCriteria(Criteria criteria) {
        if (this.getName() == null) {
            return;
        }
        if (this.getName().getEquals() != null) {
            criteria.andNameEqualTo(this.getName().getEquals());
        } else {
            if (StringUtils.isNotBlank(this.getName().getContains())) {
                criteria.andNameLike(String.format(LIKE_FORMAT, this.getName().getContains()));
            }
        }
    }

    /**
     *
     * @mbg.generated
     */
    public StringCriteria getSex() {
        return sex;
    }

    /**
     *
     * @mbg.generated
     */
    public void setSex(StringCriteria sex) {
        this. sex = sex;
    }

    /**
     *
     * @mbg.generated
     */
    private void buildSexCriteria(Criteria criteria) {
        if (this.getSex() == null) {
            return;
        }
        if (this.getSex().getEquals() != null) {
            criteria.andSexEqualTo(this.getSex().getEquals());
        } else {
            if (StringUtils.isNotBlank(this.getSex().getContains())) {
                criteria.andSexLike(String.format(LIKE_FORMAT, this.getSex().getContains()));
            }
        }
    }

    /**
     *
     * @mbg.generated
     */
    public StringCriteria getBirth() {
        return birth;
    }

    /**
     *
     * @mbg.generated
     */
    public void setBirth(StringCriteria birth) {
        this. birth = birth;
    }

    /**
     *
     * @mbg.generated
     */
    private void buildBirthCriteria(Criteria criteria) {
        if (this.getBirth() == null) {
            return;
        }
        if (this.getBirth().getEquals() != null) {
            criteria.andBirthEqualTo(this.getBirth().getEquals());
        } else {
            if (StringUtils.isNotBlank(this.getBirth().getContains())) {
                criteria.andBirthLike(String.format(LIKE_FORMAT, this.getBirth().getContains()));
            }
        }
    }

    /**
     *
     * @mbg.generated
     */
    public StringCriteria getNation() {
        return nation;
    }

    /**
     *
     * @mbg.generated
     */
    public void setNation(StringCriteria nation) {
        this. nation = nation;
    }

    /**
     *
     * @mbg.generated
     */
    private void buildNationCriteria(Criteria criteria) {
        if (this.getNation() == null) {
            return;
        }
        if (this.getNation().getEquals() != null) {
            criteria.andNationEqualTo(this.getNation().getEquals());
        } else {
            if (StringUtils.isNotBlank(this.getNation().getContains())) {
                criteria.andNationLike(String.format(LIKE_FORMAT, this.getNation().getContains()));
            }
        }
    }

    /**
     *
     * @mbg.generated
     */
    public StringCriteria getPolitics() {
        return politics;
    }

    /**
     *
     * @mbg.generated
     */
    public void setPolitics(StringCriteria politics) {
        this. politics = politics;
    }

    /**
     *
     * @mbg.generated
     */
    private void buildPoliticsCriteria(Criteria criteria) {
        if (this.getPolitics() == null) {
            return;
        }
        if (this.getPolitics().getEquals() != null) {
            criteria.andPoliticsEqualTo(this.getPolitics().getEquals());
        } else {
            if (StringUtils.isNotBlank(this.getPolitics().getContains())) {
                criteria.andPoliticsLike(String.format(LIKE_FORMAT, this.getPolitics().getContains()));
            }
        }
    }

    /**
     *
     * @mbg.generated
     */
    public StringCriteria getHeight() {
        return height;
    }

    /**
     *
     * @mbg.generated
     */
    public void setHeight(StringCriteria height) {
        this. height = height;
    }

    /**
     *
     * @mbg.generated
     */
    private void buildHeightCriteria(Criteria criteria) {
        if (this.getHeight() == null) {
            return;
        }
        if (this.getHeight().getEquals() != null) {
            criteria.andHeightEqualTo(this.getHeight().getEquals());
        } else {
            if (StringUtils.isNotBlank(this.getHeight().getContains())) {
                criteria.andHeightLike(String.format(LIKE_FORMAT, this.getHeight().getContains()));
            }
        }
    }

    /**
     *
     * @mbg.generated
     */
    public StringCriteria getEducation() {
        return education;
    }

    /**
     *
     * @mbg.generated
     */
    public void setEducation(StringCriteria education) {
        this. education = education;
    }

    /**
     *
     * @mbg.generated
     */
    private void buildEducationCriteria(Criteria criteria) {
        if (this.getEducation() == null) {
            return;
        }
        if (this.getEducation().getEquals() != null) {
            criteria.andEducationEqualTo(this.getEducation().getEquals());
        } else {
            if (StringUtils.isNotBlank(this.getEducation().getContains())) {
                criteria.andEducationLike(String.format(LIKE_FORMAT, this.getEducation().getContains()));
            }
        }
    }

    /**
     *
     * @mbg.generated
     */
    public StringCriteria getRecord() {
        return record;
    }

    /**
     *
     * @mbg.generated
     */
    public void setRecord(StringCriteria record) {
        this. record = record;
    }

    /**
     *
     * @mbg.generated
     */
    private void buildRecordCriteria(Criteria criteria) {
        if (this.getRecord() == null) {
            return;
        }
        if (this.getRecord().getEquals() != null) {
            criteria.andRecordEqualTo(this.getRecord().getEquals());
        } else {
            if (StringUtils.isNotBlank(this.getRecord().getContains())) {
                criteria.andRecordLike(String.format(LIKE_FORMAT, this.getRecord().getContains()));
            }
        }
    }

    /**
     *
     * @mbg.generated
     */
    public StringCriteria getRegister() {
        return register;
    }

    /**
     *
     * @mbg.generated
     */
    public void setRegister(StringCriteria register) {
        this. register = register;
    }

    /**
     *
     * @mbg.generated
     */
    private void buildRegisterCriteria(Criteria criteria) {
        if (this.getRegister() == null) {
            return;
        }
        if (this.getRegister().getEquals() != null) {
            criteria.andRegisterEqualTo(this.getRegister().getEquals());
        } else {
            if (StringUtils.isNotBlank(this.getRegister().getContains())) {
                criteria.andRegisterLike(String.format(LIKE_FORMAT, this.getRegister().getContains()));
            }
        }
    }

    /**
     *
     * @mbg.generated
     */
    public StringCriteria getMajor() {
        return major;
    }

    /**
     *
     * @mbg.generated
     */
    public void setMajor(StringCriteria major) {
        this. major = major;
    }

    /**
     *
     * @mbg.generated
     */
    private void buildMajorCriteria(Criteria criteria) {
        if (this.getMajor() == null) {
            return;
        }
        if (this.getMajor().getEquals() != null) {
            criteria.andMajorEqualTo(this.getMajor().getEquals());
        } else {
            if (StringUtils.isNotBlank(this.getMajor().getContains())) {
                criteria.andMajorLike(String.format(LIKE_FORMAT, this.getMajor().getContains()));
            }
        }
    }

    /**
     *
     * @mbg.generated
     */
    public StringCriteria getSchool() {
        return school;
    }

    /**
     *
     * @mbg.generated
     */
    public void setSchool(StringCriteria school) {
        this. school = school;
    }

    /**
     *
     * @mbg.generated
     */
    private void buildSchoolCriteria(Criteria criteria) {
        if (this.getSchool() == null) {
            return;
        }
        if (this.getSchool().getEquals() != null) {
            criteria.andSchoolEqualTo(this.getSchool().getEquals());
        } else {
            if (StringUtils.isNotBlank(this.getSchool().getContains())) {
                criteria.andSchoolLike(String.format(LIKE_FORMAT, this.getSchool().getContains()));
            }
        }
    }

    /**
     *
     * @mbg.generated
     */
    public StringCriteria getEnglish() {
        return english;
    }

    /**
     *
     * @mbg.generated
     */
    public void setEnglish(StringCriteria english) {
        this. english = english;
    }

    /**
     *
     * @mbg.generated
     */
    private void buildEnglishCriteria(Criteria criteria) {
        if (this.getEnglish() == null) {
            return;
        }
        if (this.getEnglish().getEquals() != null) {
            criteria.andEnglishEqualTo(this.getEnglish().getEquals());
        } else {
            if (StringUtils.isNotBlank(this.getEnglish().getContains())) {
                criteria.andEnglishLike(String.format(LIKE_FORMAT, this.getEnglish().getContains()));
            }
        }
    }

    /**
     *
     * @mbg.generated
     */
    public StringCriteria getComputer() {
        return computer;
    }

    /**
     *
     * @mbg.generated
     */
    public void setComputer(StringCriteria computer) {
        this. computer = computer;
    }

    /**
     *
     * @mbg.generated
     */
    private void buildComputerCriteria(Criteria criteria) {
        if (this.getComputer() == null) {
            return;
        }
        if (this.getComputer().getEquals() != null) {
            criteria.andComputerEqualTo(this.getComputer().getEquals());
        } else {
            if (StringUtils.isNotBlank(this.getComputer().getContains())) {
                criteria.andComputerLike(String.format(LIKE_FORMAT, this.getComputer().getContains()));
            }
        }
    }

    /**
     *
     * @mbg.generated
     */
    public StringCriteria getExperience() {
        return experience;
    }

    /**
     *
     * @mbg.generated
     */
    public void setExperience(StringCriteria experience) {
        this. experience = experience;
    }

    /**
     *
     * @mbg.generated
     */
    private void buildExperienceCriteria(Criteria criteria) {
        if (this.getExperience() == null) {
            return;
        }
        if (this.getExperience().getEquals() != null) {
            criteria.andExperienceEqualTo(this.getExperience().getEquals());
        } else {
            if (StringUtils.isNotBlank(this.getExperience().getContains())) {
                criteria.andExperienceLike(String.format(LIKE_FORMAT, this.getExperience().getContains()));
            }
        }
    }

    /**
     *
     * @mbg.generated
     */
    public StringCriteria getPhoto() {
        return photo;
    }

    /**
     *
     * @mbg.generated
     */
    public void setPhoto(StringCriteria photo) {
        this. photo = photo;
    }

    /**
     *
     * @mbg.generated
     */
    private void buildPhotoCriteria(Criteria criteria) {
        if (this.getPhoto() == null) {
            return;
        }
        if (this.getPhoto().getEquals() != null) {
            criteria.andPhotoEqualTo(this.getPhoto().getEquals());
        } else {
            if (StringUtils.isNotBlank(this.getPhoto().getContains())) {
                criteria.andPhotoLike(String.format(LIKE_FORMAT, this.getPhoto().getContains()));
            }
        }
    }

    /**
     *
     * @mbg.generated
     */
    public StringCriteria getAddress() {
        return address;
    }

    /**
     *
     * @mbg.generated
     */
    public void setAddress(StringCriteria address) {
        this. address = address;
    }

    /**
     *
     * @mbg.generated
     */
    private void buildAddressCriteria(Criteria criteria) {
        if (this.getAddress() == null) {
            return;
        }
        if (this.getAddress().getEquals() != null) {
            criteria.andAddressEqualTo(this.getAddress().getEquals());
        } else {
            if (StringUtils.isNotBlank(this.getAddress().getContains())) {
                criteria.andAddressLike(String.format(LIKE_FORMAT, this.getAddress().getContains()));
            }
        }
    }

    /**
     *
     * @mbg.generated
     */
    public StringCriteria getTelephone() {
        return telephone;
    }

    /**
     *
     * @mbg.generated
     */
    public void setTelephone(StringCriteria telephone) {
        this. telephone = telephone;
    }

    /**
     *
     * @mbg.generated
     */
    private void buildTelephoneCriteria(Criteria criteria) {
        if (this.getTelephone() == null) {
            return;
        }
        if (this.getTelephone().getEquals() != null) {
            criteria.andTelephoneEqualTo(this.getTelephone().getEquals());
        } else {
            if (StringUtils.isNotBlank(this.getTelephone().getContains())) {
                criteria.andTelephoneLike(String.format(LIKE_FORMAT, this.getTelephone().getContains()));
            }
        }
    }

    /**
     *
     * @mbg.generated
     */
    public StringCriteria getEMail() {
        return email;
    }

    /**
     *
     * @mbg.generated
     */
    public void setEMail(StringCriteria eMail) {
        this. email = eMail;
    }

    /**
     *
     * @mbg.generated
     */
    private void buildEMailCriteria(Criteria criteria) {
        if (this.getEMail() == null) {
            return;
        }
        if (this.getEMail().getEquals() != null) {
            criteria.andEMailEqualTo(this.getEMail().getEquals());
        } else {
            if (StringUtils.isNotBlank(this.getEMail().getContains())) {
                criteria.andEMailLike(String.format(LIKE_FORMAT, this.getEMail().getContains()));
            }
        }
    }

    /**
     *
     * @mbg.generated
     */
    public StringCriteria getPostcode() {
        return postcode;
    }

    /**
     *
     * @mbg.generated
     */
    public void setPostcode(StringCriteria postcode) {
        this. postcode = postcode;
    }

    /**
     *
     * @mbg.generated
     */
    private void buildPostcodeCriteria(Criteria criteria) {
        if (this.getPostcode() == null) {
            return;
        }
        if (this.getPostcode().getEquals() != null) {
            criteria.andPostcodeEqualTo(this.getPostcode().getEquals());
        } else {
            if (StringUtils.isNotBlank(this.getPostcode().getContains())) {
                criteria.andPostcodeLike(String.format(LIKE_FORMAT, this.getPostcode().getContains()));
            }
        }
    }

    /**
     *
     * @mbg.generated
     */
    public StringCriteria getJudge() {
        return judge;
    }

    /**
     *
     * @mbg.generated
     */
    public void setJudge(StringCriteria judge) {
        this. judge = judge;
    }

    /**
     *
     * @mbg.generated
     */
    private void buildJudgeCriteria(Criteria criteria) {
        if (this.getJudge() == null) {
            return;
        }
        if (this.getJudge().getEquals() != null) {
            criteria.andJudgeEqualTo(this.getJudge().getEquals());
        } else {
            if (StringUtils.isNotBlank(this.getJudge().getContains())) {
                criteria.andJudgeLike(String.format(LIKE_FORMAT, this.getJudge().getContains()));
            }
        }
    }


    public IntegerCriteria getStatus(){return status;}
    public void setStatus(IntegerCriteria status){this.status = status;}
    private void buildStatusCriteria(Criteria criteria) {
        if (this.getStatus() == null) {
            return ;
        }
        if (this.getStatus().getEquals() != null) {
            criteria.andStatusEqualTo(this.getStatus().getEquals());
        } else {
            if(this.getStatus().getGreaterOrEqualThan() != null){
                criteria.andStatusGreaterThanOrEqualTo(this.getStatus().getGreaterOrEqualThan());
            }
            if(this.getStatus().getLessOrEqualThan() != null){
                criteria.andStatusLessThanOrEqualTo(this.getStatus().getLessOrEqualThan());
            }
        }
    }

    /**
     *
     * @mbg.generated
     */
    public Object buildCriteria() {
        Criteria criteria = this.createCriteria();
        this.buildIdCriteria(criteria);
        this.buildNameCriteria(criteria);
        this.buildSexCriteria(criteria);
        this.buildBirthCriteria(criteria);
        this.buildNationCriteria(criteria);
        this.buildPoliticsCriteria(criteria);
        this.buildHeightCriteria(criteria);
        this.buildEducationCriteria(criteria);
        this.buildRecordCriteria(criteria);
        this.buildRegisterCriteria(criteria);
        this.buildMajorCriteria(criteria);
        this.buildSchoolCriteria(criteria);
        this.buildEnglishCriteria(criteria);
        this.buildComputerCriteria(criteria);
        this.buildExperienceCriteria(criteria);
        this.buildPhotoCriteria(criteria);
        this.buildAddressCriteria(criteria);
        this.buildTelephoneCriteria(criteria);
        this.buildEMailCriteria(criteria);
        this.buildPostcodeCriteria(criteria);
        this.buildJudgeCriteria(criteria);
        this.buildStatusCriteria(criteria);
        return criteria;
    }

    /**
     * resume
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria = new ArrayList();

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public ResumeExample.Criteria andIdIsNull() {
            this.addCriterion("id is null");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andIdIsNotNull() {
            this.addCriterion("id is not null");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andIdEqualTo(Integer value) { //查询数据库中字段等于特定Id的值
            this.addCriterion("id =", value, "id");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andIdNotEqualTo(Integer value) {
            this.addCriterion("id <>", value, "id");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andIdGreaterThan(Integer value) {
            this.addCriterion("id >", value, "id");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("id >=", value, "id");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andIdLessThan(Integer value) {
            this.addCriterion("id <", value, "id");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andIdLessThanOrEqualTo(Integer value) {
            this.addCriterion("id <=", value, "id");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andIdIn(List<Integer> values) {
            this.addCriterion("id in", values, "id");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andIdNotIn(List<Integer> values) {
            this.addCriterion("id not in", values, "id");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andIdBetween(Integer value1, Integer value2) {
            this.addCriterion("id between", value1, value2, "id");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
            this.addCriterion("id not between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("birth is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("birth is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(String value) {
            addCriterion("birth =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(String value) {
            addCriterion("birth <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(String value) {
            addCriterion("birth >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(String value) {
            addCriterion("birth >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(String value) {
            addCriterion("birth <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(String value) {
            addCriterion("birth <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLike(String value) {
            addCriterion("birth like", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotLike(String value) {
            addCriterion("birth not like", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<String> values) {
            addCriterion("birth in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<String> values) {
            addCriterion("birth not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(String value1, String value2) {
            addCriterion("birth between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(String value1, String value2) {
            addCriterion("birth not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andPoliticsIsNull() {
            addCriterion("politics is null");
            return (Criteria) this;
        }

        public Criteria andPoliticsIsNotNull() {
            addCriterion("politics is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticsEqualTo(String value) {
            addCriterion("politics =", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotEqualTo(String value) {
            addCriterion("politics <>", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsGreaterThan(String value) {
            addCriterion("politics >", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsGreaterThanOrEqualTo(String value) {
            addCriterion("politics >=", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsLessThan(String value) {
            addCriterion("politics <", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsLessThanOrEqualTo(String value) {
            addCriterion("politics <=", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsLike(String value) {
            addCriterion("politics like", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotLike(String value) {
            addCriterion("politics not like", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsIn(List<String> values) {
            addCriterion("politics in", values, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotIn(List<String> values) {
            addCriterion("politics not in", values, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsBetween(String value1, String value2) {
            addCriterion("politics between", value1, value2, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotBetween(String value1, String value2) {
            addCriterion("politics not between", value1, value2, "politics");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(String value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(String value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(String value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(String value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(String value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(String value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLike(String value) {
            addCriterion("height like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotLike(String value) {
            addCriterion("height not like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<String> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<String> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(String value1, String value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(String value1, String value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andRecordIsNull() {
            addCriterion("record is null");
            return (Criteria) this;
        }

        public Criteria andRecordIsNotNull() {
            addCriterion("record is not null");
            return (Criteria) this;
        }

        public Criteria andRecordEqualTo(String value) {
            addCriterion("record =", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotEqualTo(String value) {
            addCriterion("record <>", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThan(String value) {
            addCriterion("record >", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThanOrEqualTo(String value) {
            addCriterion("record >=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThan(String value) {
            addCriterion("record <", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThanOrEqualTo(String value) {
            addCriterion("record <=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLike(String value) {
            addCriterion("record like", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotLike(String value) {
            addCriterion("record not like", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordIn(List<String> values) {
            addCriterion("record in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotIn(List<String> values) {
            addCriterion("record not in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordBetween(String value1, String value2) {
            addCriterion("record between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotBetween(String value1, String value2) {
            addCriterion("record not between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNull() {
            addCriterion("register is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNotNull() {
            addCriterion("register is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterEqualTo(String value) {
            addCriterion("register =", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotEqualTo(String value) {
            addCriterion("register <>", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThan(String value) {
            addCriterion("register >", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("register >=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThan(String value) {
            addCriterion("register <", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThanOrEqualTo(String value) {
            addCriterion("register <=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLike(String value) {
            addCriterion("register like", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotLike(String value) {
            addCriterion("register not like", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterIn(List<String> values) {
            addCriterion("register in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotIn(List<String> values) {
            addCriterion("register not in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterBetween(String value1, String value2) {
            addCriterion("register between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotBetween(String value1, String value2) {
            addCriterion("register not between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andEnglishIsNull() {
            addCriterion("English is null");
            return (Criteria) this;
        }

        public Criteria andEnglishIsNotNull() {
            addCriterion("English is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishEqualTo(String value) {
            addCriterion("English =", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotEqualTo(String value) {
            addCriterion("English <>", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishGreaterThan(String value) {
            addCriterion("English >", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishGreaterThanOrEqualTo(String value) {
            addCriterion("English >=", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishLessThan(String value) {
            addCriterion("English <", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishLessThanOrEqualTo(String value) {
            addCriterion("English <=", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishLike(String value) {
            addCriterion("English like", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotLike(String value) {
            addCriterion("English not like", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishIn(List<String> values) {
            addCriterion("English in", values, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotIn(List<String> values) {
            addCriterion("English not in", values, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishBetween(String value1, String value2) {
            addCriterion("English between", value1, value2, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotBetween(String value1, String value2) {
            addCriterion("English not between", value1, value2, "english");
            return (Criteria) this;
        }

        public Criteria andComputerIsNull() {
            addCriterion("computer is null");
            return (Criteria) this;
        }

        public Criteria andComputerIsNotNull() {
            addCriterion("computer is not null");
            return (Criteria) this;
        }

        public Criteria andComputerEqualTo(String value) {
            addCriterion("computer =", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerNotEqualTo(String value) {
            addCriterion("computer <>", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerGreaterThan(String value) {
            addCriterion("computer >", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerGreaterThanOrEqualTo(String value) {
            addCriterion("computer >=", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerLessThan(String value) {
            addCriterion("computer <", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerLessThanOrEqualTo(String value) {
            addCriterion("computer <=", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerLike(String value) {
            addCriterion("computer like", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerNotLike(String value) {
            addCriterion("computer not like", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerIn(List<String> values) {
            addCriterion("computer in", values, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerNotIn(List<String> values) {
            addCriterion("computer not in", values, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerBetween(String value1, String value2) {
            addCriterion("computer between", value1, value2, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerNotBetween(String value1, String value2) {
            addCriterion("computer not between", value1, value2, "computer");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNull() {
            addCriterion("experience is null");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNotNull() {
            addCriterion("experience is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceEqualTo(String value) {
            addCriterion("experience =", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotEqualTo(String value) {
            addCriterion("experience <>", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThan(String value) {
            addCriterion("experience >", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("experience >=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThan(String value) {
            addCriterion("experience <", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThanOrEqualTo(String value) {
            addCriterion("experience <=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLike(String value) {
            addCriterion("experience like", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotLike(String value) {
            addCriterion("experience not like", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceIn(List<String> values) {
            addCriterion("experience in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotIn(List<String> values) {
            addCriterion("experience not in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceBetween(String value1, String value2) {
            addCriterion("experience between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotBetween(String value1, String value2) {
            addCriterion("experience not between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andEMailIsNull() {
            addCriterion("E-mail is null");
            return (Criteria) this;
        }

        public Criteria andEMailIsNotNull() {
            addCriterion("E-mail is not null");
            return (Criteria) this;
        }

        public Criteria andEMailEqualTo(String value) {
            addCriterion("E-mail =", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotEqualTo(String value) {
            addCriterion("E-mail <>", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThan(String value) {
            addCriterion("E-mail >", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThanOrEqualTo(String value) {
            addCriterion("E-mail >=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThan(String value) {
            addCriterion("E-mail <", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThanOrEqualTo(String value) {
            addCriterion("E-mail <=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLike(String value) {
            addCriterion("E-mail like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotLike(String value) {
            addCriterion("E-mail not like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailIn(List<String> values) {
            addCriterion("E-mail in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotIn(List<String> values) {
            addCriterion("E-mail not in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailBetween(String value1, String value2) {
            addCriterion("E-mail between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotBetween(String value1, String value2) {
            addCriterion("E-mail not between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("postcode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("postcode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("postcode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("postcode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postcode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("postcode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("postcode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("postcode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("postcode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("postcode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("postcode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("postcode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("postcode not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andJudgeIsNull() {
            addCriterion("judge is null");
            return (Criteria) this;
        }

        public Criteria andJudgeIsNotNull() {
            addCriterion("judge is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeEqualTo(String value) {
            addCriterion("judge =", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotEqualTo(String value) {
            addCriterion("judge <>", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeGreaterThan(String value) {
            addCriterion("judge >", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeGreaterThanOrEqualTo(String value) {
            addCriterion("judge >=", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeLessThan(String value) {
            addCriterion("judge <", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeLessThanOrEqualTo(String value) {
            addCriterion("judge <=", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeLike(String value) {
            addCriterion("judge like", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotLike(String value) {
            addCriterion("judge not like", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeIn(List<String> values) {
            addCriterion("judge in", values, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotIn(List<String> values) {
            addCriterion("judge not in", values, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeBetween(String value1, String value2) {
            addCriterion("judge between", value1, value2, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotBetween(String value1, String value2) {
            addCriterion("judge not between", value1, value2, "judge");
            return (Criteria) this;
        }

        public ResumeExample.Criteria andStatusIsNull() {
            this.addCriterion("id is null");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andStatusIsNotNull() {
            this.addCriterion("id is not null");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andStatusEqualTo(Integer value) { //查询数据库中字段等于特定Id的值
            this.addCriterion("id =", value, "id");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andStatusNotEqualTo(Integer value) {
            this.addCriterion("id <>", value, "id");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andStatusGreaterThan(Integer value) {
            this.addCriterion("id >", value, "id");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("id >=", value, "id");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andStatusLessThan(Integer value) {
            this.addCriterion("status <", value, "status");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andStatusLessThanOrEqualTo(Integer value) {
            this.addCriterion("status <=", value, "status");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andStatusIn(List<Integer> values) {
            this.addCriterion("status in", values, "status");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andStatusNotIn(List<Integer> values) {
            this.addCriterion("status not in", values, "status");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andStatusBetween(Integer value1, Integer value2) {
            this.addCriterion("status between", value1, value2, "status");
            return (Criteria)this;
        }

        public ResumeExample.Criteria andStatusNotBetween(Integer value1, Integer value2) {
            this.addCriterion("status not between", value1, value2, "status");
            return (Criteria)this;
        }
    }

    /**
     * resume
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * resume
     */
    public static class Criterion {
        @ApiParam(hidden=true)
        private String condition;

        @ApiParam(hidden=true)
        private Object value;

        @ApiParam(hidden=true)
        private Object secondValue;

        @ApiParam(hidden=true)
        private boolean noValue;

        @ApiParam(hidden=true)
        private boolean singleValue;

        @ApiParam(hidden=true)
        private boolean betweenValue;

        @ApiParam(hidden=true)
        private boolean listValue;

        @ApiParam(hidden=true)
        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
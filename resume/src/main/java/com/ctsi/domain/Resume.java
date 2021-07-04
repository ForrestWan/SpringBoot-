package com.ctsi.domain;

import java.io.Serializable;

/**
 * @author ctsi-biyi-generator
 */
public class Resume implements Serializable {
    private  Integer id;
    /**
     * @Fields name
     */
    private String name;

    /**
     * @Fields sex
     */
    private String sex;

    /**
     * @Fields birth
     */
    private String birth;

    /**
     * @Fields nation
     */
    private String nation;

    /**
     * @Fields politics
     */
    private String politics;

    /**
     * @Fields height
     */
    private String height;

    /**
     * @Fields education
     */
    private String education;

    /**
     * @Fields record
     */
    private String record;

    /**
     * @Fields register
     */
    private String register;

    /**
     * @Fields major
     */
    private String major;

    /**
     * @Fields school
     */
    private String school;

    /**
     * @Fields english
     */
    private String english;

    /**
     * @Fields computer
     */
    private String computer;

    /**
     * @Fields experience
     */
    private String experience;

    /**
     * @Fields photo
     */
    private String photo;

    /**
     * @Fields address
     */
    private String address;

    /**
     * @Fields telephone
     */
    private String telephone;

    /**
     * @Fields email
     */
    private String email;

    /**
     * @Fields postcode
     */
    private String postcode;

    /**
     * @Fields judge
     */
    private String judge;

    /**
     * @Fields status
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId(){ return  this.id; }

    public void setId(Integer id) {
        this.id = id == null ? null : id;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     *
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     *
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     *
     * @return birth
     */
    public String getBirth() {
        return birth;
    }

    /**
     *
     * @param birth
     */
    public void setBirth(String birth) {
        this.birth = birth == null ? null : birth.trim();
    }

    /**
     *
     * @return nation
     */
    public String getNation() {
        return nation;
    }

    /**
     *
     * @param nation
     */
    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    /**
     *
     * @return politics
     */
    public String getPolitics() {
        return politics;
    }

    /**
     *
     * @param politics
     */
    public void setPolitics(String politics) {
        this.politics = politics == null ? null : politics.trim();
    }

    /**
     *
     * @return height
     */
    public String getHeight() {
        return height;
    }

    /**
     *
     * @param height
     */
    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    /**
     *
     * @return education
     */
    public String getEducation() {
        return education;
    }

    /**
     *
     * @param education
     */
    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    /**
     *
     * @return record
     */
    public String getRecord() {
        return record;
    }

    /**
     *
     * @param record
     */
    public void setRecord(String record) {
        this.record = record == null ? null : record.trim();
    }

    /**
     *
     * @return register
     */
    public String getRegister() {
        return register;
    }

    /**
     *
     * @param register
     */
    public void setRegister(String register) {
        this.register = register == null ? null : register.trim();
    }

    /**
     *
     * @return major
     */
    public String getMajor() {
        return major;
    }

    /**
     *
     * @param major
     */
    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    /**
     *
     * @return school
     */
    public String getSchool() {
        return school;
    }

    /**
     *
     * @param school
     */
    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    /**
     *
     * @return english
     */
    public String getEnglish() {
        return english;
    }

    /**
     *
     * @param english
     */
    public void setEnglish(String english) {
        this.english = english == null ? null : english.trim();
    }

    /**
     *
     * @return computer
     */
    public String getComputer() {
        return computer;
    }

    /**
     *
     * @param computer
     */
    public void setComputer(String computer) {
        this.computer = computer == null ? null : computer.trim();
    }

    /**
     *
     * @return experience
     */
    public String getExperience() {
        return experience;
    }

    /**
     *
     * @param experience
     */
    public void setExperience(String experience) {
        this.experience = experience == null ? null : experience.trim();
    }

    /**
     *
     * @return photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     *
     * @param photo
     */
    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    /**
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     *
     * @return telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     *
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return postcode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     *
     * @param postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    /**
     *
     * @return judge
     */
    public String getJudge() {
        return judge;
    }

    /**
     *
     * @param judge
     */
    public void setJudge(String judge) {
        this.judge = judge == null ? null : judge.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Resume other = (Resume) that;
        return
                (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                &&(this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
                && (this.getBirth() == null ? other.getBirth() == null : this.getBirth().equals(other.getBirth()))
                && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
                && (this.getPolitics() == null ? other.getPolitics() == null : this.getPolitics().equals(other.getPolitics()))
                && (this.getHeight() == null ? other.getHeight() == null : this.getHeight().equals(other.getHeight()))
                && (this.getEducation() == null ? other.getEducation() == null : this.getEducation().equals(other.getEducation()))
                && (this.getRecord() == null ? other.getRecord() == null : this.getRecord().equals(other.getRecord()))
                && (this.getRegister() == null ? other.getRegister() == null : this.getRegister().equals(other.getRegister()))
                && (this.getMajor() == null ? other.getMajor() == null : this.getMajor().equals(other.getMajor()))
                && (this.getSchool() == null ? other.getSchool() == null : this.getSchool().equals(other.getSchool()))
                && (this.getEnglish() == null ? other.getEnglish() == null : this.getEnglish().equals(other.getEnglish()))
                && (this.getComputer() == null ? other.getComputer() == null : this.getComputer().equals(other.getComputer()))
                && (this.getExperience() == null ? other.getExperience() == null : this.getExperience().equals(other.getExperience()))
                && (this.getPhoto() == null ? other.getPhoto() == null : this.getPhoto().equals(other.getPhoto()))
                && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
                && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
                && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
                && (this.getPostcode() == null ? other.getPostcode() == null : this.getPostcode().equals(other.getPostcode()))
                && (this.getJudge() == null ? other.getJudge() == null : this.getJudge().equals(other.getJudge()))
                        && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirth() == null) ? 0 : getBirth().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getPolitics() == null) ? 0 : getPolitics().hashCode());
        result = prime * result + ((getHeight() == null) ? 0 : getHeight().hashCode());
        result = prime * result + ((getEducation() == null) ? 0 : getEducation().hashCode());
        result = prime * result + ((getRecord() == null) ? 0 : getRecord().hashCode());
        result = prime * result + ((getRegister() == null) ? 0 : getRegister().hashCode());
        result = prime * result + ((getMajor() == null) ? 0 : getMajor().hashCode());
        result = prime * result + ((getSchool() == null) ? 0 : getSchool().hashCode());
        result = prime * result + ((getEnglish() == null) ? 0 : getEnglish().hashCode());
        result = prime * result + ((getComputer() == null) ? 0 : getComputer().hashCode());
        result = prime * result + ((getExperience() == null) ? 0 : getExperience().hashCode());
        result = prime * result + ((getPhoto() == null) ? 0 : getPhoto().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPostcode() == null) ? 0 : getPostcode().hashCode());
        result = prime * result + ((getJudge() == null) ? 0 : getJudge().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}
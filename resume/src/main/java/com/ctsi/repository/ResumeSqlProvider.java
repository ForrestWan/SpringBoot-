package com.ctsi.repository;

import com.ctsi.domain.Resume;
import com.ctsi.domain.ResumeExample.Criteria;
import com.ctsi.domain.ResumeExample.Criterion;
import com.ctsi.domain.ResumeExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

/**
 * @author ctsi-biyi-generator
 */
public class ResumeSqlProvider {

    /**
     *
     * @mbg.generated
     */
    public String countByExample(ResumeExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("resume");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     *
     * @mbg.generated
     */
    public String deleteByExample(ResumeExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("resume");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     *
     * @mbg.generated
     */
    public String insertSelective(Resume record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("resume");

        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }

        if (record.getSex() != null) {
            sql.VALUES("sex", "#{sex,jdbcType=VARCHAR}");
        }

        if (record.getBirth() != null) {
            sql.VALUES("birth", "#{birth,jdbcType=VARCHAR}");
        }

        if (record.getNation() != null) {
            sql.VALUES("nation", "#{nation,jdbcType=VARCHAR}");
        }

        if (record.getPolitics() != null) {
            sql.VALUES("politics", "#{politics,jdbcType=VARCHAR}");
        }

        if (record.getHeight() != null) {
            sql.VALUES("height", "#{height,jdbcType=VARCHAR}");
        }

        if (record.getEducation() != null) {
            sql.VALUES("education", "#{education,jdbcType=VARCHAR}");
        }

        if (record.getRecord() != null) {
            sql.VALUES("record", "#{record,jdbcType=VARCHAR}");
        }

        if (record.getRegister() != null) {
            sql.VALUES("register", "#{register,jdbcType=VARCHAR}");
        }

        if (record.getMajor() != null) {
            sql.VALUES("major", "#{major,jdbcType=VARCHAR}");
        }

        if (record.getSchool() != null) {
            sql.VALUES("school", "#{school,jdbcType=VARCHAR}");
        }

        if (record.getEnglish() != null) {
            sql.VALUES("English", "#{english,jdbcType=VARCHAR}");
        }

        if (record.getComputer() != null) {
            sql.VALUES("computer", "#{computer,jdbcType=VARCHAR}");
        }

        if (record.getExperience() != null) {
            sql.VALUES("experience", "#{experience,jdbcType=VARCHAR}");
        }

        if (record.getPhoto() != null) {
            sql.VALUES("photo", "#{photo,jdbcType=VARCHAR}");
        }

        if (record.getAddress() != null) {
            sql.VALUES("address", "#{address,jdbcType=VARCHAR}");
        }

        if (record.getTelephone() != null) {
            sql.VALUES("telephone", "#{telephone,jdbcType=VARCHAR}");
        }

        if (record.getEmail() != null) {
            sql.VALUES("email", "#{email,jdbcType=VARCHAR}");
        }

        if (record.getPostcode() != null) {
            sql.VALUES("postcode", "#{postcode,jdbcType=VARCHAR}");
        }

        if (record.getJudge() != null) {
            sql.VALUES("judge", "#{judge,jdbcType=VARCHAR}");
        }

        return sql.toString();
    }

    /**
     *
     * @mbg.generated
     */
    public String selectByExample(ResumeExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("name");
        } else {
            sql.SELECT("name");
        }
        sql.SELECT("sex");
        sql.SELECT("birth");
        sql.SELECT("nation");
        sql.SELECT("politics");
        sql.SELECT("height");
        sql.SELECT("education");
        sql.SELECT("record");
        sql.SELECT("register");
        sql.SELECT("major");
        sql.SELECT("school");
        sql.SELECT("English");
        sql.SELECT("computer");
        sql.SELECT("experience");
        sql.SELECT("photo");
        sql.SELECT("address");
        sql.SELECT("telephone");
        sql.SELECT("email");
        sql.SELECT("postcode");
        sql.SELECT("judge");
        sql.SELECT("status");
        sql.FROM("resume");
        applyWhere(sql, example, false);

        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }

        return sql.toString();
    }

    /**
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Resume record = (Resume) parameter.get("record");
        ResumeExample example = (ResumeExample) parameter.get("example");

        SQL sql = new SQL();
        sql.UPDATE("resume");

        if (record.getName() != null) {
            sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        }

        if (record.getSex() != null) {
            sql.SET("sex = #{record.sex,jdbcType=VARCHAR}");
        }

        if (record.getBirth() != null) {
            sql.SET("birth = #{record.birth,jdbcType=VARCHAR}");
        }

        if (record.getNation() != null) {
            sql.SET("nation = #{record.nation,jdbcType=VARCHAR}");
        }

        if (record.getPolitics() != null) {
            sql.SET("politics = #{record.politics,jdbcType=VARCHAR}");
        }

        if (record.getHeight() != null) {
            sql.SET("height = #{record.height,jdbcType=VARCHAR}");
        }

        if (record.getEducation() != null) {
            sql.SET("education = #{record.education,jdbcType=VARCHAR}");
        }

        if (record.getRecord() != null) {
            sql.SET("record = #{record.record,jdbcType=VARCHAR}");
        }

        if (record.getRegister() != null) {
            sql.SET("register = #{record.register,jdbcType=VARCHAR}");
        }

        if (record.getMajor() != null) {
            sql.SET("major = #{record.major,jdbcType=VARCHAR}");
        }

        if (record.getSchool() != null) {
            sql.SET("school = #{record.school,jdbcType=VARCHAR}");
        }

        if (record.getEnglish() != null) {
            sql.SET("English = #{record.english,jdbcType=VARCHAR}");
        }

        if (record.getComputer() != null) {
            sql.SET("computer = #{record.computer,jdbcType=VARCHAR}");
        }

        if (record.getExperience() != null) {
            sql.SET("experience = #{record.experience,jdbcType=VARCHAR}");
        }

        if (record.getPhoto() != null) {
            sql.SET("photo = #{record.photo,jdbcType=VARCHAR}");
        }

        if (record.getAddress() != null) {
            sql.SET("address = #{record.address,jdbcType=VARCHAR}");
        }

        if (record.getTelephone() != null) {
            sql.SET("telephone = #{record.telephone,jdbcType=VARCHAR}");
        }

        if (record.getEmail() != null) {
            sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        }

        if (record.getPostcode() != null) {
            sql.SET("postcode = #{record.postcode,jdbcType=VARCHAR}");
        }

        if (record.getJudge() != null) {
            sql.SET("judge = #{record.judge,jdbcType=VARCHAR}");
        }

        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=VARCHAR}");
        }

        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("resume");

        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("sex = #{record.sex,jdbcType=VARCHAR}");
        sql.SET("birth = #{record.birth,jdbcType=VARCHAR}");
        sql.SET("nation = #{record.nation,jdbcType=VARCHAR}");
        sql.SET("politics = #{record.politics,jdbcType=VARCHAR}");
        sql.SET("height = #{record.height,jdbcType=VARCHAR}");
        sql.SET("education = #{record.education,jdbcType=VARCHAR}");
        sql.SET("record = #{record.record,jdbcType=VARCHAR}");
        sql.SET("register = #{record.register,jdbcType=VARCHAR}");
        sql.SET("major = #{record.major,jdbcType=VARCHAR}");
        sql.SET("school = #{record.school,jdbcType=VARCHAR}");
        sql.SET("English = #{record.english,jdbcType=VARCHAR}");
        sql.SET("computer = #{record.computer,jdbcType=VARCHAR}");
        sql.SET("experience = #{record.experience,jdbcType=VARCHAR}");
        sql.SET("photo = #{record.photo,jdbcType=VARCHAR}");
        sql.SET("address = #{record.address,jdbcType=VARCHAR}");
        sql.SET("telephone = #{record.telephone,jdbcType=VARCHAR}");
        sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        sql.SET("postcode = #{record.postcode,jdbcType=VARCHAR}");
        sql.SET("judge = #{record.judge,jdbcType=VARCHAR}");
        sql.SET("status = #{record.status,jdbcType=VARCHAR}");

        ResumeExample example = (ResumeExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, ResumeExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }

        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }

        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }

                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }

                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }

        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}
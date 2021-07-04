package com.ctsi.repository;

import com.ctsi.domain.Resume;
import com.ctsi.domain.ResumeExample;
import com.ctsi.ssdc.repository.BaseRepository;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * @author ctsi-biyi-generator
 */
@Mapper
public interface ResumeRepository extends BaseRepository<Resume, Integer, ResumeExample> {
    /**
     *
     * @mbg.generated
     */
    @SelectProvider(type=ResumeSqlProvider.class, method="countByExample")
    long countByExample(ResumeExample example);

    /**
     * @mbg.generated
     */
    @DeleteProvider(type = ResumeSqlProvider.class, method = "deleteByExample")
     int deleteByExample(ResumeExample example);

    /**
     *
     * @mbg.generated
     */
    @Insert({
            "insert into resume (id,name, sex, ",
            "birth, nation, politics, ",
            "height, education, ",
            "record, register, ",
            "major, school, english, ",
            "computer, experience, ",
            "photo, address, ",
            "telephone, email, ",
            "postcode, judge,status)",
            "values  (#{id,jdbcType=VARCHAR},#{name,jdbcType=VARCHAR}, #{sex,jdbcType=VARCHAR}, ",
            "#{birth,jdbcType=VARCHAR}, #{nation,jdbcType=VARCHAR}, #{politics,jdbcType=VARCHAR}, ",
            "#{height,jdbcType=VARCHAR}, #{education,jdbcType=VARCHAR}, ",
            "#{record,jdbcType=VARCHAR}, #{register,jdbcType=VARCHAR}, ",
            "#{major,jdbcType=VARCHAR}, #{school,jdbcType=VARCHAR}, #{english,jdbcType=VARCHAR}, ",
            "#{computer,jdbcType=VARCHAR}, #{experience,jdbcType=VARCHAR}, ",
            "#{photo,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR}, ",
            "#{telephone,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
            "#{postcode,jdbcType=VARCHAR}, #{judge,jdbcType=VARCHAR},#{status,jdbcType=VARCHAR})"
    })
    int insert(Resume record);

    /**
     *
     * @mbg.generated
     */
    @InsertProvider(type=ResumeSqlProvider.class, method="insertSelective")
    int insertSelective(Resume record);

    /**
     *
     * @mbg.generated
     */
    @SelectProvider(type=ResumeSqlProvider.class, method="selectByExample")
    @Results({
            @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
            @Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
            @Result(column="birth", property="birth", jdbcType=JdbcType.VARCHAR),
            @Result(column="nation", property="nation", jdbcType=JdbcType.VARCHAR),
            @Result(column="politics", property="politics", jdbcType=JdbcType.VARCHAR),
            @Result(column="height", property="height", jdbcType=JdbcType.VARCHAR),
            @Result(column="education", property="education", jdbcType=JdbcType.VARCHAR),
            @Result(column="record", property="record", jdbcType=JdbcType.VARCHAR),
            @Result(column="register", property="register", jdbcType=JdbcType.VARCHAR),
            @Result(column="major", property="major", jdbcType=JdbcType.VARCHAR),
            @Result(column="school", property="school", jdbcType=JdbcType.VARCHAR),
            @Result(column="english", property="english", jdbcType=JdbcType.VARCHAR),
            @Result(column="computer", property="computer", jdbcType=JdbcType.VARCHAR),
            @Result(column="experience", property="experience", jdbcType=JdbcType.VARCHAR),
            @Result(column="photo", property="photo", jdbcType=JdbcType.VARCHAR),
            @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
            @Result(column="telephone", property="telephone", jdbcType=JdbcType.VARCHAR),
            @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
            @Result(column="postcode", property="postcode", jdbcType=JdbcType.VARCHAR),
            @Result(column="judge", property="judge", jdbcType=JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR)
    })
    List<Resume> selectByExample(ResumeExample example);

    /**
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ResumeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Resume record, @Param("example") ResumeExample example);

    /**
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ResumeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Resume record, @Param("example") ResumeExample example);
}
package com.forest.basic.mybatis.dao;

import com.forest.basic.mybatis.model.Trole;
import com.forest.basic.mybatis.model.Tusertrole;
import com.forest.basic.mybatis.model.TusertroleExample;
import com.forest.basic.vo.config.auth.VORole;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TusertroleMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tusertrole
	 * @mbggenerated
	 */
	int countByExample(TusertroleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tusertrole
	 * @mbggenerated
	 */
	int deleteByExample(TusertroleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tusertrole
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Long cid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tusertrole
	 * @mbggenerated
	 */
	int insert(Tusertrole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tusertrole
	 * @mbggenerated
	 */
	int insertSelective(Tusertrole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tusertrole
	 * @mbggenerated
	 */
	List<Tusertrole> selectByExample(TusertroleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tusertrole
	 * @mbggenerated
	 */
	Tusertrole selectByPrimaryKey(Long cid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tusertrole
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") Tusertrole record,
			@Param("example") TusertroleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tusertrole
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") Tusertrole record,
			@Param("example") TusertroleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tusertrole
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Tusertrole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tusertrole
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Tusertrole record);

	// add
 	int countRoleList(VORole role);

 	List<Trole> queryRoleList(VORole role);
}
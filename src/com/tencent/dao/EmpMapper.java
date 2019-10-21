package com.tencent.dao;

import java.util.List;
import java.util.Map;

import com.tencent.pojo.Emp;

public interface EmpMapper {
	
	/**
	 * 查询
	 * @param empno
	 * @return
	 */
	//<select id="selectEmpByEmpno" parameterType="int" resultType="emp">
	public Emp selectEmpByEmpno(int empno);
	
	//组合查询：返回List<Emp> <select id="selectEmps" parameterType="com.tencent.pojo.Emp" resultType="com.tencent.pojo.Emp">
	public List<Emp> selectEmps(Emp emp);
	
	//组合查询:返回List<Map<String,Object>>
	//<select id="selectEmpsMap" parameterType="com.tencent.pojo.Emp" resultType="java.util.Map">
	public List<Map<String,Object>> selectEmpsMap(Emp emp);
	
	
	/**
	 * 新增
	 */
	//<insert id="insertEmp" parameterType="com.tencent.pojo.Emp">
	public int insertEmp(Emp emp);
	
	/**
	 * 修改
	 */
	//<update id="updateEmp" parameterType="com.tencent.pojo.Emp">
	public int updateEmp(Emp emp);
	
	/**
	 * 删除
	 */
	//<delete id="deleteEmp" parameterType="int">
	public int deleteEmp(int empno);
	
}

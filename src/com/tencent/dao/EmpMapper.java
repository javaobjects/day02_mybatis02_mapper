package com.tencent.dao;

import com.neuedu.pojo.Emp;

public interface EmpMapper {
	
	/**
	 * 查询
	 * @param empno
	 * @return
	 */
	//<select id="selectEmpByEmpno" parameterType="int" resultType="emp">
	public Emp selectEmpByEmpno(int empno);
	
	/**
	 * 新增
	 */
	//<insert id="insertEmp" parameterType="com.neuedu.pojo.Emp">
	public int insertEmp(Emp emp);
	
	/**
	 * 修改
	 */
	//<update id="updateEmp" parameterType="com.neuedu.pojo.Emp">
	public int updateEmp(Emp emp);
	
	/**
	 * 删除
	 */
	//<delete id="deleteEmp" parameterType="int">
	public int deleteEmp(int empno);
	
}

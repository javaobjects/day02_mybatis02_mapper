package com.neuedu.test;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neuedu.pojo.Emp;
import com.tencent.dao.EmpMapper;

public class Test {

	public static void main(String[] args) throws IOException {
		//1.获取SqlSessionFactory接口
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("sqlMapConfig.xml"));
		
		//2.获取SqlSession接口
		SqlSession session = factory.openSession();
		
		//3.基于接口获取代理对象
		EmpMapper empDao = session.getMapper(EmpMapper.class);
		
		//查询
		//Emp emp = empDao.selectEmpByEmpno(7788);
		//System.out.println(emp);
		
		//新增
		Emp emp = new Emp(0, "张三", "程序员");
		System.out.println("新增结果：" + empDao.insertEmp(emp));
		System.out.println("参数emp:" + emp);//Emp [empno=6, ename=张三, job=程序员]

		//修改
		//Emp emp = new Emp();
		//emp.setEmpno(1111);
		//emp.setEname("张三2号");
		//System.out.println("修改结果：" + empDao.updateEmp(emp));
		
		//删除
		//System.out.println("删除结果：" + empDao.deleteEmp(1111));
		
		//提交事务
		session.commit();
	}

}

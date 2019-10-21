package com.tencent.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.tencent.dao.EmpMapper;
import com.tencent.pojo.Emp;

public class Test {

	public static void main(String[] args) throws IOException {
		//1.获取SqlSessionFactory接口
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("sqlMapConfig.xml"));
		
		//2.获取SqlSession接口
		SqlSession session = factory.openSession();
		
		//3.基于接口获取代理对象
		EmpMapper empDao = session.getMapper(EmpMapper.class);
//		DeptMapper deptDao = session.getMapper(DeptMapper.class);
		//查询
		//Emp emp = empDao.selectEmpByEmpno(7788);
		//System.out.println(emp);
		
		//组合查询 : 返回List<Emp>
//		Emp emp = new Emp();
		//emp.setEmpno(7788);
//		emp.setEname("S");
//		emp.setJob("C");
//		List<Emp> empList = empDao.selectEmps(emp);		
//		for (Emp emp2 : empList) {
//			System.out.println(emp2);
//		}
		
		//组合查询: 返回List<Map<String,Object>>
//		List<Map<String,Object>> jobList = empDao.selectEmpsMap(emp);
//		for (Map<String, Object> jobInfo : jobList) {
//			System.out.println(jobInfo);
//		}
		
		//单参数：Integer[] empnos
		Integer[] empnos = new Integer[] {1111,7788,7839,2};
		List<Emp> empList = empDao.selectEmpsByArray(empnos);
		for (Emp emp : empList) {
			System.out.println(emp);
		}
		
		
		//新增
//		Emp emp = new Emp(0, "张三", "程序员");
//		System.out.println("新增结果：" + empDao.insertEmp(emp));
//		System.out.println("参数emp:" + emp);//Emp [empno=6, ename=张三, job=程序员]

		//修改
		//Emp emp = new Emp();
		//emp.setEmpno(1111);
		//emp.setEname("张三2号");
		//System.out.println("修改结果：" + empDao.updateEmp(emp));
		
		//删除
		//System.out.println("删除结果：" + empDao.deleteEmp(1111));
		
		//提交事务
//		session.commit();
	}

}

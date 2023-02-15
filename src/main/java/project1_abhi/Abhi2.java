package project1_abhi;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.EmpliyeeDao;
import dto.Employee;

public class Abhi2 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
      String s1 = req.getParameter("empid");
      int empid=Integer.parseInt(s1);
      
      String s2 = req.getParameter("empname");
//      System.out.println(s1);
//      res.getWriter().print(s1);
      
      Employee employee=new Employee();
      employee.setEmpid(empid);
      employee.setEmpname(s2);
      
      EmpliyeeDao empliyeeDao=new EmpliyeeDao();
      empliyeeDao.insert(employee);
	}
}

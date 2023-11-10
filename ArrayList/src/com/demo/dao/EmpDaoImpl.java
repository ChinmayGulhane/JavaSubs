package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;

public class EmpDaoImpl implements EmpDao {
	static List<Employee> elist;
    static {
   	elist=new ArrayList<>();
		elist.add(new SalariedEmp(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345));
		elist.add(new SalariedEmp(13,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
		elist.add(new ContractEmployee(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
		elist.add(new ContractEmployee(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
    }
	public void save(Employee e) {
		elist.add(e);
	
	}

}
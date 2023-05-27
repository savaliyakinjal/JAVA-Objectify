package com.myproject.dao;


import static com.googlecode.objectify.ObjectifyService.ofy;

import com.googlecode.objectify.Objectify;
import com.myproject.model.Employee;
import com.myproject.objectify.OfyFactory;

public class EmpDaoImpl implements EmpDao {
	
//	@Autowired
//	OfyFactory ofyFactory;

	@Override
	public void addEmp(Employee e) {
		System.out.println("e :"+e);
		// TODO Auto-generated method stub
		System.out.println("In EmpDaoImpl......");
		Objectify ofy = OfyFactory.init();
		ofy.transact(() -> {
			System.out.println("In Transact....");
			Employee employee = new Employee();
			System.out.println("Emp :"+employee);
			ofy.save().entity(employee).now();
			System.out.println("Save Done");
		});

		System.out.println("In EmpDaoImpl......");
	}

}

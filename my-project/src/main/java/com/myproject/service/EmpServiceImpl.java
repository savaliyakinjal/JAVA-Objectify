package com.myproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.dao.EmpDao;
import com.myproject.model.Employee;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmpDao empDao;
	
	@Override
	public void addEmp(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("In EmpServiceImpl......");
		empDao.addEmp(employee);
		System.out.println(" EmpServiceImpl......");
	}

}

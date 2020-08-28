package controller;

import dao.iEmployeeDao;
import daoimpl.EmployeeDaoImpl;
import model.Employee;

public class EmployeeController {

	iEmployeeDao empDao;
	public EmployeeController() {
		empDao=new EmployeeDaoImpl();
	}
	public void addEmployee(Employee emp) {
		empDao.addEmployee(emp);
	}

}

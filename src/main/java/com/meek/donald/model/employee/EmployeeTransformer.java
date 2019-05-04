package com.meek.donald.model.employee;

import com.meek.donald.model.employee.Employee;
import com.meek.donald.model.employee.EmployeeModel;

public class EmployeeTransformer {

	public static Employee transformEmployeeModel(EmployeeModel emplModel) {
		Employee employee = new Employee();
		employee.setAddr(emplModel.getAddress());
		employee.setDept(emplModel.getDept());
		employee.setEmplid(emplModel.getEmplId());
		employee.setEmplsNum(emplModel.getEmployeeCount());
		employee.setName(emplModel.getName());
		employee.setSoch(emplModel.getSoch());
		return employee;
	}
	
	public static EmployeeModel transformEmployee(Employee empl) {
		EmployeeModel employee = new EmployeeModel();
		employee.setAddress(empl.getAddr());
		employee.setDept(empl.getDept());
		employee.setEmplId(empl.getEmplid());
		employee.setEmployeeCount(empl.getEmplsNum());
		employee.setName(empl.getName());
		employee.setSoch(empl.getSoch());
		return employee;
	}
}

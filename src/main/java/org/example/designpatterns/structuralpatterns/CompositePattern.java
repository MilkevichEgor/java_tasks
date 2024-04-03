package org.example.designpatterns.structuralpatterns;

import java.util.ArrayList;
import java.util.List;

public class CompositePattern {
  public static void main(String[] args) {
	Employee ceo = new IndividualEmployee("Alice", "CEO");

	Employee manager1 = new IndividualEmployee("Bob", "Manager");
	Employee manager2 = new IndividualEmployee("Charlie", "Manager");

	Department hrDepartment = new Department("HR Department");
	hrDepartment.addEmployee(manager1);
	hrDepartment.addEmployee(manager2);

	Department engineeringDepartment = new Department("Engineering Department");
	Employee engineer1 = new IndividualEmployee("David", "Software Engineer");
	Employee engineer2 = new IndividualEmployee("Eve", "Software Engineer");
	engineeringDepartment.addEmployee(engineer1);
	engineeringDepartment.addEmployee(engineer2);

	Department organization = new Department("Organization");
	organization.addEmployee(ceo);
	organization.addEmployee(hrDepartment);
	organization.addEmployee(engineeringDepartment);

	organization.showDetails();
  }
}

interface Employee {
  void showDetails();
}

class IndividualEmployee implements Employee {
  private String name;
  private String position;

  public IndividualEmployee(String name, String position) {
	this.name = name;
	this.position = position;
  }

  @Override
  public void showDetails() {
	System.out.println("Employee: " + name + ", Position: " + position);
  }
}

class Department implements Employee {
  private String name;
  private List<Employee> employees = new ArrayList<>();

  public Department(String name) {
	this.name = name;
  }

  public void addEmployee(Employee employee) {
	employees.add(employee);
  }

  @Override
  public void showDetails() {
	System.out.println("Department: " + name);
	for (Employee employee : employees) {
	  employee.showDetails();
	}
  }
}
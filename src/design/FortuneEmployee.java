package design;

import databases.ConnectToSqlDB;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		EmployeeInfo emp1 = new EmployeeInfo(001);
		EmployeeInfo emp2 = new EmployeeInfo("John", 002);
		EmployeeInfo emp3 = new EmployeeInfo("Mike", 003, 25);

		EmployeeInfo.nestedclass nested = emp3.new nestedclass();
		nested.nestedMethod();

		emp2.setName("Amazon");
		System.out.println(emp2.getName());

		EmployeeInfo.calculateEmployeeBonus(1000, 8);
		EmployeeInfo.calculateEmployeePension(2000);

		ConnectToSqlDB connection = new ConnectToSqlDB();
		connection.insertProfileToSqlTable("employees", "column1", "column2");




	}

}

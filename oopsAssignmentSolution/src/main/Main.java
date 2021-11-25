package main;

import department.AdminDepartment;
import department.HrDepartment;
import department.TechDepartment;

/**
 * Below class is used for calling methods inside different
 * departments like Admin, HR, Technical and print message given inside
 * methods.
 * @author krishnendra 
 */
public class Main {
	private static String welcomeMessage = "Welcome to ";

	public static void main(String[] args) {
		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();
		AdminDepartment adminDepartment = new AdminDepartment();

		display(welcomeMessage + adminDepartment.departmentName());
		display(adminDepartment.getTodaysWork());
		display(adminDepartment.getWorkDeadline());
		display(adminDepartment.isTodayAHoliday() + "\n");

		display(welcomeMessage + hrDepartment.departmentName());
		display(hrDepartment.doActivity());
		display(hrDepartment.getTodaysWork());
		display(hrDepartment.getWorkDeadline());
		display(hrDepartment.isTodayAHoliday() + "\n");

		display(welcomeMessage + techDepartment.departmentName());
		display(techDepartment.getTodaysWork());
		display(techDepartment.getWorkDeadline());
		display(techDepartment.getTechStackInformation());
		display(techDepartment.isTodayAHoliday() + "\n");
	}

	/**
	 * Below method is used for displaying message which is passed to method. 
	 * @param showText is the message which will be printed after running the program.
	 */
	private static void display(String showText) {
		System.out.println(showText);
	}

}

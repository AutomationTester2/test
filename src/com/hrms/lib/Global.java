package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	//Test Data
	public String url="http://127.0.0.1/orangehrm-2.6/login.php";
	public String un="admin";
	public String pw="admin";
	public String code="005";
	public String Lname="abc";
	public String Fname="xyz";
	public String EmpId="005";
	
	//objects
	public String txt_loginname="txtUserName";
	public String txt_password="txtPassword";
	public String btn_login="Submit";
	public String link_logout="Logout";
	public String welcome_txt="//*[@id=\"option-menu\"]/li[1]" ;
	public String Menu="PIM";
	public String link_AddEmp="Add Employee";
	public String link_EmpList="Employee List";
	public String select_dd="loc_code";
	public String Eid="loc_name";
	public String search_Eid="//*[@id=\"standardView\"]/div[2]/input[2]";
	public String Check_Box="chkLocID[]";
	public String DelEmp="//input[@value='Delete']";
	public String Empcode="//*[@id=\\\"txtEmployeeId\\" ;
	public String txt_Lname="txtEmpLastName";
	public String txt_Fname="txtEmpFirstName";
	public String btn_save="//*[@id=\"btnEdit\"]";
	
}

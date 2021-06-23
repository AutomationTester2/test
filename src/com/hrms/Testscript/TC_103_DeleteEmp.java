package com.hrms.Testscript;


import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_103_DeleteEmp {

	//public static void main(String[] args) throws Exception {
	@Test
	public void tc_103() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General g=new General();
		g.openapplication();
		g.login();
		g.MenuNavigate2();
		g.SearchEmp();
		g.DeleteEmp();
		g.closeapplication();

	}

}

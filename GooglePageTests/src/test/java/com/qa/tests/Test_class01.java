package com.qa.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test_class01 {

	public static void main(String[] args) {

		Logger log = LogManager.getLogger(Test_class01.class);
		log.info("This is my Testcase info");
		log.error("this is my error");
		log.warn("warn");

	}

}

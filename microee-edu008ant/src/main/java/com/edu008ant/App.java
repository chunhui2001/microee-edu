package com.edu008ant;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class App {

    static Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
        BasicConfigurator.configure();
		logger.info("Hello World....");
	}

}
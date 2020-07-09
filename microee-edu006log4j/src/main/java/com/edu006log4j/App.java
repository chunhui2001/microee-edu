package com.edu006log4j;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args)  {
        logger.info("Hello log4j");
    }
}
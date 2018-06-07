package com.boraji.tutorial.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainApp {

   private static final Logger logger = LogManager.getLogger(MainApp.class);

   public static void main(String[] args) {

      for(int i = 0; i <10000; i++){

      logger.info("Hello Log4j2...");
      }
      logger.info("job done.....");
      
   }
}

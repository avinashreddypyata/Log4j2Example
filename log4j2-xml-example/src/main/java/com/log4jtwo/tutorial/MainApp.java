package com.log4jtwo.tutorial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// TODO: Auto-generated Javadoc
/**
 * The Class MainApp for Using the Log4j2 using XML Configuration File.
 */
public class MainApp {
	
	

   /** The Constant logger. */
   private static final Logger logger = LogManager.getLogger(MainApp.class);

   /**
    * The main method showing the implementation of Log Files
    *
    * @param args the arguments
    */
   public static void main(String[] args) {

      for(int i = 0; i <10000; i++){

      logger.info("Hello Log4j2...");
      }
      logger.info("job done.....");
      
   }
}

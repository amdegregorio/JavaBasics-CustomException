/**
 * 
 */
package com.amydegregorio.javabasics.customexception;

/**
 * @author AMD
 *
 */
public class CustomExceptionExample {

   /**
    * @param args
    */
   public static void main(String[] args) {

     CustomExceptionExample example = new CustomExceptionExample();
     String username = "admin";
     String password = "I'm a fake password";
     try {
        System.out.println("Attempting login as " + username);
        example.attemptDummyLogin(username, password);
     } catch (AutoLoggingSecurityException e) {
        //This is auto logging exception - so what we'd really like to do here is make sure
        //user is given a message and maybe another chance.
     }

   }
   
   public void attemptDummyLogin(String username, String password) throws AutoLoggingSecurityException {
      throw new AutoLoggingSecurityException("Invalid username or password for " + username);
   }
}

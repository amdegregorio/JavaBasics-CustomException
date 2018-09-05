/**
 * 
 */
package com.amydegregorio.javabasics.customexception;

/**
 * Exception meant for use in security situations that automatically logs
 * when thrown.
 * 
 * @author Amy DeGregorio
 *
 */
public class AutoLoggingSecurityException extends Exception {

   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   /**
    * Constructs a new AutoLoggingSecurity exception with the message and cause provided.
    * The message is then written to the log.
    * 
    * @param message
    * @param cause
    */
   public AutoLoggingSecurityException(String message, Throwable cause) {
      super(message, cause);
      System.out.println("SECURITY EXCEPTION: " + message);
   }

   /**
    * Constructs a new AutoLoggingSecurity exception with the message provided.
    * The message is then written to the log.
    * 
    * @param message
    */
   public AutoLoggingSecurityException(String message) {
      super(message);
      System.out.println("SECURITY EXCEPTION: " + message);
   }

   /**
    * Constructs a new AutoLoggingSecurity exception with the cause provided.
    * If the cause is not null then it's message is then written to the log.
    * 
    * @param cause
    */
   public AutoLoggingSecurityException(Throwable cause) {
      super(cause);
      if (cause != null) {
         System.out.println("SECURITY EXCEPTION: " + cause.getMessage());
      }
   }

   /**
    * Constructs a new AutoLoggingSecurity exception with the values provided.
    * The message is then written to the log.
    * 
    * @param message
    * @param cause
    * @param enableSuppression
    * @param writableStackTrace
    */
   public AutoLoggingSecurityException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
      super(message, cause, enableSuppression, writableStackTrace);
      System.out.println("SECURITY EXCEPTION: " + message);
   }  
   

}

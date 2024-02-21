package com.exception;


		// TODO Auto-generated method stub
		
		
		/*  EXCEPTION
		    ----------
		 * run time error is known as EXCEPTION
		  
		 * The root class of the Java Exception hierarchy is java.lang.Throwable.
		
		  There are 2 types of exception:
		  -------------------------------
		  1.CHECKED EXCEPTION
		  2.UNCHECKED EXCEPTION
		  
		  1.CHECKED EXCEPTION:
		  ----------------------
		 *  A class directly inherits the throwable class except runtimeException  and error.
		 *  Checked exceptions are checked at compile-time.
		  
		 * example:
		  IOException, SQLException, etc.
		  
		 
		
		2.UNCHECKED EXCEPTION :
	    ------------------------
	    * A classes inherits the runtimeException is known as unchecked exception
		* Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
		
		* example:
		  ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.
		
		 
		 Java provides five keywords that are used to handle the exception:
		 ------------------------------------------------------------------
		 1.try
		 2.catch
		 3.finally
		 4.throw
		 5.throws
		 
		 
		 1. try : Encloses the suspected code where an exception might be occur.
		 
		 2. catch : *  it execute after the try block
		            *  It Acts as an exception handler
		            *  You can use multiple catch block with a single try block
		            
		 3. finally: * it execute after the try-catch block
		             * it Contains code that always executes.
		             .
		 
		 4. throw : The "throw" keyword is used to throw an exception.
		 
		 5.throws : The "throws" keyword is used to declare exceptions
		 
		*/
		
public class ExceptionEx {

	public static void main(String[] args) {
		
	/*	String a1=null;
		System.out.println(a1.length()); // nullpointerException
	*/
		
    /*		String s="abc";  
		    int i=Integer.parseInt(s);//NumberFormatException 
	*/
		
	/*	int c[]=new int[5];  
		c[0]=89; //ArrayIndexOutOfBoundsException  
		System.out.println(c[1]);	
	*/	
		
		try {
		int a=100/0;
		}catch(ArithmeticException e){
			System.out.println(e);	
		}
		System.out.println("reset the code.....");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}


///// JAVA Class 10 part 3.a: on May 27, 2023, Saturday with Instructor AP ////


package nb_cl10_ExceptionHandlingError_pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class nb_cl10notes_exceptionHandlingA {

	
	// Example of error/exception handling:
		// Exception in thread "main" java.lang.ArithmeticException: / by zero at nb_cl10_ExceptionHandlingError_pkg.nb_cl10notes_exceptionHandlingA.main(nb_cl10notes_exceptionHandlingA.java:26)
			//above will tell you where and what kind of error is happening like....arithmetic error at packageName.CLASSname.methodName (ClassName.java:lineNumber)
		// Two types:
			// 1. UnChecked Exception: it is when the program doesn't know what inputs we are going to give it ..the problem is not in your code, but only while inserting the value into the argument...more of a logical error..like try and catch concept
					// it not the issue in the syntax, but because of your input's result
			// 2. Checked Exception: These are errors that show up in the compiling time...
					// like syntax error, error with the file path, arithmetic error, etc. 
	
	// Try and Catch Concept of exception handling: 
		// try{whatever you are wanting to test goes here}  
				// -->  try does not have any argument..but has just the body
		// catch(exceptionCode e(variableName)){coding scripts like syso with print statement}  
				// --> catch has both argument and body
		 
		
	// IQA 1: What is the importance of finally block?
		// ==> Finally {} block: its importance is no matter what happens to my code, I will execute the final block for sure. 
			// --> its got only body like if statement
	
	// IQA 2: Can you have try or catch or finally block by itself?
		// No, you cannot have them by themselves or it depends:
			// you can have try and finally by itself without catch
			// you can also have try and catch only and no have finally statement
			// but finally needs if statement for sure
	
	// IQA 3: How would you explain the use of try and catch if you have used exception handling?
		// --> // What this does is if I know a particular group of code may run into a problem, I would put those code inside a try block then I need to know what kind of exceptions I would get into. 
				//The benefit is if I could catch it, my program will not halt in the middle and allow me to continue with rest of my codes
				// If there are some important codes that I need to execute no matter the result of try and catch then, I would put that inside a "finally" block.
						// Finally block will then execute that finally code despite the result from exception handling. That's how I handle exceptions 
	
	// IQA 4: What does "final" keyword do in Java?
		// ==> if used before class, that class cannot be inherited meaning any child (subclass) cannot extend to that parent (superclass) class. So the inheritance ends right there
			// if used in the method, during inheritance, that method cannot be overrided, meaning the child cannot modify while using that method.  
					// Once you declare a method final it cannot be overridden. So, you cannot modify a final method from a sub class. The main intention of making a method final would be that the content of the method should not be changed by any outsider.
			// if used in the variable then the value of that variable is now finalized, and nobody can change it to another
	
	// IQA 5: Differentiate between final, finally, and finalize?
		// --> Final keyword: deals with finalizing the value of a variable,making sure the method is not overridden, and making sure the class is not inherited. 
		// --> Finally : used with try and catch during exception handling so that it allows us to execute a piece of code no matter whether I can catch an exception or not 
		// --> Finalize : it's a method that works with garbage collection which is used to perform cleanup processing of the unused codes on an objects like the scanner's object before it is garbage collected ...
				// As an tester, I never had to use it so I am not 100% familiar. 
					// finalize() method in Java is used to release all the resources used by the object before it is deleted/destroyed by the Garbage collector. 
						// Once the clean-up activity is done by the finalize() method, garbage collector immediately destroys the Java object.
	
	// IQA 6: what are the types of exception? Explain them briefly.
			// 1. UnChecked Exception: it is when the program doesn't know what inputs we are going to give it ..the problem is not in your code, but only while inserting the value into the argument...more of a logical error..like try and catch concept
					// it is not the issue in the syntax, but because of your input's result
			// 2. Checked Exception: These are errors that show up in the compiling time...

	// IQA 7: When and how do you use throw keyword?
		// ==> throw new exceptionName(); ---> helps us to customize which exception and how you want to cause error/exception to happen on purpose even though that exception might not be even there
			// basically setting up the code in way that it crashes our code on purpose by throwing some exception
			// used to throw an exception explicitly, and can only throw a single exception at once
		// Throws: used to declare what exceptions we can throw from a method... used to declare exceptions, and can declare multiple exceptions
	
	
	
	// if our given exception happen, this code won't get a chance to run
				// without try and catch, there is not even a possibility to continue running the code in case of any exception
				// only if catch is able to catch exception then this hi code will get printed
				// if catch cannot catch the exception then it will give the exception and stop running the code right then and there. 
	// finally block allows to run the print statement despite try and catch is able to catch the exception or not
	// (Exception e ) --> Exception here is used inside the args of catch is the bigger and general set/umbrella and all the individual exceptions are the subset inside the bigger umbrella...
				// so it can capture everything inside of it then give it a vairableName like commonly used "e" for exception

	
	
	// ========= ============ ============ ========= ============ ============ ========= ============ ============
	
	
	
	
// Exercise 5:	exception handling  using Exception
	public static void main(String[] args) {
				
		Scanner s = new Scanner(System.in);
			
		try {
			System.out.println("Give me a number");
			int num1 = s.nextInt();   // 5/0 will give you error/exceptions
//			double num1 = s.nextDouble();  // 5/0 will give you infinity which is correct since it has infinite decimals
		
			System.out.println("Give me another number that I will use to divide the previous number");
			int num2 = s.nextInt();
			
			System.out.println(num1/num2);   // code that is giving the issue/error/exception goes here
				// it means I might run it a problem, but try running it. 
		}
		catch (Exception e) {  // use the biggest umbrella so it can capture everything inside of it then give it a vairableName like commonly used e for exception 
			// Exception is the bigger and general set/umbrella and all the individual exceptions are the subset inside the bigger umbrella...
			System.out.println("Some error happened! Please try again");
		}
		finally {
			System.out.println("Hi");
				// this finally block allows to run the print statement despite try and catch is able to catch the exception or not
		}	
	}
}	
	

	/*
// Exercise 4: Using the throw new keyword while handling the checked exception

	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
		// do s.close(); in order to close the object in the scanner so we can prevent memory leakage 
	
	System.out.println("Give me a number or a String");
	String a = s.nextLine();
	
	if(a.contains("e")) {
		throw new IllegalArgumentException();
		// throw new exceptionName(); ---> helps us to customize how you want to cause error/exception to happen and which error/exception
	}
	else {
		System.out.println("Hello");  // this will only gets printed if "if" above error is not found...if found then coding gets aborted right there without even making it down here
	}
	System.out.println("Bye");  // this will only gets printed if "if" exception is not found
		// "if" exception found then coding gets aborted right there without even making it down here
	}	
}
	*/
	
	/*
// Exercise 3:	exception handling using strings:
	public static void main(String[] args) {
			
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("Give me a number or a String");
			String a	 = s.nextLine();   // 5/0 will give you error/exceptions
//			double num1 = s.nextDouble();  // 5/0 will give you infinity which is correct since it has infinite decimals
			
			System.out.println("Give me another number that I will use to divide the previous number");
			String b = s.nextLine();
//			double num2 = s.nextDouble();
			
			System.out.println(a + b);
//			System.out.println(num1 + num2);
			
		}
	
		catch (InputMismatchException e) {  // copy paste the kind of exception/error from the console then give it a vairableName like commonly used e for exception 
			System.out.println("Input Mismatch! I asked for an int or a String. Give me either only");
		}
		
		finally {
			System.out.println("Hi");
			// this finally block allows to run the print statement despite try and catch is able to catch the exception or not
		}
		System.out.println("Bye");
		
		System.out.println("Hi");  // if above exception happen, this code won't get a chance to run
			// without try and catch, there is not even a possibility to continue running the code in case of any exception
			// only if catch is able to catch exception then this hi code will get printed
			// if catch cannot catch the exception then it will give the exception and stop running the code right then and there. 
	}
}
	*/
		
	/*
//// Exercise 2:	Using the finally in excpetion handling

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		try {
			System.out.println("Give me a number");
			int num1 = s.nextInt();   // 5/0 will give you error/exceptions
//			double num11 = s.nextDouble();  // 5/0 will give you infinity which is correct since it has infinite decimals
		
			System.out.println("Give me another number that I will use to divide the previous number");
			int num2 = s.nextInt();
		// Exception in thread "main" java.lang.ArithmeticException: / by zero at nb_cl10_ExceptionHandlingError_pkg.nb_cl10notes_exceptionHandlingA.main(nb_cl10notes_exceptionHandlingA.java:26)
		//above will tell you where and what kind of error is happening like....arithmetic error at packageName.CLASSname.methodName (ClassName.java:lineNumber)
//			double num22 = s.nextDouble();

//			System.out.println(num11/num22);	// it will work fine with double, but gives an exception for int
			System.out.println(num1/num2);
		
//			System.out.println(num1/num2);   // code that is giving the issue/error/exception goes here
				// it means I might run it a problem, but try running it. 	}	
		}
		catch (ArithmeticException e) {  // copy paste the kind of exception/error from the console then give it a vairableName like commonly used e for exception 
			e.printStackTrace();  // it will simply just print what and where the error/exception
			System.out.println("You cannot divide by zero. Try again with non-zero number");
		}
		catch (InputMismatchException e) {  // copy paste the kind of exception/error from the console then give it a vairableName like commonly used e for exception 
		System.out.println("Input Mismatch! I asked for an int. Give me an Integer");
		}
	
		finally {
			System.out.println("Hi");
		// this finally block allows to run the print statement despite try and catch is able to catch the exception or not
		}
		System.out.println("Bye");
		// in case exception is not caught, this above code won't get printed
	
		System.out.println("Peace");  // if above exception happen, this code won't get a chance to run
		// without try and catch, there is not even a possibility to continue running the code in case of any exception
		// only if catch is able to catch exception then this code will get printed
		// if catch cannot catch the exception then it will give the exception and stop running the code right then and there. 
	
	}
}
	*/

	/*
// Exercise 1: Handiling the unchecked exception using try and catch 
	public static void main(String[] args) {
			
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("Give me a number");
//			int num1 = s.nextInt();   // 5/0 will give you error/exceptions
			double num11 = s.nextDouble();  // 5/0 will give you infinity which is correct since it has infinite decimals
		
			System.out.println("Give me another number that I will use to divide the previous number");
//			int num2 = s.nextInt();
		// Exception in thread "main" java.lang.ArithmeticException: / by zero at nb_cl10_ExceptionHandlingError_pkg.nb_cl10notes_exceptionHandlingA.main(nb_cl10notes_exceptionHandlingA.java:26)
		//above will tell you where and what kind of error is happening like....arithmetic error at packageName.CLASSname.methodName (ClassName.java:lineNumber)
			double num22 = s.nextDouble();
		
//			System.out.println(num1/num2);	// it will work fine with double, but gives an exception for int
			System.out.println(num11/num22);
			
//			System.out.println(num1/num2);   // code that is giving the issue/error/exception goes here
				// it means I might run it a problem, but try running it. 
		}
		catch (ArithmeticException e) {  // copy paste the kind of exception/error from the console then give it a vairableName like commonly used e for exception 
			e.printStackTrace();  // it will simply just print what and where the error/exception
			System.out.println("You cannot divide by zero. Try again with non-zero number");
		}
		catch (InputMismatchException e) {  // copy paste the kind of exception/error from the console then give it a vairableName like commonly used e for exception 
			System.out.println("Input Mismatch! I asked for an int. Give me an Integer");
		}
			// its like if, else but exactly reverse meaning if has args and body Vs else doesn't have body only
			// similarly, try has body only, but catch has both args and body
			// if --> has both argument and body , VS else --> has body only
			// try --> has body only, 			   VS catch --> has both argument and body
			
	}
}
	*/



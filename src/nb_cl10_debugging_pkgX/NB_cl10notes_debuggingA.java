
///// JAVA Class 10 part 4.a: on May 27, 2023, Saturday with Instructor AP ////


package nb_cl10_debugging_pkgX;

public class NB_cl10notes_debuggingA {

	
	// Debugging: 
		// consists of breakpoint... use it to tell where to stop at the debug point
		// To access: double click or if not right click on the desired line number
		// if in case I know I made some mistake somewhere in the range of lines, I can use this option to run that breakpoint specifically before moving on to other below it
		// use this whenever you have doubts in your codes so you want to run one by one
	
	
	// Once having a breakpoint, you can click on debug button which will start running the code till it stops at the breakpoint
		// Step Into: helps to take us into line by line including into the method and explain the code in details
		// Step return: helps to exit that detailed tour and take to the next code line
		// Step Over: it will still go line by line, but if it encounters method then it will skip to not show me the line by line details of that method
	
	// IQA 1 : Do you debug? If yes, how?
		// Yes, I debug. Sometimes I use multiple breakpoints to see where I might need the breakpoint as I would have some idea which line of code might have the problem. 
			// Then starting that breakpoint, I will go into line by line to figure out what's happening and why my code is giving the output that way
	
	// IQA 2: Difference between step into and step over?
		// 1. Step into: it will take me into line by line even inside the methods
		// 2. Step over: it will take me into line by line, but if it encounter method, then it will not go inside but instead skips/go over 
		// 3. Step return: if in case I end up inside the method, and I don't want to continue, then I can stop that and go over that to the next line.
				// like the rescue team to help exit out
	
	// IQA 3: Difference between try and catch Vs debugging?
		// In try and catch, we already know we may run into exception so we use this technique to handle that exception whether it happens or not
		// Debugging is even after I use the try and catch, if I am still not getting the expected value, then this will take me into line by line and tell me what each line is doing so we know where and what wrong I am doing.....
		
	
	// Nested Loop: loop inside a loop
	
	// Nested if and else: if and else inside the if and else
	
	// Nest loop with if and else: inner loop inside a outer loop and there is if and else inside that inside loop
	
	// Flag and counter usage: 
		// flag is used for a boolean variable: if flag is true or false, do this and that...old concept like red flag stop, green flag go
		// counter: simply creating an integer value which will keep the count like how many times...basically count the iterations
		
	
	// Homework for next class on May 28, 2023, Sunday:
		// Given N - Print the multiplication matrix (12x12 if N = 12)
	
		// Download the class notes ppt from the TF community section > java> session(#) > classnotes
		// GET the free version of e-book on the community section of Section 9 or 10 under additional read

	
	
	
	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(a);
		
		int b = 55;
		System.out.println(b);
		System.out.println("=============");
		a= b++;   // this post-increment so increment happens after at the last
			// first this happens: a = b = 55... to print the new value of a
			// second this happens: b = b+1 = 55+1 = 56... to print the new value of b
		
		a1();
		System.out.println("=============");
		B.b1();
		System.out.println("=============");
		System.out.println(a);   // first this happens: a = b = 55... to print the new value of a

		System.out.println("=============");
		System.out.println(b);   // second this happens: b = b+1 = 55+1 = 56... to print the new value of b
		
		
	}

	
	public static void a1() {
		System.out.println("a1");
	}
	
	public static void a2() {
		System.out.println("a2");
	}
}

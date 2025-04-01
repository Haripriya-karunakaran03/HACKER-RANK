// https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true

//Static blocks executes only once when class gets loaded.

//SOLUTION - 1
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int B, H;   //STATIC VARIABLES
    static boolean flag;
    
    static{  //static block
        Scanner sc = new Scanner(System.in);   //USED ONLY STATIC VARIABLE INSIDE THIS STATIC BLOCK
        B = sc.nextInt();
        H = sc.nextInt();
        if(B > 0 && H > 0){
            flag = true;
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        sc.close();
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}
}

// SOLUTION - 2
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    static int B =sc.nextInt();
    static int H = sc.nextInt();
    static boolean flag = (B > 0 && H > 0);
    
    static{
        if(!flag)
	{
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    	}
    }
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}//end of main
}//end of class



/*
In Java, we can use the static keyword with a block of code that is known as a static block.
A static block can have several instructions that always run when a class is loaded into memory.
It is also known as java static initializer block because we can initialize the static variables in the static block at runtime.
A class can have any number of static blocks, The JVM executes them in the sequence in which they have been written.
The static block in a program is always executed first before any static method, non-static method, main method, or even instance block.
Suppose we want to perform some operations at the time of class loading then we should use the static block.

NOTE:  The static block always executes only one time when a class is loaded into memory.

We can create a static block only at the class level. We can’t create a static block inside a method or constructor.
The static block can contain only those code that belongs to static. It means we can’t use any non-static code here. 
In a static block, we can initiate the values of the static block and we can also invoke the static method. Because the static method is bound to the class instead of the object.

eg:

The static block only gets called once, when the class itself is initialized, no matter how many objects of that type you create.

public class Test {
    static{                 //static block
        System.out.println("Static");
    }

    {     //normal block
        System.out.println("Non-static block");
    }

    public static void main(String[] args) {
        Test t = new Test();
        Test t2 = new Test();
    }
}

o/p:
Static
Non-static block
Non-static block
*/

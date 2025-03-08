/*
Link: https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true
*/

//First method
import java.util.*;
import java.io.*;
class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE){
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere."); //the error will occur when the value is not appropriate for long input since long can have byte,short,int,long.
            }
        }
    }
}

//Second method:
import java.util.*;
import java.io.*;
class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x >= -(Math.pow(2, 7)) && x <= (Math.pow(2, 7)-1)){ //Range of Byte : -128 to 127 and here we used pow to find the value. -(Math.pow(2, 7) - Since Byte is signed 
                    System.out.println("* byte");
                }
                if(x >= -(Math.pow(2,15)) && x <= (Math.pow(2, 15)-1)){
                    System.out.println("* short");
                }
                if(x >= -(Math.pow(2, 31)) && x <= (Math.pow(2, 31)-1)){
                    System.out.println("* int");
                }
                if(x >= -(Math.pow(2, 63)) && x <= (Math.pow(2, 63)-1)){
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}

/*
Datatypes in java like int, short...are signed,meaning they can store both positive and negative numbers.
So we used unary operator(-) here : x >= -(Math.pow(2, 7)).

Also, the ranges for byte is -128 to 127...if it is pow(2,7) means the value is 128 so we need to -1 to get max value as 127.
For byte ---> 8 bits, so we need to power 2 with 7(N-1) where N is the number of Byte.

Same like all the integer datatypes like byte,short,int and long.
A signed integer of N bits has a range of:
-(pow(2,N-1)) to (pow(2,N-1)-1)

Byte(8 bits) - pow(2,7)          range : −128 to 127
Short(16 bits) - pow(2,15)       range : −32,768 to 32,767
Integer(32 bits) - pow(2,31)     range : −2,147,483,648 to 2,147,483,647
Long(64 bits) - pow(2,63)        range : −9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
*/




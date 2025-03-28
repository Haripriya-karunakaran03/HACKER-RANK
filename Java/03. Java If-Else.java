/*
In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. 
An if-else statement has the following logical flow:

Wikipedia if-else flow chart
Source: Wikipedia

Task
Given an integer, , perform the following conditional actions:
If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format
A single line containing a positive integer.

Output Format
Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0
3
Sample Output 0
Weird

Sample Input 1
24
Sample Output 1
Not Weird
*/

import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        //6 <= N <= 20 - THIS ONE IS AVAILABLE ONLY IN PYTHON
        
        if(N % 2 != 0){
            System.out.println("Weird");
        }
        if(N % 2 == 0){
            if(N >= 2 && N <= 5){
                System.out.println("Not Weird");
            }
            else if(N >= 6 && N <= 20){
                System.out.println("Weird");
            }
            else{
                System.out.println("Not Weird");
            }
        }
        sc.close();
    }
}

//Second solution

import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        String result = "";
        
        if(N % 2 != 0){
            result = "Weird";
        }
        
        else{
            if(N >= 2 && N <= 5){
                result = "Not Weird";
            }
            else if(N >= 6 && N <= 20){
                result = "Weird";
            }
            else{
                result = "Not Weird";
            }
        }
        System.out.println(result);
        sc.close();
    }
}


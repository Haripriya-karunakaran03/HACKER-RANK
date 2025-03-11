/* Link : https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true

End-of-file can be defined in many ways:
  If it is a manual input means if we click "ctrl + d" it means end of file. During this time, hasNext() gets false and ending loop.
HASNEXT IS A METHOD FROM SCANNER CLASS WHICH HELPS TO FIND IF THERE IS ANY MORE INPUT WE HAVE.

Scenario	                     |            How EOF Happens
Manual Input (Keyboard)	       |      Press Ctrl+D (Mac/Linux) or Ctrl+Z (Windows)
Reading a File	               |      EOF is reached when the last line is read
Command Line Redirection	     |      EOF happens automatically when the input file ends
Network Input (Socket/Stream)	 |      EOF occurs when the connection is closed

What is hasNext()?
 - hasNext() is a method in Scanner that checks if more input is available.
 - If there’s more input, it returns true.
 - If no input is left (EOF reached), it returns false, and the loop stops.

FLOW OF PROGRAM:
Step	                            |             What Happens?
Scanner is created	              |     Program waits for input
User enters a line	              |     hasNext() is true, so it reads and prints the line
User enters another line	        |   hasNext() is still true, so it continues
User presses EOF (Ctrl+D/Ctrl+Z)	|   hasNext() becomes false, loop stops
Program exits	                    |     Scanner is closed
*/

// WAY - 1
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Line;
        
        int i = 1;
        while(sc.hasNext()){
            Line = sc.nextLine();
            if(Line.contains("end-of-file")){
                System.out.println(i + " " + Line);
                break;
            }
            else{
                System.out.println(i + " " + Line);
                i++;
            }
        }
        sc.close();
    }
}

//WAY - 2
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Line;
        int i = 1;
        
        while(sc.hasNext()){   // step 1
            Line = sc.nextLine(); //step 2 - if any input has been entered means it will be true or if user click "ctrl + d" means end of file so loop will become false
            System.out.println(i + " " + Line);
            i++;
        }
        sc.close();
    }
}

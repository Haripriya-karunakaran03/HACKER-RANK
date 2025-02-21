"""
Link: https://www.hackerrank.com/challenges/python-print/problem?isFullScreen=true

The included code stub will read an integer, n, from STDIN.
Without using any strings methods, try to print the following: 123……..n

Note that “…..” represents the consecutive values in between.

Example
n = 5
Print the string 12345.

Input Format
The first line contains an integer n.

Constraints
1 ≤ n ≤ 150

Output Format
Print the list of integers from 1 through n as a string, without spaces.

Sample Input 0
3
Sample Output 0
123
"""

if __name__ == '__main__':
    n = int(input())
    for i in range(1,n + 1):
        print(i,end = "")

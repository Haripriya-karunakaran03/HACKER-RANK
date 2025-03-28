https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list/problem?isFullScreen=true

"""
Given the participants' score sheet for your University Sports Day, you are required to find the runner-up `n` score. You are given  scores. Store them in a list and find the score of the runner-up.

Input Format
The first line contains `n`. The second line contains an array `A[]`  of `n` integers each separated by a space.

Constraints
2 <= n <= 10
-100 <= A[i] <= 100

Output Format
Print the runner-up score.

Sample Input :
5
2 3 6 6 5

Sample Output :
5
  
Explanation
Given list is `[2,3,6,6,5]`. The maximum score is 6, second maximum is 5. Hence, we print 5 as the runner-up score.
"""

Solution - 1
  if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split()) # map helps to perform something to each element. Here, the values which we are going to enter should be int.
    
    Unique_arr = set(arr)  # to remove the duplicate values, we are using set
    Second = sorted(Unique_arr, reverse = True) # sorted function is only for set and reverse helps to sort in descending order
    print(Second[1])

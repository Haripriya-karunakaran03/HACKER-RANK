"""
Suppose we have a tuple. There are few numbers are present. We have to find the hash value of this tuple by using hash() function. 
This is a built-in function. 
The hash() function can work on some datatypes like int, float, string, tuples etc, but some types like lists are not hashable. 
As lists are mutable in nature, we cannot hash it. 
This hash value is used to map other values when we use dictionary.
"""

'''
Task 
You are given an integer, NN, on a single line. The next line contains NN space-separated integers. 
Create a tuple, TT, of those NN integers, then compute and print the result of hash(TT).

Note: hash() is one of the functions in the __builtins__ module.

Input Format
The first line contains an integer, NN (the number of elements in the tuple). 
The second line contains NN space-separated integers describing TT.

Output Format
Print the result of hash(TT).

Sample Input
2
1 2

Sample Output
3713081631934410656
'''

#1
if __name__ == '__main__':
    n = int(input())
    integer_list = map(int, input().split()) # input will look like [1,2,3]
    t = tuple(integer_list) #hash will work only for immutable datatypes
    print(hash(t))

#2
ele = input().split()  # since split() is for strings so either we can use map to convert elements into int or we can do that later
l = []
for i in range(0,len(ele)):
     l.append(int(ele[i]))
print(hash(tuple(l)))

#3
print(hash(tuple(map(int,input().split()))))

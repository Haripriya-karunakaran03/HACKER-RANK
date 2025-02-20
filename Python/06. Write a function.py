"""
Given a year, determine whether it is a leap year. If it is a leap year, return the Boolean True, otherwise return False.

Note that the code stub provided reads from STDIN and passes arguments to the is_leap function. It is only necessary to complete the is_leap function. They are three conditions are used to identify leap years:

The year can be evenly divided by 4, is a leap year, unless.
The year can be evenly divided by 100, it is NOT a leap year, unless.
The year is also evenly divisible by 400. Then it is a leap year.

Logic:
Step 1: Is the year divisible by 4?
Yes? → Go to Step 2.
No? → It’s NOT a leap year.

Step 2: Is the year divisible by 100?
Yes? → Go to Step 3.
No? → It IS a leap year.

Step 3: Is the year divisible by 400?
Yes? → It IS a leap year.
No? → It’s NOT a leap year.
"""


def is_leap(year):
    leap = False
    
    if(year % 4 == 0):
        if(year % 100 != 0):
            leap = True 
        else:
            if(year % 400 == 0):
                leap = True 
            else:
                leap = False
    return leap

year = int(input())
print(is_leap(year))

#Second way
def is_leap(year):
    leap = False
    
    if(year % 4 == 0):
        leap = True 
    if(year % 100 == 0):
        leap = False 
    if(year % 400 == 0):
        leap = True
    return leap

year = int(input())
print(is_leap(year))

#Third way
def is_leap(year):
    leap = False
    
    if((year % 4 == 0 and year % 100 != 0) or year % 400 == 0):
        leap = True 
    else:
        leap = False
    return leap

year = int(input())
print(is_leap(year))


# If year is divisible by 4 then it is not divisible by 100 means Leap year
# if year is divisible by 4 then it is also divisible by 100 and also divisible by 400 means Leap year if not by 400 means not a leap year
# if year is not divisible by 4 means Not a leap year

# create a python code to print any table thorugh take user input in python 
a = int(input("enter your table number: "))
total=0
for i in range(1,11):
    table=a*i
    print(table)
    total=total + table

print("total sum of table:", total)
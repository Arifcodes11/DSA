n=int(input("Enter a number: "))

i=2

while i<n:
    if n%i==0:
        print("not prime for ",i)
    else:
        print("prime for ",i)
    i=i+1
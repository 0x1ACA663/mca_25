max_num = 50

print(f"Even numbers between 1 and {max_num}:")

num = 2

while num < max_num:
  if num % 2 == 0:
    print(num, end=" ")
  num += 1

print(f"\n\nOdd numbers between 1 and {max_num}:")

num = 2
truthy = True

while truthy:
  if num < max_num:
    if num % 2 != 0:
      print(num, end=" ")
    num += 1
  else:
    truthy = False

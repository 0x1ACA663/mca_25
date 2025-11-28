tup = (3, 3, 6, 4, 2, 6, 6, 2, 9, 1, 0, 0, 0)
print(tup)

val = int(input("Enter the value to count: "))

count = 0

for ele in tup:
  if (val == ele):
    count += 1

print(f"Value {val} occurs {count} times!!")

n_terms = int(input("Enter the N number of terms: "))

sum = 0
num = 1

truthy = True

while truthy:
  if num <= n_terms:
    sum += num
    num += 1
  else:
    truthy = False

print(f"Sum of {n_terms} is {sum}.")

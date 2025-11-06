n_terms = int(input("Enter the N number of terms: "))

sum = 0
num = 1

while num <= n_terms:
  sum += num
  num += 1

print(f"Sum of {n_terms} is {sum}.")

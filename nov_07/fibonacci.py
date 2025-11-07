def fibonacci(max_terms, endl):
  first = 0
  second = 0

  for i in range(max_terms):
    sum = first + second
    print(first, end=endl)
    first = second + 1
    second = sum

n_terms = int(input("Enter the number of terms to print the fibonacci series: "))

print("Fibonacci series upto", n_terms, "terms:")
fibonacci(n_terms, " ")

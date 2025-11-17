num_1 = int(input("Enter number 1: "))
num_2 = int(input("Enter number 2: "))

opr = input("Select an operator (+, -, *, /, %): ")[0]

if opr == "+":
  print(num_1, "+", num_2, "=", num_1 + num_2)
elif opr == "-":
  print(num_1, "-", num_2, "=", num_1 - num_2)
elif opr == "*":
  print(num_1, "*", num_2, "=", num_1 * num_2)
elif opr == "/":
  print(num_1, "/", num_2, "=", num_1 / num_2)
elif opr == "%":
  print(num_1, "%", num_2, "=", num_1 % num_2)
else:
  print("Invalid operator provided!!")

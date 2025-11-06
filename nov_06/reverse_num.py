num = 273

print(f"Original number: {num}")

print("Reversed number: ", end="")
while num > 0:
  digit = num % 10
  print(digit, end="")

  num = num // 10

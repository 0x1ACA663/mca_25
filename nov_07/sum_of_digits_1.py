def sum_of_digits(num):
  sum = 0;
  temp_num = num;

  while temp_num > 0:
    digit = temp_num % 10
    sum += digit
    temp_num //= 10

  return sum

num = 53
sum = sum_of_digits(num)

print("Sum of digits of ", num, "is", sum)

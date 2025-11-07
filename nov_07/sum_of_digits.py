def sum_of_digits(list_of_digits):
  sum = 0

  for num in list_of_digits:
    sum += num

  return sum

digit_list = [5, 3, 7, 8, 9, 1, 2]
sum = sum_of_digits(digit_list)

print("Array:", digit_list)
print("Sum of the following digits:", sum)

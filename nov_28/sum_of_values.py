dict = {
  "a": 1,
  "b": 5,
  "c": 3,
  "d": 9,
  "e": 8,
  "f": 7,
}

sum = 0

for val in dict.values():
  sum += val

print("Dictionary:", dict)
print("Sum of the values:", sum)

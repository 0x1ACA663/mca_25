dict = {
  "a": 1,
  "b": 5,
  "c": 3,
  "d": 9,
  "e": 8,
  "f": 7,
}

max = 0

for val in dict.values():
  if (val > max):
    max = val

print("Dictionary:", dict)
print("Max value:", max)

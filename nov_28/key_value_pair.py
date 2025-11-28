dict = {
  "a": "Apple",
  "b": "Banana",
  "m": "Mango",
  "p": "Pear",
  "w": "Watermelon",
}

print("Dictionary:", dict)

key = input("\nEnter the key to delete from the dictionary: ")
dict.pop(key)

print("\nUpdated dictionary:", dict)

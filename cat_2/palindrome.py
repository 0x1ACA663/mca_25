def is_palindrome(string):
  str_len = len(string)
  palindrome = False

  for i in range(int(str_len / 2)):
    if string[i] == string[str_len - 1 - i]:
        palindrome = True

  return palindrome

string = input("Enter a string: ")

if is_palindrome(string):
  print("The provided string is palindrome.")
else:
  print("The provided string is not palindrome.")

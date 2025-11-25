class AddNum:
  def add(self, a, b = None, c = None):
    if b == None:
      return a
    elif c == None:
      return a + b
    else:
      return a + b + c

add_num = AddNum()

print("Single sum:", add_num.add(4))
print("Sum of 4 + 4 is", add_num.add(4, 4))
print("Sum of 4 + 4 + 2 is", add_num.add(4, 4, 2))

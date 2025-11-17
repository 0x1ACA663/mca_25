class Rectangle:
  def __init__(self, length, width):
    self.length = length
    self.width = width

  def area(self):
    return self.length * self.width

  def perimeter(self):
    return 2 * (self.length + self.width)

rect = Rectangle(5, 3)

print("Length:", rect.length)
print("Breadth:", rect.width)
print("Area of Rectangle:", rect.area())
print("Perimeter of Rectangle:", rect.perimeter())

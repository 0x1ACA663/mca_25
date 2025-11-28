class Person:
  def __init__(self, name, age):
    self.name = name
    self.age = age

  def show_details(self):
    print(f"Name: {self.name}, Age: {self.age}")

class Student(Person):
  def __init__(self, name, age, roll):
    super().__init__(name, age)
    self.roll = roll

  def show_details(self):
    super().show_details()
    print(f"Roll: {self.roll}")

s1 = Student("Amit", 21, 101)

s1.show_details()

class Teacher:
  def __init__(self, name, age):
    self.name = name
    self.age = age


class Student(Teacher):
  def __init__(self, name, age, roll_no):
    super().__init__(name, age)
    self.roll_no = roll_no

stud = Student("Priyanuj", 22, 25)

print("Student Name:", stud.name)
print("Student Age:", stud.age)
print("Student Roll No:", stud.roll_no)

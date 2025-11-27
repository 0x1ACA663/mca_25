class Student:
  def __init__(self, name, roll, marks):
    self.__name = name
    self.__roll = roll
    self.__marks = marks

  def get_name(self):
    return self.__name

  def get_roll(self):
    return self.__roll

  def get_marks(self):
    return self.__marks

  def set_marks(self, marks):
    if marks >= 0:
      self.__marks = marks

  def calculate_grade(self):
    if self.__marks >= 90:
      return "A"
    elif self.__marks >= 75:
      return "B"
    elif self.__marks >= 60:
      return "C"
    else:
      return "D"

class StudentApp:
  def run(self):
    s1 = Student("Amit", 101, 92)
    s2 = Student("Riya", 102, 74)

    print("Student Details:")
    print(f"Name: {s1.get_name()}, Roll: {s1.get_roll()}, Marks: {s1.get_marks()}, Grade: {s1.calculate_grade()}")
    print(f"Name: {s2.get_name()}, Roll: {s2.get_roll()}, Marks: {s2.get_marks()}, Grade: {s2.calculate_grade()}")
    
    s2.set_marks(85)
    print("\nAfter updating marks:")
    print(f"Name: {s2.get_name()}, New Grade: {s2.calculate_grade()}")

app = StudentApp()
app.run()

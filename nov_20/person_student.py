class Person:
  def __init__(self, name, gender):
    self.name = name
    self.gender = gender

  def getData(self):
    return self.name, self.gender

class Student(Person):
  def __init__(self, name, gender):
    super().__init__(name, gender)

  def displayData(self):
    stud_name, stud_gender = self.getData()
    print("Student Name:", stud_name)
    print("Student Gender:", stud_gender)

stud = Student("Priyanuj", "Male")
stud.displayData()

class Student:
  def __init__(self, roll_no, marks):
    self.roll_no = roll_no
    self.marks = marks

  def is_passed(self):
    return self.marks > 40

stud = Student(25, 50)

print("Student Roll No:", stud.roll_no)
print("Student Marks:", stud.marks)
print("Student Passed?", stud.is_passed())

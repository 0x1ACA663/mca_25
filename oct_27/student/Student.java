public class Student extends Grade {
  String name;
  int rollNo;
  
  public Student(String name, int rollNo, int marks) {
    this.name = name;
    this.rollNo = rollNo;
    this.marks = marks;
  }

  public String display() {
    return String.format(
      "Student Name: %s%nStudent Roll No: %d%nStudent Marks: %d (Grade: %s)%n",
      name,
      rollNo,
      marks,
      calculateGrade()
    );
  }

  @Override
  public String toString() {
    return String.format(
      "Student(name=%s, rollNo=%i, marks=%i)",
      name,
      rollNo,
      marks
    );
  }
}

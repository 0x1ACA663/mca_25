public class Student extends Grade {
  String name;
  int rollNo;
  
  Student(String name, int rollNo, int marks) {
    this.name = name;
    this.rollNo = rollNo;
    this.marks = marks;
  }

  @Override
  public String toString() {
    return "Student(name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + ")";
  }
}

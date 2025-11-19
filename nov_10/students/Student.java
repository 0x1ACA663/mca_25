public class Student {
  private String name;
  private int rollNo;

  public Student(String name, int rollNo) {
    this.name = name;
    this.rollNo = rollNo;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public String getName() {
    return name;
  }

  public int getRollNo() {
    return rollNo;
  }

  @Override
  public String toString() {
    return "Student(name=" + name + ", rollNo=" + rollNo + ")";
  }
}

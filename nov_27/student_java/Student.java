class Student {
  private String name;
  private int roll;
  private int marks;

  public Student(String name, int roll, int marks) {
    this.name = name;
    this.roll = roll;
    this.marks = marks;
  }

  public String getName() {
    return name;
  }

  public int getRoll() {
    return roll;
  }

  public int getMarks() {
    return marks;
  }

  public void setMarks(int marks) {
    if (marks >= 0) this.marks = marks;
  }

  public String calculateGrade() {
    if (marks >= 90) return "A";
    if (marks >= 75) return "B";
    if (marks >= 60) return "C";
    return "D";
  }
}

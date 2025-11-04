void main() {
  Student student = new Student();

  student.setData(
    25,                      // Roll No
    "Priyanuj",              // Name
    1,                       // Semester
    "Computer Applications"  // Branch
  );

  student.showData();
  System.out.println();

  double percentage = student.calculate();
  System.out.printf("Percentage = %.2f%%%n", percentage);
}

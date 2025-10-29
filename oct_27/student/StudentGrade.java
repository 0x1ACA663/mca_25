void main() {
  Student stud1 = new Student("John", 1, 58);
  Student stud2 = new Student("John", 2, 88);

  System.out.printf(
    "Grade of %s's having marks %i = %i%n",
    stud1.name,
    stud1.marks,
    stud1.calculateGrade()
  );
  System.out.println(stud2);
}

void main() {
  Student s1 = new Student("Amit", 101, 92);
  Student s2 = new Student("Riya", 102, 74);

  System.out.println("Student Details:");
  System.out.printf("Name: %s, Roll: %d, Marks: %d, Grade: %s%n", s1.getName(), s1.getRoll(), s1.getMarks(), s1.calculateGrade());
  System.out.printf("Name: %s, Roll: %d, Marks: %d, Grade: %s%n", s2.getName(), s2.getRoll(), s2.getMarks(), s2.calculateGrade());

  s2.setMarks(85);

  System.out.println("\nAfter updating marks:");
  System.out.println("Name: " + s2.getName() + ", New Grade: " + s2.calculateGrade());
}

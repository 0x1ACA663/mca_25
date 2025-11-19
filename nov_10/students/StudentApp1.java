void main() {
  StudentList stud_list = new StudentList();
    
  stud_list.addStudent(new Student("Abhinash", 1));
  stud_list.addStudent(new Student("Aditya", 2));
  stud_list.addStudent(new Student("Animegh", 3));
  stud_list.addStudent(new Student("Apurba", 4));
  stud_list.addStudent(new Student("Bhargav", 5));

  System.out.println("List of students:");
  for (Student stud : stud_list.getStudList()) {
    System.out.println(stud);
  }

  stud_list.deleteStudentByRollNo(5);

  System.out.println("\nList of students (after removing student having roll no 5):");
  for (Student stud : stud_list.getStudList()) {
    System.out.println(stud);
  }

  stud_list.updateStudentByRollNo(2, "John");

  System.out.println("\nList of students (after updating student name having roll no 2):");
  for (Student stud : stud_list.getStudList()) {
    System.out.println(stud);
  }
}

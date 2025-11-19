import java.util.LinkedList;

void main() {
  LinkedList<Student> stud_list = new LinkedList<>();
    
  stud_list.add(new Student("Abhinash", 1));
  stud_list.add(new Student("Aditya", 2));
  stud_list.add(new Student("Animegh", 3));
  stud_list.add(new Student("Apurba", 4));
  stud_list.add(new Student("Bhargav", 5));

  System.out.println("List of students:");
  for (Student stud : stud_list) {
    System.out.println(stud);
  }

  stud_list.remove(stud_list.get(4));

  System.out.println("\nList of students (after removing student having roll no 5):");
  for (Student stud : stud_list) {
    System.out.println(stud);
  }

  for (Student stud : stud_list) {
    if (stud.getRollNo() == 2) stud.setName("John");
  }

  System.out.println("\nList of students (after updating student name having roll no 2):");
  for (Student stud : stud_list) {
    System.out.println(stud);
  }
}

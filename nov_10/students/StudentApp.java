void main() {
  Student[] stud_list = {
    new Student("Abhinash", 1),
    new Student("Aditya", 2),
    new Student("Animegh", 3),
    new Student("Apurba", 4),
    new Student("Bhargav", 5)
  };

  System.out.println("");

  for (Student stud : stud_list) {
    System.out.println("- " + stud);
  }
}

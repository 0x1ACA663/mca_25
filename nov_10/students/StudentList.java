import java.utils.ArrayList;

public class StudentList {
  private ArrayList<Student> stud_list;

  public StudentList() {
    stud_list = new ArrayList<Student>();
  }

  public void addStudent(Student student) {
    stud_list.add(student);
  }

  public void deleteStudent(Student student) {
    stud_list.remove(student);
  }
}

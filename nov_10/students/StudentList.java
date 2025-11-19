import java.util.Arrays;
import java.util.ArrayList;

public class StudentList {
  private ArrayList<Student> stud_list;

  public StudentList() {
    stud_list = new ArrayList<>();
  }

  ArrayList<Student> getStudList() {
    return stud_list;
  }

  public void addStudent(Student student) {
    stud_list.add(student);
  }

  public void deleteStudentByRollNo(int rollNo) {
    stud_list.removeIf(stud -> stud.getRollNo() == rollNo);
  }

  public void updateStudentByRollNo(int rollNo, String newName) {
    for (Student stud : stud_list) {
      if (stud.getRollNo() == rollNo) stud.setName(newName);
    }
  }
}

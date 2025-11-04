import java.util.Scanner;

public class Student {
  private int roll_no;
  private String name;
  private int semester;
  private String branch;

  public void setData(int roll_no, String name, int semester, String branch) {
    this.roll_no = roll_no;
    this.name = name;
    this.semester = semester;
    this.branch = branch;
  }

  public double calculate() {
    Scanner sc = new Scanner(System.in);
    double[] marks = new double[5];

    for (int i = 0; i <= 4; i++) {
      System.out.printf("Enter Subject %d marks: ", i + 1);
      marks[i] = sc.nextDouble();
      sc.nextLine(); // To clear the remaining buffer.
    }

    sc.close();

    double total_marks = 0;
    for (double mark : marks) total_marks += mark;

    return total_marks / 5;
  }

  public void showData() {
    System.out.println("Student.roll_no = " + roll_no);
    System.out.println("Student.name = " + name);
    System.out.println("Student.semester = " + semester);
    System.out.println("Student.branch = " + branch);
  }
}

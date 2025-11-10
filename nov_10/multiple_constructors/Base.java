public class Base {
  private int x;
  private String y;

  public Base() {
    x = 0;
    y = "Unspecified";
  }

  public Base(int x) {
    this.x = x;
    y = "Unspecified";
  }

  public Base(String y) {
    x = 0;
    this.y = y;
  }

  public Base(int x, String y) {
    this.x = x;
    this.y = y;
  }
}

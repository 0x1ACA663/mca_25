public class Temperature {
  public static double toFahrenheit(double celsius) {
    return (9 / 5 * celsius) + 32; 
  }

  public static double toCelsius(double farenheit) {
    return (farenheit - 32) * 5 / 9;
  }
}

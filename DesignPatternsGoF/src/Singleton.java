
public class Singleton {
  private static Singleton instance;
  private String city;
  private double temperature;

  private Singleton() {}

  public static Singleton getInstance() {
      if (instance == null) {
          instance = new Singleton();
      }
      return instance;
  }

  public void setWeather(String city, double temperature) {
      this.city = city;
      this.temperature = temperature;
  }

  public void displayWeather() {
      if (city != null) {
          System.out.println("Weather in " + city + ": " + temperature + " degrees Celsius");
      } else {
          System.out.println("Weather information not set.");
      }
  }
}


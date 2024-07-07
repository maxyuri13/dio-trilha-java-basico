
public class Test {
  public static void main(String[] args) {

      // Singleton 

      Singleton weatherInfo = Singleton.getInstance();
      weatherInfo.setWeather("Springfield", 25.5);
      weatherInfo.displayWeather();

      // Strategy

      AgeStrategy strategy = new YoungStrategy();
      System.out.println("Age: 20, Age Range: " + strategy.ageRange(20));
      strategy = new AdultStrategy();
      System.out.println("Age: 35, Age Range: " + strategy.ageRange(35));
      strategy = new ElderlyStrategy();
      System.out.println("Age: 70, Age Range: " + strategy.ageRange(70));

      // Facade 

      Facade facade = new Facade();
      String birthCity = facade.getBirthCity("Max");
      // String birthCity = facade.getBirthCity("Yuri");
      System.out.println("Birth City: " + birthCity);
      String birthState = facade.getBirthState("Max");
      // String birthState = facade.getBirthState("Yuri");
      System.out.println("Birth State: " + birthState);
  }
}

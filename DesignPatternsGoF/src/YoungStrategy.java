public class YoungStrategy implements AgeStrategy {
  @Override
  public String ageRange(int age) {
      return (age <= 25) ? "Young" : null;
  }
}

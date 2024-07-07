public class AdultStrategy implements AgeStrategy {
  @Override
    public String ageRange(int age) {
        return (age > 25 && age <= 60) ? "Adult" : null;
    }
}

public class ElderlyStrategy implements AgeStrategy {
  @Override
    public String ageRange(int age) {
        return (age > 60) ? "Elderly" : null;
    }
}

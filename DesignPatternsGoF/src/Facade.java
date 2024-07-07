public class Facade {
  private CityInformationFacade cityInfo;

  public Facade() {
      this.cityInfo = new CityInformationFacade();
  }

  public String getBirthCity(String personName) {
      return cityInfo.getBirthCity(personName);
  }

  public String getBirthState(String personName) {
      return cityInfo.getBirthState(personName);
  }
}

public class CityInformationFacade {
  public String getBirthCity(String personName) {
      if ("Max".equals(personName)) {
          return "Salvador";
      } else if ("Yuri".equals(personName)) {
          return "Maceio";
      } else {
          return "Unknown";
      }
  }

  public String getBirthState(String personName) {
      if ("Max".equals(personName)) {
          return "Bahia";
      } else if ("Yuri".equals(personName)) {
          return "Alagoas";
      } else {
          return "Unknown";
      }
  }
}


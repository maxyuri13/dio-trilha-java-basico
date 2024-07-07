public class Devs {
  private String name;
  private String skills;

  public Devs(String name, String skills) {
    this.name = name;
    this.skills = skills;
  }

  public void displayDevInfo() {
    System.out.println("Developer: " + name);
    System.out.println("Skills: " + skills);
  }
}

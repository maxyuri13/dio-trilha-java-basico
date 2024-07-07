public class Mentor {
  private String name;
  private String expertise;

  public Mentor(String name, String expertise) {
    this.name = name;
    this.expertise = expertise;
  }

  public void displayMentorInfo() {
    System.out.println("Mentor: " + name);
    System.out.println("Expertise: " + expertise);
  }
}

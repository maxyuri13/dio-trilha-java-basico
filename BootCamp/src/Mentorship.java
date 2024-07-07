public class Mentorship {
  private String name;
  private String description;
  private Mentor mentor;

  public Mentorship(String name, String description, Mentor mentor) {
    this.name = name;
    this.description = description;
    this.mentor = mentor;
  }

  public void startMentorship() {
    System.out.println("Mentorship: " + name);
    System.out.println("Description: " + description);
    mentor.displayMentorInfo();
  }
}

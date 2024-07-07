public class Course {
  private String name;
  private String description;
  private int duration;

  public Course(String name, String description, int duration) {
    this.name = name;
    this.description = description;
    this.duration = duration;
  }

  public void displayCourseInfo() {
    System.out.println("Course: " + name);
    System.out.println("Description: " + description);
    System.out.println("Duration: " + duration + " hours");
  }
}

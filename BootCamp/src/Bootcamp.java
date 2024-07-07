import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
  private String name;
  private List<CourseCategory> courseCategories;
  private List<Mentorship> mentorships;
  private List<Devs> developers;

  public Bootcamp(String name) {
    this.name = name;
    this.courseCategories = new ArrayList<>();
    this.mentorships = new ArrayList<>();
    this.developers = new ArrayList<>();
  }

  public void addCourseCategory(CourseCategory category) {
    courseCategories.add(category);
  }

  public void addMentorship(Mentorship mentorship) {
    mentorships.add(mentorship);
  }

  public void addDeveloper(Devs developer) {
    developers.add(developer);
  }

  public List<CourseCategory> getCourseCategories() {
    return courseCategories;
  }

  public List<Mentorship> getMentorships() {
    return mentorships;
  }

  public List<Devs> getDevelopers() {
    return developers;
  }

  @Override
  public String toString() {
    return "Bootcamp: " + name;
  }
}

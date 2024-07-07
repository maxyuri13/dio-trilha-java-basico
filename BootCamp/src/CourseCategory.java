import java.util.ArrayList;
import java.util.List;

public class CourseCategory {
  private String name;
  private List<Course> courses;

  public CourseCategory(String name) {
    this.name = name;
    this.courses = new ArrayList<>();
  }

  public CourseCategory addCourse(Course course) {
    courses.add(course);
    return this;
  }

  public List<Course> getCourses() {
    return courses;
  }

  public void displayCategoryInfo() {
    System.out.println("Category: " + name);
    for (Course course : courses) {
      course.displayCourseInfo();
      System.out.println();
    }
  }
}

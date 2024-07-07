public class Main {
  public static void main(String[] args) {
    Bootcamp bootcamp = new Bootcamp("Java Bootcamp");

    // Creating courses
    Course javaBasicCourse = new Course("Java Basics", "Introduction to Java programming", 40);
    Course springCourse = new Course("Spring Boot", "Web development framework using Spring", 60);

    // Courses for Object-Oriented Programming Paradigm (POO)
    Course abstractionCourse = new Course("Abstraction",
        "Ability to focus on the essential aspects of a domain, ignoring less important or accidental features. In this context, objects are abstractions of existing entities in the domain.",
        50);
    Course encapsulationCourse = new Course("Encapsulation",
        "Encapsulating means hiding the implementation of objects. Encapsulation mainly favors two aspects of a system: maintenance and evolution.",
        50);
    Course inheritanceCourse = new Course("Inheritance",
        "Allows you to define a child class that reuses (inherits), extends, or modifies the behavior of a parent class. The class whose members are inherited is called the base class. The class that inherits the members of the base class is called the derived class.",
        50);
    Course polymorphismCourse = new Course("Polymorphism",
        "Ability of an object to be referenced in multiple ways. Be careful, polymorphism does not mean that the object keeps transforming, quite the contrary, an object is born of one type and dies of that type, what can change is the way we refer to it. The ability to treat objects created from specific classes as objects of a generic class is called polymorphism.",
        50);

    // Courses for Fundamental Concepts of OOP
    Course domainCourse = new Course("Domain",
        "Application domain, also known as business layer or business objects layer, is where the classes that are part of the problem domain are located, i.e., classes corresponding to objects that are part of the problem description.",
        50);
    Course classCourse = new Course("Class",
        "A code element that represents real-world objects. It is common to declare attributes and methods within it, which respectively represent the characteristics and behaviors of that object.",
        50);
    Course attributeCourse = new Course("Attribute",
        "Attributes are basically the data structure that will represent the class. Attributes are also known as class variables and can be divided into two basic types: instance attributes and class attributes.",
        50);
    Course variableCourse = new Course("Variable",
        "A 'region of memory (of the computer) previously identified whose purpose is to store the data or information of a program for a certain period of time'.",
        50);
    Course methodCourse = new Course("Method", "Methods represent the states and actions of objects and classes.", 50);
    Course objectCourse = new Course("Object",
        "In OOP, an object is a 'mold' of a certain class that comes into existence from an instance of the class. The class defines the behavior of the object using attributes (properties) and methods (actions). An object in computer science is a reference to a memory location that holds a value. An object can be a variable, function, or data structure.",
        50);
    Course instanceCourse = new Course("Instance",
        "An instance of a class is a new object created from that class using the new operator. Instantiating a class means creating a new object of the same type as that class. A class can only be used after being instantiated.",
        50);

    // Creating course categories
    CourseCategory oopParadigm = new CourseCategory("Object-Oriented Programming Paradigm (OOP)");
    oopParadigm.addCourse(abstractionCourse);
    oopParadigm.addCourse(encapsulationCourse);
    oopParadigm.addCourse(inheritanceCourse);
    oopParadigm.addCourse(polymorphismCourse);

    CourseCategory fundamentalConcepts = new CourseCategory("Fundamental Concepts of OOP");
    fundamentalConcepts.addCourse(domainCourse);
    fundamentalConcepts.addCourse(classCourse);
    fundamentalConcepts.addCourse(attributeCourse);
    fundamentalConcepts.addCourse(variableCourse);
    fundamentalConcepts.addCourse(methodCourse);
    fundamentalConcepts.addCourse(objectCourse);
    fundamentalConcepts.addCourse(instanceCourse);

    // Adding course categories to bootcamp
    bootcamp.addCourseCategory(oopParadigm);
    bootcamp.addCourseCategory(fundamentalConcepts);

    // Adding other courses to bootcamp
    bootcamp.addCourseCategory(new CourseCategory("Other Courses").addCourse(javaBasicCourse).addCourse(springCourse));

    Mentor mentor1 = new Mentor("Max", "Java Specialist");
    Mentor mentor2 = new Mentor("Yuri", "Spring Boot Expert");

    Mentorship javaMentorship = new Mentorship("Java Development", "Practical mentorship on Java development", mentor1);
    Mentorship springMentorship = new Mentorship("Spring Boot Development", "Advanced mentorship on Spring Boot",
        mentor2);

    bootcamp.addMentorship(javaMentorship);
    bootcamp.addMentorship(springMentorship);

    Devs dev1 = new Devs("Carlos", "Java, Spring, Hibernate");
    Devs dev2 = new Devs("Anna", "Java, Spring Boot, REST");

    bootcamp.addDeveloper(dev1);
    bootcamp.addDeveloper(dev2);

    System.out.println("Bootcamp Information:");
    System.out.println(bootcamp);

    System.out.println("\nCourse Categories:");
    for (CourseCategory category : bootcamp.getCourseCategories()) {
      category.displayCategoryInfo();
      System.out.println();
    }

    System.out.println("Mentorships:");
    for (Mentorship mentorship : bootcamp.getMentorships()) {
      mentorship.startMentorship();
      System.out.println();
    }

    System.out.println("Developers:");
    for (Devs developer : bootcamp.getDevelopers()) {
      developer.displayDevInfo();
      System.out.println();
    }
  }
}

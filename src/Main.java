import java.util.Arrays;
class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double calculateArea() {
        return width * length;
    }

    public double calculatePerimeter() {
        return 2 * (width + length);
    }
}

class Person {
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Student extends Person {
    private int[] grades;

    public Student(String name, String email, int[] grades) {
        super(name, email);
        this.grades = grades;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}

class Profesor extends Person {
    private String[] courses;

    public Profesor(String name, String email, String[] courses) {
        super(name, email);
        this.courses = courses;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Rex", "Bulldog");
        Dog dog2 = new Dog("Buddy", "Golden Retriever");

        dog1.setName("Max");
        dog2.setBreed("Labrador");

        System.out.println("Numele câinelui 1: " + dog1.getName());
        System.out.println("Rasa câinelui 2: " + dog2.getBreed());


        Rectangle rectangle = new Rectangle(5.0, 8.0);
        System.out.println("Aria dreptunghiului: " + rectangle.calculateArea());
        System.out.println("Perimetrul dreptunghiului: " + rectangle.calculatePerimeter());


        int[] grades = {85, 92, 78, 89, 94};
        Student student = new Student("John", "john@example.com", grades);
        System.out.println("Notele studentului: " + Arrays.toString(student.getGrades()));


        String[] courses = {"Matematică", "Fizică", "Chimie"};
        Profesor profesor = new Profesor("Dr. Smith", "smith@example.com", courses);
        System.out.println("Cursurile profesorului: " + Arrays.toString(profesor.getCourses()));
    }
}
import java.util.Scanner;

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

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți numele pentru persoană: ");
        String personName = scanner.nextLine();
        System.out.print("Introduceți adresa de email pentru persoană: ");
        String personEmail = scanner.nextLine();
        Person person = new Person(personName, personEmail);

        System.out.print("Introduceți numele pentru student: ");
        String studentName = scanner.nextLine();
        System.out.print("Introduceți adresa de email pentru student: ");
        String studentEmail = scanner.nextLine();
        System.out.print("Introduceți notele studentului (separate prin spații): ");
        String[] gradesInput = scanner.nextLine().split(" ");
        int[] studentGrades = new int[gradesInput.length];
        for (int i = 0; i < gradesInput.length; i++) {
            studentGrades[i] = Integer.parseInt(gradesInput[i]);
        }
        Student student = new Student(studentName, studentEmail, studentGrades);

        System.out.print("Introduceți numele pentru profesor: ");
        String profesorName = scanner.nextLine();
        System.out.print("Introduceți adresa de email pentru profesor: ");
        String profesorEmail = scanner.nextLine();
        System.out.print("Introduceți cursurile profesorului (separate prin virgulă): ");
        String[] courses = scanner.nextLine().split(",");
        Profesor profesor = new Profesor(profesorName, profesorEmail, courses);

        scanner.close();


        System.out.println("Detalii pentru persoană: " + person.getName() + ", " + person.getEmail());
        System.out.println("Detalii pentru student: " + student.getName() + ", " + student.getEmail() + ", Note: " + java.util.Arrays.toString(student.getGrades()));
        System.out.println("Detalii pentru profesor: " + profesor.getName() + ", " + profesor.getEmail() + ", Cursuri: " + java.util.Arrays.toString(profesor.getCourses()));
    }
}
package Ejercicio_4;

import java.util.*;

public class Main {
    private Estudiante[] students;
    private int studentsCounter;

    public Main() {
        this.students = new Estudiante[18];
        this.studentsCounter = 0;
    }

    public void addStudents(Estudiante student) {
        if (studentsCounter < 18) {
            students[studentsCounter] = student;
            studentsCounter++;
        } else {
            System.out.println(" | TODOS LOS ESTUDIANTE REGISTRADOS | ");
        }
    }

    public void printStudents() {
        System.out.println("\n | --->  L I S T A  D E  E S T U D I A N T E S  O R D E N A D O S  <--- |");
        for (int i = 0; i < studentsCounter; i++) {
            System.out.println(students[i]);
        }
    }

    public void sortStudentsByAge() {
        students = Arrays.stream(students, 0, studentsCounter)
                .sorted(Comparator.comparingInt(Estudiante::calculateAge))
                .toArray(Estudiante[]::new);
    }

    public static void main(String[] args) {
        Main newMain = new Main();
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------------------");
        System.out.println("| REGISTRO DE ESTUDIANTES DE LA CLASE |");
        System.out.println("---------------------------------------");

        int numStudents = 18;
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\n| ESTUDIANTE [" + (i + 1) + "] |");
            Estudiante student = new Estudiante();
            student.addStudent(scanner);
            newMain.addStudents(student);
        }

        newMain.sortStudentsByAge();
        newMain.printStudents();
    }

}

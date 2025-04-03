package Ejercicio_4;

import java.util.*;

public class Estudiante extends Persona {
    private String codeSis;


    public Estudiante(String name, String firstLastName, String secondLastName, Date birthDate, boolean complementCi, String numberCi) {
        super(name, firstLastName, secondLastName, birthDate, complementCi, numberCi);
    }

    public Estudiante() {
        super();
    }

    public void addStudent(Scanner scanner) {
        super.addPerson(scanner);

        System.out.print("Código SIS: ");
        this.codeSis = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "\n| CÓDIGO SIS |: " + codeSis + "\n";
    }

    public String sayCodigoSis() {
        return codeSis;
    }

}

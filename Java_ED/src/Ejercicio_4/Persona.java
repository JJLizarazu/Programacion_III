package Ejercicio_4;
/*
Implementa un programa que permita registrar a toddos los estudiantes de la clase en un arreglo de tamaño 18
luego ordena el arreglo por edad y muestralo por pantalla
* */

import java.util.*;
import java.text.*;

public class Persona {
    protected String name;
    protected String firstLastName;
    protected String secondLastName;
    protected Date birthDate;
    protected boolean complementCi;
    protected String numberCi;

    public Persona(String name, String firstLastName, String secondLastName, Date birthDate, boolean complementCi, String numberCi) {
        this.name = name;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.birthDate = birthDate;
        this.complementCi = complementCi;
        this.numberCi = numberCi;
    }

    public Persona() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean getComplementCi() {
        return complementCi;
    }

    public void setComplementCi(boolean complementCi) {
        this.complementCi = complementCi;
    }

    public String getNumberCi() {
        return numberCi;
    }

    public void setNumberCi(String numberCi) {
        this.numberCi = numberCi;
    }

    // Métodos

    public int calculateAge() {
        if (birthDate == null) {
            return 0;
        }

        Calendar today = Calendar.getInstance();
        Calendar birthCal = Calendar.getInstance();
        birthCal.setTime(birthDate);

        int age = today.get(Calendar.YEAR) - birthCal.get(Calendar.YEAR);

        if (today.get(Calendar.DAY_OF_YEAR) < birthCal.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        return age;
    }

    public boolean hasComplement() {
        return complementCi;
    }

    public void addPerson(Scanner scanner) {
        System.out.println("-------------------------------");
        System.out.println("| INGRESE DATOS DE LA PERSONA |");
        System.out.println("-------------------------------");

        System.out.print("| NOMBRE |: ");
        this.name = scanner.nextLine();

        System.out.print("| PRIMER APELLIDO |: ");
        this.firstLastName = scanner.nextLine();

        System.out.print("| SEGUNDO APELLIDO |: ");
        this.secondLastName = scanner.nextLine();

        System.out.print("| FECHA DE NACIMIENTO | (dd/MM/yyyy) : ");
        String dateStr = scanner.nextLine();

        try {
            this.birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Incorrecto. Formato -> dd/MM/yyyy");
            this.birthDate = null;
        }

        System.out.print("¿TTIENE COMPLEMENTO CI? (s/n): ");
        String complementStr = scanner.nextLine();
        this.complementCi = complementStr.equalsIgnoreCase("s");

        System.out.print("Número de CI: ");
        this.numberCi = scanner.nextLine();
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaNacStr = (birthDate != null) ? sdf.format(birthDate) : "SIN FECHA DE NACIMIENTO";

        return  "----------------------------------------- " +
                "\n| NOMBRE COMPLETO |: " + name + " " + firstLastName + " " + secondLastName +
                "\n| FECHA DE NACIMIENTO |: " + fechaNacStr +
                "\n| EDAD |: " + calculateAge() + " años" +
                "\n| CI |: " + numberCi + (hasComplement() ? " (TIENE COMPLEMENTO)" : "") +
                "\n-----------------------------------------";
    }

}

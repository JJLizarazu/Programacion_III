/*
* Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4)
* y diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar un vector.
* Para simplificarlo vamos a suponer que febrero tiene 28 días
* */

import java.util.*;

class Mes{
    private int num;
    private String name;
    private int numDays;

    public Mes(int num, String name, int numDays) {
        this.setNum(num);
        this.setName(name);
        this.setNumDays(numDays);
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumDays() {
        return numDays;
    }

    public void setNumDays(int numDays) {
        this.numDays = numDays;
    }
}

public class Ejercicio_6 {

    Mes[] months = new Mes[12];
    Scanner sc;

    public Ejercicio_6() {
        months[0] = new Mes(1, "Enero", 31);
        months[1] = new Mes(2, "Febrero", 28);
        months[2] = new Mes(3, "Marzo", 31);
        months[3] = new Mes(4, "Abril", 30);
        months[4] = new Mes(5, "Mayo", 31);
        months[5] = new Mes(6, "Junio", 30);
        months[6] = new Mes(7, "Julio", 31);
        months[7] = new Mes(8, "Agosto", 31);
        months[8] = new Mes(9, "Septiembre", 30);
        months[9] = new Mes(10, "Octubre", 31);
        months[10] = new Mes(11, "Noviembre", 30);
        months[11] = new Mes(12, "Diciembre", 31);

        sc = new Scanner(System.in);
    }

    public void execute(){
        System.out.println("| INTRODUZCA EL NÚMERO DE UN MES |:");
        int num = sc.nextInt();
        Mes month = months[num - 1];

        System.out.println(month.getName());
        System.out.println(month.getNumDays());
    }
}

class Main_6{
    public static void main(String[] args) {
        Ejercicio_6 e = new Ejercicio_6();
        e.execute();
    }
}

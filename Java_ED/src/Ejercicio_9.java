/*
* Queremos guardar la temperatura mínima y máxima de 5 días. Realiza un programa que de la siguiente información:
* La temperatura media de cada día
* Los días con menos temperatura
* Se lee una temperatura por teclado y se muestra los dias cuya temperatura máxima coincide con ella.
* si no existe ningún dia se muestra un mensaje de información
* */

import java.util.*;

class Dia{
    private int temperaturaMedia;
    private int temperaturaMáx;
    private int temperaturaMinimo;

    public Dia(int temperaturaMedia, int temperaturaMáx, int temperaturaMinimo) {
        this.setTemperaturaMedia(temperaturaMedia);
        this.setTemperaturaMáx(temperaturaMáx);
        this.setTemperaturaMinimo(temperaturaMinimo);
    }

    @Override
    public String toString() {
        return "Dia{" +
                "temperaturaMedia=" + temperaturaMedia +
                ", temperaturaMáx=" + temperaturaMáx +
                ", temperaturaMinimo=" + temperaturaMinimo +
                '}';
    }

    public int getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(int temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public int getTemperaturaMáx() {
        return temperaturaMáx;
    }

    public void setTemperaturaMáx(int temperaturaMáx) {
        this.temperaturaMáx = temperaturaMáx;
    }

    public int getTemperaturaMinimo() {
        return temperaturaMinimo;
    }

    public void setTemperaturaMinimo(int temperaturaMinimo) {
        this.temperaturaMinimo = temperaturaMinimo;
    }
}

public class Ejercicio_9 {
    Dia[] dias;
    Scanner sc;

    public Ejercicio_9() {
        dias = new Dia[5];
        sc = new Scanner(System.in);
    }

    public void execute(){
        System.out.println("----------------------------------------------");
        System.out.println("|  T E M P E A R A T U R A  M I N  Y  M A X  |");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < dias.length; i++) {
            System.out.println("Temperatura mínima días [" + i + "]: ");
            double minima = sc.nextDouble();

            System.out.println("Temperatura máxima días [" + i + "]: ");
            double maxima = sc.nextDouble();

            double media  = (minima + maxima) / 2.0;

            Dia dia = new Dia((int) media, (int) maxima, (int) minima);
            dias[i] = dia;
        }

        System.out.println("----------------------------------------");
        System.out.println("|  T E M P E A R A T U R A  M E D I A  |");
        System.out.println("----------------------------------------");
        for (int i = 0; i < dias.length; i++) {
            System.out.println("Temperatura media días [" + i + "]: " + dias[i].getTemperaturaMedia());
        }

        for (int i = 0; i < dias.length - 1; i++) {
            for (int j = 0; j < dias.length - 1 - i; j++) {
                if (dias[j].getTemperaturaMedia() > dias[j + 1].getTemperaturaMedia()) {
                    Dia aux = dias[j];
                    dias[j] = dias[j + 1];
                    dias[j + 1] = aux;
                }
            }
        }

        System.out.println("--------------------------------------------");
        System.out.println("|  T E M P E A R A T U R A  M Í N I M A S  |");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < dias.length; i++) {
            System.out.println("Temperatura minima días [" + i + "]: " + dias[i].getTemperaturaMedia());
        }

        System.out.println("--------------------------------------------------");
        System.out.println("|  C O M P A R A C I Ó N  T E M P E R A T U R A  |");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < dias.length; i++) {
            System.out.println("| Introduzca una temperatura |: ");
            double temperatura = sc.nextDouble();
            int contador = 0;
            for (int j = 0; j < dias.length; j++) {
                if (temperatura == dias[j].getTemperaturaMáx()) {
                    System.out.println(dias[j]);

                    contador++;
                }
            }

            if (contador == 0) {
                System.out.println("No existe ninguna temperatura máxima que coincida con la temperatura ingresada");
            }
        }
    }

}

class Main_9{
    public static void main(String[] args) {
        Ejercicio_9 ej = new Ejercicio_9();
        ej.execute();
    }
}

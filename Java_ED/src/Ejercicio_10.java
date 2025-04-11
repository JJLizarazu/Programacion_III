import java.util.*;

public class Ejercicio_10 {
    int[][] matriz;

    public Ejercicio_10() {
        matriz = new int[5][5];
    }

    public void execute() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int random = (int) (Math.random() * 9 - 1);

                matriz[i][j] = random;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------");
        System.out.println("|  S U M A  P O R  F I L A S  |");
        System.out.println("-------------------------------");
        for (int i = 0; i < matriz[0].length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz.length; j++) {
                suma += matriz[i][j];
            }
            System.out.println("| " + suma + " |");
        }


        System.out.println("-------------------------------");
        System.out.println("|  S U M A  P O R  F I L A S  |");
        System.out.println("-------------------------------");
        for (int i = 0; i < matriz[0].length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz.length; j++) {
                suma += matriz[i][j];
            }
            System.out.println("| " + suma + " |");
        }
    }
}

class main_10{
    public static void main(String[] args) {
        Ejercicio_10 ej = new Ejercicio_10();
        ej.execute();
    }
}

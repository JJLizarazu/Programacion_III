/*
* Programa que declare tres vectores "vector1", "vector2" y "vector3" de cinco enteros
* cada  uno, pida valores para "vector1" y "vector2" y calcule "vector3" = vector1 + vector2
* */

import java.util.*;
public class Ejercicio_7 {

    int[] vector1;
    int[] vector2;
    int[] vector3;

    Scanner sc;

    public Ejercicio_7() {
        vector1 = new int[5];
        vector2 = new int[5];
        vector3 = new int[5];

        sc = new Scanner(System.in);
    }

    public void execute() {
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("| Vector 1 | [" + i + "] |:");
            vector1[i] = sc.nextInt();

            System.out.print("| Vector 2 | [" + i + "] |:");
            vector2[i] = sc.nextInt();

            vector3[i] = vector1[i] + vector2[i];
            System.out.println("| Vector 3 | [" + i + "] |:" + vector3[i]);

        }
    }
}

class Main_7{
    public static void main(String[] args) {
        Ejercicio_7 e = new Ejercicio_7();
        e.execute();
    }
}
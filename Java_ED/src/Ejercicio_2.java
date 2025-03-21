/*
*  Crea un vector de de 5 elementos de cadenas de caracteres, inicializa el vector con datos leídos por el teclado.
*  Copia los elementos del vector en otro vector pero en orden inverse, y muéstralo por la pantalla.
* */

import java.util.*;

public class Ejercicio_2 {
    String[] vector;
    String[] inverse;

    Scanner sc;

    public Ejercicio_2() {
        vector = new String[5];
        inverse = new String[5];

        sc = new Scanner(System.in);

    }

    public void fillVector(){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Original [" + i + "]| -> ");
            vector[i] = sc.nextLine();
        }
    }

    public void inverseVector(){
        int indexVector = 0 ;
        int indexInverse = 4;
        while (indexVector < vector.length) {
            inverse[indexInverse] = vector[indexVector];
            indexVector++;
            indexInverse--;
        }
    }

    public void printVectors() {
        System.out.println();
        System.out.println("  ORIGINAL   INVERSO");
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < inverse.length; j++) {
                System.out.println("   | " + vector[i] + " |      | " + inverse[j] + " | ");
                i++;
            }
        }
    }
}

class Main_2{
    public static void main(String[] args) {
        Ejercicio_2 vector_1 = new Ejercicio_2();
        vector_1.fillVector();
        vector_1.inverseVector();
        vector_1.printVectors();
    }
}

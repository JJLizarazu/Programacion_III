/*
*   Se requiere un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas entre 0 y 10)
*   A continuación debe mostrar todas las notas, la nota media, la nota mas alta que ha sacado y la menor
* */

import java.util.*;

public class Ejercicio_3 {
    int[] notes;
    Scanner sc;

    public Ejercicio_3() {
        notes = new int[5];
        sc = new Scanner(System.in);
    }

    public void fillNotes(){
        for (int i = 0; i < notes.length ; i++) {
            System.out.print("| Nota [" + i +"] | : ");
            notes[i] = sc.nextInt();
        }
    }

    public void printNotes(){
        double sum = 0, average, min = 10, max = 0;
        System.out.println();
        System.out.println(" ----> NOTAS <----");
        for (int i = 0; i < notes.length ; i++) {
            System.out.println("| Nota [" + i +"] | :" + notes[i]);
            sum += notes[i];
            if (notes[i] < min) min = notes[i];
            if (notes[i] > max) max = notes[i];
        }
        System.out.println(" ------------------");

        average = sum / notes.length;
        System.out.println();
        System.out.println(" ----------------------");
        System.out.println(" | Promedio | : " + average);
        System.out.println(" |  Minimo  | : " + min);
        System.out.println(" |  Maximo  | : " + max);
        System.out.println(" ----------------------");
    }
}

class Main_3{
    public static void main(String[] args) {
        Ejercicio_3 notes_1 = new Ejercicio_3();
        notes_1.fillNotes();
        notes_1.printNotes();
    }
}

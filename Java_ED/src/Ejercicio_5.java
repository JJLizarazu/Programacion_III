/*
* Hacer un programa que inicialice un vetor de número con valores aleatorios,
* y posterior ordenelos elementos de menor a mayor.
* */

public class Ejercicio_5 {
    int[] vector;

    public Ejercicio_5() {
        vector = new int[10];
    }

    public void execute(){
        for (int i = 0; i < vector.length; i++) {
            int random = (int) (Math.random() * 100 + 1);

            vector[i] = random;
        }

        System.out.println("-------------------");
        System.out.println("| VECTOR ORIGINAL |");
        System.out.println("-------------------");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("| Vector [" + i + "]: " + vector[i]);
        }

        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    int aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
        System.out.println("-------------------");
        System.out.println("| VECTOR ORDENADO |");
        System.out.println("-------------------");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("| Vector [" + i + "]: " + vector[i]);
        }

    }

}

class Main_5{
    public static void main(String[] args) {
        Ejercicio_5 e = new Ejercicio_5();
        e.execute();
    }
}

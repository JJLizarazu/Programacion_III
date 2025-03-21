public class Ejercicio_1 {
    int[] vector  = new int[10];

    public Ejercicio_1() {

    }

    public void llenarVector(){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * 10 + 1);
        }
    }

    public void printVector(){
        for (int i = 0; i < vector.length; i++) {
            for (int j : vector) {
                int square = (int) Math.pow(j, 2);
                int cube = (int) Math.pow(j, 3);
                System.out.print("| Vector [" + i + "] |");
                System.out.println(" | " + j + " | Cuadrado | " + square + " | Cubo | " + cube + " |");
                i++;
            }
        }
    }

}

class Main{
    public static void main(String[] args) {
        Ejercicio_1 vector_1 = new Ejercicio_1();
        vector_1.llenarVector();
        vector_1.printVector();
    }
}

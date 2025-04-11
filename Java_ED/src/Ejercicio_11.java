public class Ejercicio_11 {
    int[][] diagonal;

    public Ejercicio_11() {
        diagonal = new int[5][5];
    }

    public void execute() {
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                if(i == j){
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }

    }

}

class Main_11{
    public static void main(String[] args) {
        Ejercicio_9 ej = new Ejercicio_9();
        ej.execute();
    }
}

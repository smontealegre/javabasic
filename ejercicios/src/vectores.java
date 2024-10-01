public class vectores {
    public static void main(String[] args) {
        // crear array (vector)
        int[] miVector = {1, 2, 3, 4, 5};

        // acceder a un elemento (el índice empieza en 0)
        System.out.println("El segundo elemento es: " + miVector[1]);

        // array
        for (int i = 0; i < miVector.length; i++) {
            miVector[i] += 2;
        }

        // imprimir nuevo array
        for (int num : miVector) {
            System.out.println(num);
        }
    }
}

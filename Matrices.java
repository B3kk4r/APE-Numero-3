import java.util.Scanner;
public class Matrices {
    public static void main(String[] args){
        int filas=2;
        int columnas=3;
        int matriz1[][]=completarMatriz(filas, columnas, "primera");
        int matriz2[][]=completarMatriz(filas, columnas, "segunda");

        int matriznum[][]=matriz1;

        System.out.println("La primera matriz es esta:");
        mostrarlaMatriz(matriznum);

        matriznum=matriz2;
        System.out.println("La segunda matriz es esta:");
        mostrarlaMatriz(matriznum);

        int resultadodematriz[][]=sumarMatrices( matriz1, matriz2);
        System.out.println("La suma de las matrices es la siguiente");
        mostrarlaMatriz(resultadodematriz);

        resultadodematriz=multiplicarMatrices(matriz1, matriz2);
        System.out.println("La multiplicacion de las matrices es la siguiente");
        mostrarlaMatriz(resultadodematriz);

        resultadodematriz=restarMatrices( matriz1, matriz2);
        System.out.println("La resta de las matrices es la siguiente");
        mostrarlaMatriz(resultadodematriz);    

    }

    public static int[][] completarMatriz(int filas, int columnas, String Nombre) {
        Scanner entrada = new Scanner(System.in);

        int matriz[][] = new int[filas][columnas]; 

        System.out.printf("\n Ingrese los valores que tendrá la %s matriz \n", Nombre);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();

            }
        }
        return matriz;
    }


    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = 2;
        int columnas = 3;
        int resultado[][] = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = 2;
        int columnas = 3;
        int resultado[][] = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }
        return resultado;
    }


    public static int[][] restarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = 2;
        int columnas = 3;
        int resultado[][] = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        return resultado;
    }

    public static void mostrarlaMatriz(int [][] matriz) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}



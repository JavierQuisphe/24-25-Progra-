
import java.lang.reflect.Array;

public class Main5 {
    public static void main(String[] args) {
        int[][] numeros = new int[3][2][2];
        numeros[0][0][0] = 5;
        System.out.println(Array.deepToString(numeros));
    }
}
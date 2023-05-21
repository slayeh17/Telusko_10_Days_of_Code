import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PascalTriangle {

    private static Map<Integer, Integer> cache = new HashMap<>();

    static int fact(int n) {
        if(n==0)
        return 1;

        if(cache.containsKey(n))
        return cache.get(n);

        int result = n * fact(n-1);
        cache.put(n, result);
        return result;
    }

    static int combination(int n, int r) {
        return fact(n)/(fact(r) * fact(n-r));
    }

    static void pascalTriangle(int rows) {
        for(int i=0; i<rows; i++) {
            for(int s=rows-1; s>i; s--)
            System.out.print(" ");
            for(int j=0; j<=i; j++) {
                System.out.print(combination(i, j)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows in the triangle: ");
        int rows = in.nextInt();
        pascalTriangle(rows);
        in.close();
        //System.out.println(cache);
    }   
}

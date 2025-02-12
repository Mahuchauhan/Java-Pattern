6 6 6 6 6 6 6 6 6 6 6 
6 5 5 5 5 5 5 5 5 5 6 
6 5 4 4 4 4 4 4 4 5 6 
6 5 4 3 3 3 3 3 4 5 6 
6 5 4 3 2 2 2 3 4 5 6 
6 5 4 3 2 1 2 3 4 5 6 
6 5 4 3 2 2 2 3 4 5 6 
6 5 4 3 3 3 3 3 4 5 6 
6 5 4 4 4 4 4 4 4 5 6 
6 5 5 5 5 5 5 5 5 5 6
6 6 6 6 6 6 6 6 6 6 6 

public class BoxPattern {
    public static void main(String[] args) {
        int n = 5; 
        int size = 2 * n - 1; 

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int num1 = n - Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                //another logic
                //int num1 = n - Math.max(Math.abs(n - 1 - i), Math.abs(n - 1 - j));
                System.out.print(num1+" ");
            }
            System.out.println();
        }
    }
}

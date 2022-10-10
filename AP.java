public class AP {
    public static void main(String[] args) {
        System.out.println( nthTermOfAP(2, 3, 4));
    }

    public static int nthTermOfAP(int A1, int A2, int N) {
        // code here
        int diff = A2 - A1;
        int series = A1;
        for(int i = 1; i <= N-1; i++) {
            series += diff;

        }
        return series;
    }
}



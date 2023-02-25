public class NumberPyramidPattern {
    public static void printNumberPyramidPattern(int N) {
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j < N*2; j++) {
                if(i+j >= N+1 && j-i <= N-1) {
                    if(i >= 10) {
                        System.out.print(i);
                    } else {
                        System.out.print(i + " ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
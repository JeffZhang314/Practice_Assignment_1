public class Three {
    public static void main(String [] args) {
        int sum100Naturals = 0;
        int sum100Squares = 0;
        for (int i = 0; i <= 100; i ++) {
            sum100Naturals += i;
            sum100Squares += Math.pow(i, 2);
        }
        System.out.println(Math.pow(sum100Naturals, 2) - sum100Squares);
    }
}
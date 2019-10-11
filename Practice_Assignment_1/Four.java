public class Four {
    public static void main(String [] args) {
        for (int a = 1; a < 333; a ++) {
            for (int b = a + 1; b < 500; b ++) {
                int c = 1000 - a - b;
                if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                    System.out.println(a * b * c);
                }
            }
        }
    }
}
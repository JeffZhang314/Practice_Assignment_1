public class Two {
    public static void main(String [] args) {
        int smallestTerm = 1;
        int middleTerm = 2;
        int largestTerm;
        int answer = 0;
        while (middleTerm <= 4000000) {
            largestTerm = smallestTerm + middleTerm;
            if (middleTerm % 2 == 0) {
                answer += middleTerm;
            }
            smallestTerm = middleTerm;
            middleTerm = largestTerm;
        }
        System.out.println(answer);
    }
}
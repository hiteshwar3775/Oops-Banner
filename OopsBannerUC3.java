public class OopsBannerUC3 {
    public static void main(String[] args) {
        // Each letter is represented in 7 lines, 9 characters wide
        String[] O = {
            String.join("", " ", "*", "*", "*", "*", "*", "*", "*", " "),
            String.join("", "*", " ", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", " ", "*"),
            String.join("", " ", "*", "*", "*", "*", "*", "*", "*", " ")
        };

        String[] P = {
            String.join("", "*", "*", "*", "*", "*", "*", " ", " "),
            String.join("", "*", " ", " ", " ", " ", " ", "*", " "),
            String.join("", "*", " ", " ", " ", " ", " ", "*", " "),
            String.join("", "*", "*", "*", "*", "*", "*", " ", " "),
            String.join("", "*", " ", " ", " ", " ", " ", " ", " "),
            String.join("", "*", " ", " ", " ", " ", " ", " ", " "),
            String.join("", "*", " ", " ", " ", " ", " ", " ", " ")
        };

        String[] S = {
            String.join("", " ", "*", "*", "*", "*", "*", "*", "*", " "),
            String.join("", "*", " ", " ", " ", " ", " ", " ", " "),
            String.join("", "*", " ", " ", " ", " ", " ", " ", " "),
            String.join("", " ", "*", "*", "*", "*", "*", "*", " "),
            String.join("", " ", " ", " ", " ", " ", " ", " ", "*"),
            String.join("", " ", " ", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*", " ")
        };

        // Print OOPS banner line by line
        for (int i = 0; i < 7; i++) {
            System.out.println(O[i] + "   " + O[i] + "   " + P[i] + "   " + S[i]);
        }
    }
}
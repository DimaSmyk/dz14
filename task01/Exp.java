package selfwork14.task01;

public class Exp {

    public static void main(String[] args) {
        String str1 = "enter";
        String str2 = "reader";

        try {
            exp(str1,str2);
            System.out.println(1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void exp(String str1, String str2) {
        String last2 = str2.substring(str2.length() - 1);

        if (str1.endsWith(last2)) {
            throw new IllegalArgumentException("The last symbol of lines have " +
                    "the same last character. This: " + last2);
        }
        else {
            System.out.println("The last symbol of lines have" +
                    " DIFFERENT last character");
        }
    }
}

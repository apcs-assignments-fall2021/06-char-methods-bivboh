public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (Character.isUpperCase(ch)){
            ch = Character.toLowerCase(ch);
            return ch;
        }
        else {
            return ch;
        }
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not a lowercase letter,
    // it is returned unchanged.
    public static char toUpper(char ch) {
        if (Character.isLowerCase(ch)){
            ch = Character.toUpperCase(ch);
        }
        else {
            ch = ch;
        }
        return ch;
    }

    // The method is given a String as input and returns a
    // new String where all of the numbers have been removed
    // from the original String.
    public static String removeNumbers(String str) {
        String new_string = "";
        for (int i = 0; i < str.length(); i++){
            char new_char = str.charAt(i);
            if (new_char > 47 && new_char < 58){
                new_string = new_string;
            }
            else {
                new_string += new_char;

            }

        }
        return new_string;
    }

    // Write some code to test your methods!
    public static void main(String[] args) {
        // ADD SOME TESTING CODE HERE
    }
}

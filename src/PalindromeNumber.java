public class PalindromeNumber {
    public static void main(String[] args) throws Exception {
        int x = 101;
        String numString = String.valueOf(x);
        String output = "";
        for(int i = numString.length() - 1; i > -1; i --) {
            char a = numString.charAt(i);
            output += a;
        }
        if(output.equals(String.valueOf(x))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}

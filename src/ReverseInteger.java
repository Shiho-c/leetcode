public class ReverseInteger {
    public static void main(String[] args) throws Exception {
        int x = 321000320;
        String numString = String.valueOf(x);
        String output = "";
        int zeroable_ = 0;
        if(numString.charAt(0) == '-') {
            output += "-";
        }
        for(int i = numString.length() - 1; i > -1; i --) {
            char a = numString.charAt(i);
            if (a != 0) {
                zeroable_ = a;
                break;
            }
        }
        for(int i = numString.length() - 1; i > -1; i --) {
            char a = numString.charAt(i);
            if(i < zeroable_ && a != '-'){
                output += a;
            }   

        }
        //return output;
        System.out.println(Integer.valueOf(output));

    }
}

class Solution {
    public boolean isPalindrome(int x) {
        String numString = String.valueOf(x);
        String output = "";
        for(int i = numString.length() - 1; i > -1; i --) {
            char a = numString.charAt(i);
            output += a;
        }
        if(output.equals(String.valueOf(x))) {
            return true;
        } 
        return false;
    }
}
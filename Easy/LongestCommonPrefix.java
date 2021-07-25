class Solution {
    public String longestCommonPrefix(String[] strs) {
        String shortest_word = strs[0];
        String prefix = "";
        int shortest_length = strs[0].length();
        boolean finished = false;

        for(int i = 1; i < strs.length; i ++) {
            if(strs[i].length() < shortest_length) {
                shortest_length = strs[i].length();
                shortest_word = strs[i];
            }
        }
        for(int i = 0; i < shortest_length; i ++) {
            if(finished)
                break;
            char letter = shortest_word.charAt(i);
            int counter = 0;
            for(int a = 0; a < strs.length; a ++) {
                char letter_ = strs[a].charAt(i);
                if(letter == letter_) {
                    counter ++;
                    if(counter == strs.length) {
                        prefix += Character.toString(letter);
                    }
                } else {
                    finished = true;
                    break;
                }
                
            }
        }
        return prefix;
    }
}
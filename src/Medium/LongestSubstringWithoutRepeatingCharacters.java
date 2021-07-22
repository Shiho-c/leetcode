class Solution {
    public int lengthOfLongestSubstring(String s) {
        String[] repeats = new String[s.length()];
        int longest = 0;
        for(int i = 0; i < s.length(); i++) {
            char f = s.charAt(i);
            int tmp_counter = 1;
            repeats[i] = Character.toString(f);
            for(int b = i+1; b < s.length(); b++) {
                char g = s.charAt(b);
                if(repeats[i].contains(Character.toString(g))){
                    break;
                }
                tmp_counter ++;
                repeats[i] += g;
                
            }
            if(tmp_counter > longest) {
                longest = tmp_counter;
            }
        }
        return longest;
    }
}
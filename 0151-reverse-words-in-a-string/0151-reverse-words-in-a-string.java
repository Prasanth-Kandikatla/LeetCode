class Solution {
    public String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        s = s.trim();
        String[] words = s.split("\\s+");
        for(int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if(i != 0) reversed.append(" ");
        }

        return reversed.toString();
    }
}
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i< words.length; i++) {
            // String s = words[i];
            if(words[i].indexOf(x) != -1) {
                result.add(i);
            }
        }
        return result;
    }
}
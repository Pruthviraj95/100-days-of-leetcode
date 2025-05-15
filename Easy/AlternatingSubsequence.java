class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>();
        if (words == null || words.length == 0) {
            return result;
        }
        result.add(words[0]); // Always include the first word
        int prevGroup = groups[0];
        
        for (int i = 1; i < words.length; i++) {
            if (groups[i] != prevGroup) {
                result.add(words[i]);
                prevGroup = groups[i]; // Update the last used group
            }
        }
        return result;
    }
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int n = ransomNote.length();
        int m = magazine.length();

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> have = new HashMap<>();

        // Frequency of ransomNote
        for (int i = 0; i < n; i++) {
            char ch = ransomNote.charAt(i);
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        // Frequency of magazine
        for (int i = 0; i < m; i++) {
            char ch = magazine.charAt(i);
            have.put(ch, have.getOrDefault(ch, 0) + 1);
        }

        // Compare frequencies
        for (char ch : need.keySet()) {
            if (!have.containsKey(ch) || have.get(ch) < need.get(ch)) {
                return false;
            }
        }

        return true;
    }
}
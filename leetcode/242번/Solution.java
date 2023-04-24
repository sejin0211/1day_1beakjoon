class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character,Integer> sH = new HashMap<>();

        for(char x : s.toCharArray()){
            sH.put(x, sH.getOrDefault(x,0) + 1);
        }

        for(char x : t.toCharArray()) {
            if(!sH.containsKey(x) || sH.get(x) == 0) return false;
            sH.put(x, sH.get(x)-1);
        }

        return true;
    }
}
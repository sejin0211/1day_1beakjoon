class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> sH = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            sH.put(s.charAt(i), sH.getOrDefault(s.charAt(i),0) + 1);
        }

        for(int i = 0; i < s.length(); i++) {
            if(sH.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
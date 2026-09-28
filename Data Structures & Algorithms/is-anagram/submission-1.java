class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> appear = new HashMap<>();

        for(char c: s.toCharArray()){
            appear.put(c,appear.getOrDefault(c,0)+1);
        }

        for(char c: t.toCharArray()){
            int remaining = appear.getOrDefault(c,0);
            if(remaining == 0){
                return false;
            }

            appear.put(c, remaining - 1);
        }

        return true;
    }
}

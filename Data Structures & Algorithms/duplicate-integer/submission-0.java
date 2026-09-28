class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> seen = new HashMap<>();

        for(int num: nums){
            if(seen.containsKey(num)){
                return true;
            }
            seen.put(num, true);
        }

        return false;
    }
}
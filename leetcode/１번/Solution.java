class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        int n = nums.length;
        
        // O(n)
        HashMap<Integer,Integer> nH = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int y = target - nums[i];
            if(nH.containsKey(y)) return new int[]{i,nH.get(y)};
            nH.put(nums[i], i);
        }

        // O(n^2)
        //for(int i = 0; i < n; i++) {
        //    for(int j = i+1; j < n; j++)
        //    if(nums[i] + nums[j] == target){
        //        return new int[]{i,j};
        //    }
        //}
        return answer;
    }
}
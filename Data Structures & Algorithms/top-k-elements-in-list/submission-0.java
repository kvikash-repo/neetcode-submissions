class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        /**
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        **/
        Map<Integer,Integer> map = new HashMap<>();    
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            map.putIfAbsent(n, 1);            
            map.put(n, map.get(n)+1);        
        }
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            arr.add(new int[]{entry.getValue(),entry.getKey()});
        }
        arr.sort((a,b) -> b[0]-a[0]);

        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = arr.get(i)[1];
        }
        return result;
        
    }
}

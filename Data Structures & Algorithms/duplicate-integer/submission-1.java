class Solution {
    public boolean hasDuplicate(int[] nums) {
        int i = 0;
        int size = nums.length;
        ArrayList list = new ArrayList<>();
        while(i<size){
            if(list.contains(nums[i]))
              return true;
            list.add(nums[i]);
            i++;
        }    
    return false;
    }
}
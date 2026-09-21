class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list3 = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            if (nums[i] > 0)
                break;
            int left = i + 1;
            int target = -nums[i];
            int right = len - 1;
            // System.out.println("Target : "+ target+", Left : "+ left+", Right : "+ right);
            while (left < right) {
                int sum = nums[left] + nums[right];
                // System.out.println("Sum : "+sum);
                if (sum == target) {
                    list3.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // Skip duplicate elements for 'left'
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicate elements for 'right'
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < target)
                    left++;
                else
                    right--;
            }
        }
        return list3;
    }
}

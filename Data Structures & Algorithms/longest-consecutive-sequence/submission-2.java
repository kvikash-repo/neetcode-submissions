class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int n : nums) {
            numSet.add(n);
        }
        int longest = 0;

        for (int i = 0; i < nums.length; i++) {
            int length = 0;
            if (!numSet.contains(nums[i] - 1)) {
                while (numSet.contains(nums[i] + length)) {
                    length += 1;
                }
            }
            longest = Math.max(longest, length);
        }
        return longest;
    }
}

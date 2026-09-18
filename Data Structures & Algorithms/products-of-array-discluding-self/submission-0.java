class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int pr = 1;
    for(int i=0;i<nums.length;i++){
            if(i==0)
                prefix[i] = pr;
            else
                prefix[i] = prefix[i-1]*nums[i-1];
            //System.out.println(prefix[i]);
        }
        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1)
                postfix[i] = pr;
            else
                postfix[i] = postfix[i+1]*nums[i+1];
            //System.out.println(postfix[i]);
        }
        //System.out.println("-----");
        for(int i=0;i<nums.length;i++){
            nums[i] = prefix[i]*postfix[i];
            //System.out.println(nums[i]);
        }

        return nums;
    }
}  

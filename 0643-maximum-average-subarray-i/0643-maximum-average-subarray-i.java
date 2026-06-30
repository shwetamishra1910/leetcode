class Solution {
    public double findMaxAverage(int[] nums, int k) {
       
        int left=0;
        int right = k;
        double sum = 0;
        for(int i=left; i<right; i++){
                sum += nums[i];
        }
        double avg = sum/k;

        while(right<nums.length){
           
            sum = sum - nums[left] + nums[right];
            double avgsum = sum / k;
           
            avg = Math.max(avg , avgsum);
            left++;
            right++;
        }
        return avg;
    }
}
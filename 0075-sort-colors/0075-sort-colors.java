class Solution {
    public void sortColors(int[] nums) {

        int red = 0;
        int white = 0;
        int blue = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == 0)
                red++;

            else if(nums[i] == 1)
                white++;

            else
                blue++;
        }

        int i = 0;

        while(i < red) {
            nums[i] = 0;
            i++;
        }

        while(i < red + white) {
            nums[i] = 1;
            i++;
        }

        while(i < red + white + blue) {
            nums[i] = 2;
            i++;
        }
    }
}
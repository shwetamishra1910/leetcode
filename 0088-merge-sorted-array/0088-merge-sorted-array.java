class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int resP = m+n-1;
        int nums1P = m-1;
        int nums2P = n-1;
        while(nums1P>=0 && nums2P>=0){
            if(nums1[nums1P]>=nums2[nums2P]){
                nums1[resP]= nums1[nums1P];
                nums1P--;
                resP--;
            }
            else{
                nums1[resP] = nums2[nums2P];
                nums2P--;
                resP--;
            }

        }
        while(nums2P>=0){
            nums1[resP] = nums2[nums2P];
            nums2P--;
            resP--;
        }
       while(nums1P>=0){
            nums1[resP] = nums1[nums1P];
            nums1P--;
            resP--;
        }    
    }
}
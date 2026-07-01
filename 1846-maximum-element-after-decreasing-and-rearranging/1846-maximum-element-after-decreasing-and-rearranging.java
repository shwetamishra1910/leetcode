class Solution {
   
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        
        list.add(1);
        for(int i=1; i<arr.length; i++){
            int pre = list.get(list.size()-1);
            if(arr[i] <= pre+1) {
               list.add(arr[i]);
            }
            else{
                list.add(pre + 1);
            }
        }
       return list.get(list.size()-1);
    }
}
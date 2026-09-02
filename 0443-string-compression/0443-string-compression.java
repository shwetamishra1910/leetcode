class Solution {
    public int compress(char[] arr) {
        int idx = 0;
        int count = 1;
        for(int i=0; i<arr.length; i++){
            if(i+1<arr.length && arr[i]==arr[i+1]){
                count++;
            }
            else{
                arr[idx++] = arr[i];
                if(count>1){
                    String s = Integer.toString(count);
                    for(int j=0; j<s.length(); j++){
                        arr[idx++] = s.charAt(j);
                    }
                }
                count = 1;
            }
        }
        return idx;
    }
}
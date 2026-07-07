class Solution {
    public long sumAndMultiply(int n) {
       
        long rev = 0;
        while(n>0){
            int digit = n%10;
            if(digit != 0) rev = rev*10 + digit;
            n = n/10;
        }
        long num = 0;
        while(rev>0){
            long digit = rev%10;
            num = num*10 + digit;
            rev = rev/10;
        }
        long a = num;
        long sum =0;
        while(a>0){
            sum = sum + a%10;
            a = a/10;
        }
        return num * sum;

    }
}
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] time1 = startTime.split(":");
        String[] time2 = endTime.split(":");

        //formula
        // time = hours*3600 + min*60 + sec  , we want time in seconds

        //calculating start time
        int st = (Integer.parseInt(time1[0])*3600 ) + (Integer.parseInt(time1[1])*60) +Integer.parseInt(time1[2]);

        //calculating end time
        int et = (Integer.parseInt(time2[0])*3600) + (Integer.parseInt(time2[1])*60) + Integer.parseInt(time2[2]);

        //difference
        int ans = et - st;

        return ans;
        
    }
}
class Solution {
    public int[][] merge(int[][] intervals) {
        // if(intervals.length[]<=1){
        //     return intervals;
        // }
        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
        //creating result list 
        List<int []>result = new ArrayList<>();

        //Take first interval
        int [] newInterval = intervals[0];  //newInterval = [1,3]
        result.add(newInterval);             //result  = [1,3]

        for(int [] interval : intervals){
            if(interval[0]<=newInterval[1]){
                //overlap intervals
                //update the end if needed
                newInterval[1] = Math.max(interval[1],newInterval[1]);

            }else{
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);


        
    }
}
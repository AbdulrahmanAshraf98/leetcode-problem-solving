class Solution {
    public int majorityElement(int[] nums) {
       int majorityValue= nums.length/2;
       HashMap<Integer,Integer>numberFrequenceyApperers= new HashMap<>();
       for(int num: nums){
            if(!numberFrequenceyApperers.containsKey(num))numberFrequenceyApperers.put(num,1);
            else numberFrequenceyApperers.put(num,numberFrequenceyApperers.get(num)+1);
       }
       int maxFrequencey=-1;
       int max=-1;
       for(int num :numberFrequenceyApperers.keySet()){
            if(numberFrequenceyApperers.get(num)>maxFrequencey){
                maxFrequencey= numberFrequenceyApperers.get(num);
                max= num;
            }
       }
       return max ;
    }
}
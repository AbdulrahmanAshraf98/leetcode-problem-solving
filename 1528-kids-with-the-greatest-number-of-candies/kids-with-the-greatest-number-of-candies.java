class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxNumberOfCandies=getMaxNumberInArray(candies);
        int lowst = Math.abs(maxNumberOfCandies-extraCandies);
        List<Boolean> result = new ArrayList();
        for(int num:candies){
            if(num<lowst)result.add(false);
            else result.add(true);
        }
        return result;
    }
    public static   int getMaxNumberInArray(int[] nums){
        int maxNumberOfCandies=0;
        for(int num:nums){
            if(num>maxNumberOfCandies)
                maxNumberOfCandies=num;
        } 
        return maxNumberOfCandies;
    }
}
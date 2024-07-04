class Solution {
    public int arraySign(int[] nums) {
        int countNagitive=0;
        for(int num:nums){
            if(num==0)return 0;
            else if(num<0 && countNagitive==0)countNagitive++;
            else if(num<0 && countNagitive>0)countNagitive--;
        }
        return countNagitive>0?-1:1;
    }
}
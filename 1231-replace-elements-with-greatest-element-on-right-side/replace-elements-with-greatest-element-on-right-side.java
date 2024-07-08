class Solution {
    public int[] replaceElements(int[] nums) {
         int maxRightElement = -1;
        for(int i = nums.length-1; i>=0;i--){
            int current= nums[i];
            nums[i]=maxRightElement;
            maxRightElement=Math.max(maxRightElement,current);
        }
        // int i = 0;
        // int j = i+1;
        // int maxRightElement = -1;
        // while(i<arr.length){
        //     if(i==arr.length-1)arr[i]=-1;
        //     if(j==arr.length){
        //         arr[i]=maxRightElement;
        //         i++;
        //         j=i+1;
        //         maxRightElement= -1; 
        //     }
        //     else{
        //         maxRightElement=Math.max(arr[j],maxRightElement);
        //         j++;
        //     }
            
        // }
        return nums;
    }
}
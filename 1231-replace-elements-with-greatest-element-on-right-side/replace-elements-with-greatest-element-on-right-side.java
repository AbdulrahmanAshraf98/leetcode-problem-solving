class Solution {
    public int[] replaceElements(int[] arr) {
        int i = 0;
        int j = i+1;
        int maxRightElement = -1;
        while(i<arr.length){
            if(i==arr.length-1)arr[i]=-1;
            if(j==arr.length){
                arr[i]=maxRightElement;
                i++;
                j=i+1;
                maxRightElement= -1; 
            }
            else{
                maxRightElement=Math.max(arr[j],maxRightElement);
                j++;
            }
            
        }
        return arr;
    }
}
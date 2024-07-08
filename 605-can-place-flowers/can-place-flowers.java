class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] newflowerbed = new int[flowerbed.length+2];
        newflowerbed[0]=0;
        newflowerbed[newflowerbed.length-1]=0;
        for(int i =0 ; i<flowerbed.length;i++){
            newflowerbed[i+1]=flowerbed[i];
        }
        int i =1;
        while(i<newflowerbed.length-1){
            if(newflowerbed[i-1]==0&&newflowerbed[i]==0&&newflowerbed[i+1]==0){
                newflowerbed[i]=1;
                n--;
            }
            i++;
        }
        return n<=0;
    }
}
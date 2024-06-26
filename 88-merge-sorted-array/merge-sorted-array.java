class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergeSortedArray=new int[m+n];
        int i = 0 ; 
        int j = 0 ; 
        int c = 0;
        while(i<m&&j<n){
            if(nums1[i]<nums2[j]){
                mergeSortedArray[c]=nums1[i];
                i++;
            }
            else{
                 mergeSortedArray[c]=nums2[j];
                 j++;
            }
            c++;
        }
        while(i<m){
            mergeSortedArray[c]=nums1[i];
            i++;
            c++;
        }

        while(j<n){
            mergeSortedArray[c]=nums2[j];
            j++;
            c++;
            }
        for (int k = 0; k < m+n; k++) {
            if(nums1[k]!=mergeSortedArray[k])
            nums1[k] = mergeSortedArray[k];
        }
    }
}
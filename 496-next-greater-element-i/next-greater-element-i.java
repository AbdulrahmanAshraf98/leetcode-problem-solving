class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> subset = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            subset.put(nums1[i], i);
        }
        int[] answer = new int[nums1.length];
        Arrays.fill(answer,-1);
        for(int i =0; i<nums2.length;i++ ){
            if(!subset.containsKey(nums2[i]))continue;
            for(int j= i+1 ; j<nums2.length;j++){
                if(nums2[i]<nums2[j]){
                    answer[subset.get(nums2[i])]=nums2[j];
                    break;
                }
            }
        }
        return answer;
    }
}
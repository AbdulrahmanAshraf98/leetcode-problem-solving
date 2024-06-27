class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequent = new HashMap<>();
        for(int num:nums){
            if(frequent.get(num)!=null) frequent.put(num,frequent.get(num)+1);
            else frequent.put(num,1);
        }
        List<Integer> ans = new ArrayList<>();
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(frequent.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        int[] output=new int[k];
        for (int i=0 ; i<k ; i++){
            output[i]=list.get(i).getKey();
        }
        return output;
        
    }
}
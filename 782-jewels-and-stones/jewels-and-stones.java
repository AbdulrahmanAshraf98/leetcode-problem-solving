class Solution {
    public int numJewelsInStones(String j, String s) {
        HashSet<Character> jewels= new HashSet<>();
        int count=0;
        for(char jewel: j.toCharArray()){
            jewels.add(jewel);
        }
        for(char stone: s.toCharArray()){
            if(jewels.contains(stone))count++;
        }
        return count;
    }
}
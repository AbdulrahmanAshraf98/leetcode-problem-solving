class Solution {
    public int countGoodSubstrings(String s) {
            if(s.length()<3)return 0;
            int k  =3;
            StringBuilder subString = new StringBuilder();
            int uniqueSubStringCount=0;
            for(int i=0; i<k ; i++){
                subString.append(s.charAt(i));
            }
            if(!checkIsContainDuplication(subString.toString()))uniqueSubStringCount++;
            for(int i = k ; i<s.length(); i++){
                subString.deleteCharAt(0);
                subString.append(s.charAt(i));
                if(!checkIsContainDuplication(subString.toString()))uniqueSubStringCount++;
            }
            return uniqueSubStringCount;
        }
    public   boolean checkIsContainDuplication(String s){
        Set<Character> characters= new HashSet<>();
        for(char c : s.toCharArray()){
            if(!characters.add(c))return  true;
        }
        return false;
    }
    }
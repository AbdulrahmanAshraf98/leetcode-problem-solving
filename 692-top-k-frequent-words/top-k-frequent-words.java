class Solution {
    HashMap<String,Integer> frequentWords;
    List<String> candidates;
    public List<String> topKFrequent(String[] words, int k) {
         if(words == null || words.length == 0) {
            return new ArrayList<String>();
        }
        frequentWords= new HashMap<>();   
        for(String word : words ){
            if(frequentWords.get(word)!=null)frequentWords.put(word,frequentWords.get(word)+1);
            else frequentWords.put(word,1);
        }
        candidates = new ArrayList<>(frequentWords.keySet());
        Collections.sort(candidates, (w1, w2) -> frequentWords.get(w1).equals(frequentWords.get(w2)) ?
                w1.compareTo(w2) : frequentWords.get(w2) - frequentWords.get(w1));
        return candidates.subList(0, k);

    }
}
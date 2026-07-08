class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String num : words) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        List<String> ll = new ArrayList<>(map.keySet());
        ll.sort((a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return a.compareTo(b); 
            }
            return map.get(b) - map.get(a); 
        });
        for (int i = 0; i < k; i++) {
            ans.add(ll.get(i));
        }
        return ans;
    }
}
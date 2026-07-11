class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        return make(strs);
        
    }
      public static List<List<String>> make(String[] arr) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String key = AnagramKey(arr[i]);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(arr[i]);
        }
        List<List<String>> ans = new ArrayList<>();
        for (String key : map.keySet()) {
            ans.add(map.get(key));
        }

        return ans;
    }

    private static String AnagramKey(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < freq.length; i++) {
            sb.append(freq[i] + " ");
        }
        return sb.toString();
    }
}
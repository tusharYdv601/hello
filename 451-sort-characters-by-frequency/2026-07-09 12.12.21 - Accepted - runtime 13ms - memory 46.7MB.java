class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Character> ll = new ArrayList<>(map.keySet());
        ll.sort((a, b) -> map.get(b) - map.get(a));
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < ll.size(); i++) {
            char currentChar = ll.get(i);
            int frequency = map.get(currentChar);

            for (int j = 0; j < frequency; j++) {
                result.append(currentChar);
            }
        }
        return result.toString();

    }
}
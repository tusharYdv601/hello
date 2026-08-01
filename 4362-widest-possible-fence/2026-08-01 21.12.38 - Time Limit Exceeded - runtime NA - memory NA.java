class Solution {
    public int maximumWidth(int[] planks) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i : planks) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            max = Math.max(max, i);
        }

        Set<Integer> height = new HashSet<>();
        for (int i : map.keySet()) {
            height.add(i);
        }
        List<Integer> uni = new ArrayList<>(map.keySet());
        for (int i = 0; i < uni.size(); i++) {
            int p = uni.get(i);
            for (int j = i; j < uni.size(); j++) {
                int p1 = uni.get(j);
                height.add(p1 + p);
            }
        }

        int ans = 0;
        for (int tar : height) {
            int cur = 0;
            cur += map.getOrDefault(tar, 0);
            for (int x : uni) {
                if (x * 2 > tar)
                    continue;
                int y = tar - x;

                if (x == y) {
                    cur += map.get(x) / 2;
                } else if (map.containsKey(y)) {
                    cur += Math.min(map.get(x), map.get(y));
                }
            }
            ans = Math.max(ans, cur);
        }
        return ans;

    }

}
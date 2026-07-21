class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int one = 0, max = 0, cz = 0;
        int pz = Integer.MIN_VALUE / 2;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                one++;
                if (cz > 0) {
                    pz = cz;
                }
                cz = 0;
            } else {
                cz++;
                max = Math.max(max, pz + cz);
            }
        }
        return one + max;

    }
}
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        List<Integer> result = new ArrayList<>();
        int  min= String.valueOf(low).length();
        int max = String.valueOf(high).length();
        for (int length = min; length <= max; length++) {
            for (int start = 0; start <= 9 - length; start++) {
                String sub = s.substring(start, start + length);
                int num = Integer.parseInt(sub);
                
                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }
        
        return result;
    }
}
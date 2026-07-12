class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0){
            return arr;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr1 = arr.clone();
        Arrays.sort(arr);
        int rank = 1;
        map.put(arr[0], 1);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                rank++;
            }
            map.put(arr[i], rank);
        }
        for (int i = 0; i < arr.length; i++) {
            arr1[i]=map.get(arr1[i]);

        }
        return arr1;
    }
}
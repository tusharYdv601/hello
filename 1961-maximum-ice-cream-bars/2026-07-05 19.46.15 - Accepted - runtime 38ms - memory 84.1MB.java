class Solution {
    public int maxIceCream(int[] arr, int coins) {
        Arrays.sort(arr);
        int i=0;
        for(i=0;i<arr.length;i++){
            if(coins-arr[i]<0){
                break;
            }
            coins-=arr[i];
        }
        return i;
        
    }
}
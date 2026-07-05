class Solution {
    public long subArrayRanges(int[] arr) {
        return getmax(arr)-getmin(arr);
    
    }
    public long getmax(int []arr){
        long sum=0;
        Stack<Integer> st= new Stack<>();
        for(int i= 0 ; i<=arr.length;i++){
            while(!st.isEmpty()&&(i==arr.length||arr[i]>arr[st.peek()])){
                int mid=st.pop();
                int left= st.isEmpty()?-1:st.peek();
                int right= i;
                long count=(long )(mid-left)*(right-mid);
                sum+=count*arr[mid];
            }
            st.push(i);
        }
        return sum;
    }
    public long getmin(int []arr){
        long sum=0;
        Stack<Integer> st= new Stack<>();
        for(int i= 0 ; i<=arr.length;i++){
            while(!st.isEmpty()&&(i==arr.length||arr[i]<=arr[st.peek()])){
                int mid=st.pop();
                int left= st.isEmpty()?-1:st.peek();
                int right= i;
                long count=(long )(mid-left)*(right-mid);
                sum+=count*arr[mid];
            }
            st.push(i);
        }
        return sum;
    }
}
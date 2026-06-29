class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        make(nums,ll,l);
        return ll;
    }

    public void make(int[] arr, List<List<Integer>> ll, List<Integer> l) {
        if (l.size() == arr.length) {
            ll.add(new ArrayList(l));
            return ;
        }
        for(int i=0;i<arr.length;i++){
            if (l.contains(arr[i])) {
                continue;
            }
            l.add(arr[i]);
            make(arr,ll,l);
            l.removeLast();
        }
    }
}
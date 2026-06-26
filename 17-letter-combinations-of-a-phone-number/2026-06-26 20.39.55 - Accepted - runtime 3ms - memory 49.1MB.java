class Solution {
    static String[] key = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ll = new ArrayList<>();
        print(digits, "",ll);
        return ll;
        
    }
    public static void  print(String d, String ans,List<String>ll) {
        if(d.length()==0){
            ll.add(ans);
            return ;
        }
        int l = d.charAt(0) - '0';
        String str= key[l];
        for (int i = 0; i < str.length(); i++) {
            print(d.substring(1),ans+str.charAt(i),ll);
        }

    }
}
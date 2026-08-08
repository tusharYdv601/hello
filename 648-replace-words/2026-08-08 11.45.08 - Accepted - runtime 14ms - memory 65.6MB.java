class Solution {

    public class replaceWords648 {
        class Node {
            char ch;
            String isterminal;
            int count;
            HashMap<Character, Node> child;

            public Node(char ch) {
                this.ch = ch;
                child = new HashMap<>();
            }
        }

        private Node root;

        public replaceWords648() {
            root = new Node('*');
        }

        public void insert(String word) {
            Node curr = root;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (curr.child.containsKey(ch)) {
                    curr = curr.child.get(ch);
                    curr.count++;
                } else {
                    Node node = new Node(ch);
                    curr.child.put(ch, node);
                    curr = node;

                }
            }
            curr.isterminal = word;
        }

        public String getString(String word) {
            Node curr = root;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (curr.child.containsKey(ch)) {
                    curr = curr.child.get(ch);
                    if (curr.isterminal != null) {
                        return curr.isterminal;
                    }
                } else {
                    return word;
                }
            }
            return word;
        }

    }

    public String replaceWords(List<String> dictionary, String sentence) {
        replaceWords648 t = new replaceWords648();
        for (String s : dictionary) {
            t.insert(s);
        }
        String[] arr = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(t.getString(arr[i]) + " ");

        }
        return sb.toString().trim();
    }

}
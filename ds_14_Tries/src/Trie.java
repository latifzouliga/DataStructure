public class Trie {

    TrieNode root;

    // construct empty trie node
    public Trie() {
        root = new TrieNode();
    }

    // insert a new word into trie
    public void insert(String word) {

        TrieNode current = root;
        char[] arr = word.toCharArray();

        for (char each : arr) {
            // if each (char) is not in the map, add it and add an empty trieNode
            if (!current.children.containsKey(each)) {
                current.children.put(each, new TrieNode());
            }
            // jumping from the current node to the node that is just inserted
            // for example if we want to insert the word cat:
            // 1 - first of all we are now in the root which is an empty TrieNode
            // 2 - then we need to check if character 'c' is one of children of that empty root trieNode
            // 3 - if 'c' is not a child then we need to add it as a key and new TrieNode as a value
            // 4 - the next step is to inset character 'a', but remember we are still in the root and the root has now only one child which is character 'c'
            // 5 - to inset character 'a' we need to traverse from trieNode root to 'c' trieNode and repeat the above steps.
            current = current.children.get(each); // move to the next node
        }
        current.isWord = true; // marking the inserted word as inserted
    }

    public boolean search(String word) {

        TrieNode current = root;
        char[] arr = word.toCharArray();

        for (char each : arr) {
            if (!current.children.containsKey(each)){
                return false;
            }
            current = current.children.get(each); // move to the next node
        }
        return current.isWord;
    }


    public boolean startsWith(String prefix) {

        TrieNode current = root;
        char[] arr = prefix.toCharArray();

        for (char each : arr) {
            if (!current.children.containsKey(each)){
                return false;
            }
            current = current.children.get(each); // move to the next node
        }
        return true;

    }


}

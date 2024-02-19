public class TrieMainApp {

    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("word");

        System.out.println(trie.search("word"));
        System.out.println(trie.startsWith("wor"));

        trie.insert("apple");
        System.out.println("search apple: "+trie.search("apple"));
        System.out.println("search app: "+trie.search("app"));

        trie.insert("app");
        System.out.println("==== after inserting app ====");
        System.out.println("search app: "+ trie.search("app"));

    }
}

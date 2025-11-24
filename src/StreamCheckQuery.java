import java.util.*;
class StreamChecker {
    class TrieNode {
        boolean isWord;
        TrieNode[] children = new TrieNode[26];
    }
    TrieNode root = new TrieNode();
    StringBuilder stream = new StringBuilder();
    int maxLen = 0;
    private void insert(String word) {
        TrieNode node = root;
        maxLen = Math.max(maxLen, word.length());
        for (int i = word.length() - 1; i >= 0; i--) {
            int idx = word.charAt(i) - 'a';
            if (node.children[idx] == null)
                node.children[idx] = new TrieNode();
            node = node.children[idx];
        }
        node.isWord = true;
    }
    public StreamChecker(String[] words) {
        for (String w : words)
            insert(w);
    }
    public boolean query(char letter) {
        stream.append(letter);
        TrieNode node = root;
        int count = 0;
        for (int i = stream.length() - 1; i >= 0 && count < maxLen; i--) {
            int idx = stream.charAt(i) - 'a';
            if (node.children[idx] == null)
                return false;
            node = node.children[idx];
            if (node.isWord)
                return true;
            count++;
        }
        return false;
    }
}
public class StreamCheckQuery {
    public static void main(String[] args) {
        String[] words = {"abc", "xyz"};
        StreamChecker sc = new StreamChecker(words);
        System.out.println(sc.query('a'));
        System.out.println(sc.query('x'));
        System.out.println(sc.query('y'));
        System.out.println(sc.query('z'));
    }
}


package com.codecool.javatries;

import sun.text.normalizer.Trie;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AutoComplete {

    private TrieDataNode root;

    /**
     * Starts a new Trie with dummy root data "-"
     */
    public AutoComplete() {
        root = new TrieDataNode('-');
    }

    /**
     * Adds a word to the Trie.
     * @param wordToAdd
     */
    public void addWord(String wordToAdd) {
        TrieDataNode current = root;
        for (char currentChar : wordToAdd.toCharArray()) {
            TrieDataNode child = isChildContainChar(current, currentChar);
            if (child == null) {
                TrieDataNode newNode = new TrieDataNode(currentChar);
                current.addChild(newNode);
                current = newNode;
            } else {
                current = child;
            }
        }
        current.setTerminate(true);
    }


    /**
     * Returns the possible completions of baseChars String from the Trie.
     * @param baseChars The String to autocomplete.
     * @return possible completions. An empty list if there are none.
     */
    public List<String> autoComplete(String baseChars) {
        List<String> words = new ArrayList<>();
//        TrieDataNode current = root;
//
//        for (int i = 0; i < wordToAdd.length(); i++){
//            TrieDataNode child = isChildContainChar(current, wordToAdd.charAt(i));
//            if (child != null){
//                current = child;
//            }
//        }
        return null;
    }

    private TrieDataNode isChildContainChar(TrieDataNode node, char searchedChar){
        for (TrieDataNode child : node.getChild()) {
            if (child.getData() == searchedChar){
                return child;
            }
        }
        return null;
    }

    /**
     * Removes a word from the Trie
     * @param wordToRemove
     * @return true if the removal was successful
     */
    public boolean removeWord(String wordToRemove) {
        return false;
    }

    public static void main(String[] args) {
        AutoComplete ac = new AutoComplete();
        ac.addWord("fun");
        ac.addWord("funky");
        ac.addWord("fund");
        ac.addWord("fundament");
        ac.addWord("fundamental");
        ac.addWord("a");
        ac.addWord("abc");
        ac.addWord("acb");
    }
}

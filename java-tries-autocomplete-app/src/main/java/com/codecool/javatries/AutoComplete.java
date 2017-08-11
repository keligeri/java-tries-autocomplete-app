package com.codecool.javatries;

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

    }

    /**
     * Returns the possible completions of baseChars String from the Trie.
     * @param baseChars The String to autocomplete.
     * @return possible completions. An empty list if there are none.
     */
    public List<String> autoComplete(String baseChars) {
        List<String> words = new ArrayList<>();
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
}

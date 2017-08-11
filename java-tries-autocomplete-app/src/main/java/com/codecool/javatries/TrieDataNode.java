package com.codecool.javatries;

import java.util.LinkedList;
import java.util.List;

public class TrieDataNode {

    private char data;

    /**
     * Initializes a TrieDataNode with its data
     * @param data
     */
    public TrieDataNode(char data) {
        this.data = data;
    }

    /**
     * Getter for data
     * @return data
     */
    public char getData() {
        return data;
    }

    @Override
    public String toString() {
        return Character.toString(data);
    }

}

package com.codecool.javatries;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TrieDataNode {

    private char data;
    private List<TrieDataNode> child = new ArrayList<>();
    private boolean isTerminate;


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

    public void addChild(TrieDataNode child){
        this.child.add(child);
    }

    public boolean getIsTerminate() {
        return isTerminate;
    }

    public void setTerminate(boolean terminate) {
        isTerminate = terminate;
    }

    public List<TrieDataNode> getChild() {
        return child;
    }

    @Override
    public String toString() {
        return Character.toString(data);
    }

}

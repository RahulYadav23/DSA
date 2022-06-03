package com.Trie;

public class TrieMain {
    public static void main(String[] args)
    {
        Trie tt= new Trie();
        tt.insert("rahul");
        tt.insert("raya");
        System.out.println(tt.search("rahul"));
        System.out.println(tt.search("ray"));
    }
}

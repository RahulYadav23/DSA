package com.Heap;

public class HeapMain {

    public static void main(String[] args)
    {
        HeapArray heap = new HeapArray(10);
        heap.insert(20);
        heap.insert(30);
        heap.insert(40);
        heap.insert(50);
        heap.insert(60);
        heap.displayheap();

    }
}

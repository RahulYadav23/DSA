package com.Heap;

public class HeapArray {
    private int[] heap;
    private int size;

    HeapArray(int capacity){
        this.heap = new int[capacity];
        this.size=0;
    }
    public int peek()
    {
        return heap[0];
    }
    public int getparentIndex(int index)
    {
        return (index-1)/2;
    }
    public int getchildindex(int index,boolean leftchild)
    {
        return 2*index + (leftchild?1:2);
    }
    public void insert(int val)
    {
        this.heap[this.size]=val;
        heapifyAbove(this.size);
        this.size++;
    }

    public void heapifyAbove(int index)
    {
        int parent = getparentIndex(index);
        while (index>0&&heap[parent]<heap[index])
        {
            int temp = heap[parent];
            heap[parent]=heap[index];
            heap[index]=temp;

            index = parent;
            parent = getparentIndex(index);
        }
    }

    public  void  displayheap()
    {
        for(int i=0;i<size;i++)
            System.out.print(heap[i]+" ");

    }
    
}

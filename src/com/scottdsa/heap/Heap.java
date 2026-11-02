package com.scottdsa.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;

    public Heap(){
        heap = new ArrayList<Integer>();
    }

    public List<Integer> getHeap(){
        return new ArrayList<>(heap);
    }

    private int leftChild(int index){
        return 2*index+1;
    }

    private int rightChild(int index){
        return 2*index+2;
    }

    private int parent(int index){
        return (index-1)/2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value) {
        // Add the new value to the end of the heap.
        heap.add(value);

        // Get the index of the new value (which is at the end of the heap).
        int current = heap.size() - 1;

        // While the new value is not at the root and is greater than its parent,
        // continue to swap it with its parent to maintain the "max heap" property.
        while (current > 0 && heap.get(current) > heap.get(parent(current))) {

            // Swap the new value with its parent.
            swap(current, parent(current));

            // Update the current index to be the index of the parent
            // (since we just swapped the new value with its parent).
            current = parent(current);
        }
    }
}

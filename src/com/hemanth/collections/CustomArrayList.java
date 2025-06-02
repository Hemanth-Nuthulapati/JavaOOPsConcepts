package com.hemanth.collections;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }
    private boolean isFull(){
        return size == data.length;
    }
    private void resize(){
        int[] temp = new int[data.length * 2];
        //copy every element into temp from data
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
    public int get(int index){
        return data[index];
    }
    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int size(){
        return size;
    }

    public void set(int index, int num){
        data[index] = num;
    }

    public static void main(String[] args) {
        CustomArrayList arrayList = new CustomArrayList();
        for(int i = 1; i < 33; i++){
            arrayList.add(i * 7);
        }
        System.out.println(arrayList.get(24));

        System.out.println(arrayList.remove());

        arrayList.add(7);
        arrayList.set(30, 69);
        System.out.println(arrayList.toString());
    }
}

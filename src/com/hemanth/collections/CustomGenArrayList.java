package com.hemanth.collections;

import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    private void add( T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }
    private void resize(){
        Object[] temp = new Object[data.length * 2];
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
         data[index] = value;
    }

    public T remove(){
        T removed = (T) data[--size];
        return removed;
    }


    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenArrayList<Integer> genArrayList = new CustomGenArrayList<>();

        for(int i = 0; i < 30; i++){
            genArrayList.add(i * 7);
        }

        System.out.println(genArrayList.remove());

        genArrayList.set(30, 69);



        System.out.println(genArrayList.toString());
        System.out.println(genArrayList.size());

    }

}

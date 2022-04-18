package com.mesrop;

import java.util.ArrayList;

public class Queue {
    private String[] array;
    private String HeadOfQueue;
    private int NumberHeadOfQueue = 0, SizeOfQueue, CurrentIndex = 1;
    public Queue(int Size){
        SizeOfQueue = Size;
        array = new String[SizeOfQueue];
    }
    public boolean isFull(){
        for(int i = 0; i < SizeOfQueue; i++){
            if(array[i] != null && (i + 1) == SizeOfQueue){
                return true;
            }
        }
        return false;
    }
    public boolean isEmpty(){
        int j = 0;
        for(int i = 0; i < SizeOfQueue; i++){
            if(array[i] == null){
                j++;
            }
        }
        if(j == SizeOfQueue){
            NumberHeadOfQueue = 0;
            HeadOfQueue = null;
            return true;
        }
        else{
            return false;
        }
    }
    public void add(String str){
        if(CurrentIndex < SizeOfQueue){
            array[CurrentIndex - 1] = str;
            CurrentIndex++;
        }
        else{
            CurrentIndex = 1;
            array[CurrentIndex - 1] = str;
        }
    }
    public void remove(){
        if(isEmpty()) {
            throw new ArrayStoreException("Массив є пустим");
        }
        else
        {
            if(isEmpty() == false){
                array[NumberHeadOfQueue] = null;
                if(isEmpty() == false && NumberHeadOfQueue == (SizeOfQueue - 1)){
                    NumberHeadOfQueue = 0;
                    HeadOfQueue = array[NumberHeadOfQueue];
                }
                else if(isEmpty() == false && NumberHeadOfQueue < (SizeOfQueue - 1)){
                    NumberHeadOfQueue++;
                    HeadOfQueue = array[NumberHeadOfQueue];
                }
                else{
                    NumberHeadOfQueue = 0;
                    HeadOfQueue = null;
                }
            }
        }
    }
    public String getElements()
    {
        if(isEmpty()) {
            throw new ArrayStoreException("Черга є пустою");
        }
        else{
            String strElem = "";
            for (int i = 0; i < SizeOfQueue; i++) {
                if(array[i] != null){
                    strElem = strElem + array[i] + "\n";
                }
            }
            return strElem;
        }
    }
}

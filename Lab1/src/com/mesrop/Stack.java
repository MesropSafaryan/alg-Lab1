package com.mesrop;

import java.util.ArrayList;
import java.util.LinkedList;

public class Stack {
    LinkedList list = new LinkedList();
    LinkedList EvenNum = new LinkedList();
    LinkedList OddNum = new LinkedList();
    public boolean isEmpty(){
       if(list.isEmpty() == true){
           return false;
       }
       else{
           return true;
       }
    }
    public void add(Name name){
        LinkedList Sortlist = new LinkedList();
        LinkedList SortEvenNum = new LinkedList();
        SortEvenNum = EvenNum;
        LinkedList SortOddNum = new LinkedList();
        SortOddNum = OddNum;
        sort(name);
        int e = 0, o = 0;
        for(int i = 0; i < (SortEvenNum.size() + SortOddNum.size()); i++){
            if((SortEvenNum.size() == 0) && (SortOddNum.size() != 0)){
                if(SortOddNum.size() > o) {
                    Sortlist.add(SortOddNum.get(o));
                    o++;
                }
            }
            else if((SortEvenNum.size() != 0) && (SortOddNum.size() == 0)){
                if(SortEvenNum.size() > e) {
                    Sortlist.add(SortEvenNum.get(e));
                    e++;
                }
            }
            else if((SortEvenNum.size() != 0) && (SortOddNum.size() != 0)){
                if(i % 2 == 0){
                    if(SortEvenNum.size() != 0){
                        if(SortEvenNum.size() > e) {
                            Sortlist.add(SortEvenNum.get(e));
                            e++;
                        }
                    }
                    else if ((SortEvenNum.size() == 0) && (SortOddNum.size() == 0)){
                        break;
                    }
                    else{
                        if(SortOddNum.size() > o) {
                            Sortlist.add(SortOddNum.get(o));
                            o++;
                        }
                    }
                }
                else if(i % 2 != 0){
                    if(SortOddNum.size() != 0){
                        if(SortOddNum.size() > o) {
                            Sortlist.add(SortOddNum.get(o));
                            o++;
                        }
                    }
                    else if ((SortEvenNum.size() == 0) && (SortOddNum.size() == 0)){
                        i++;
                    }
                    else{
                        if(SortEvenNum.size() > e) {
                            Sortlist.add(SortEvenNum.get(e));
                            e++;
                        }
                    }
                }
            }
        }
        if(list.size() > 0){
            while (list.size() != 0){
                list.removeFirst();
            }
        }
        for(int i = 0; i < Sortlist.size(); i++){
            list.add((Name)Sortlist.get(i));
        }
    }
    public void remove() {
        if (isEmpty() == false) {
            throw new ArrayStoreException("Стек є пустим");
        }
        else {
            list.removeFirst();
        }
    }
    private void sort(Name name){
        if(name.MaleOrFem.equals("жіноча")){
            EvenNum.add(name);
        }
        else if(name.MaleOrFem.equals("чоловіча")){
            OddNum.add(name);
        }
        else{
            throw new ArrayStoreException("помилка!");
        }

    }

    public String getElements(){
        if(isEmpty() == false) {
            throw new ArrayStoreException("Стек є пустим");
        }
        else{
            String result = "";
            for(int i = 0; i < list.size(); i++){
                Name val = (Name)list.get(i);
                result = result + "\n" + i + ". Ім'я: " + val.Name + ", рід імені: " + val.MaleOrFem;
            }
            return result;
        }
    }
}
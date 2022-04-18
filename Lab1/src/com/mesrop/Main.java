package com.mesrop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        for(int j = 0; j < 1;) {
            System.out.println("Виберіть рівень проекту: ");
            System.out.println("1. черга");
            System.out.println("2. стек");
            Scanner sc1 = new Scanner(System.in);
            int in1 = sc1.nextInt();
            if (in1 == 1) {
                Queue queue = new Queue(5);
                for (int i = 0; i < 1; ) {
                    System.out.println("Виберіть операцію: ");
                    System.out.println("1. додати елемент;");
                    System.out.println("2. видалити елемент;");
                    System.out.println("3. Вивести усі елементи;");
                    System.out.println("4. Вийти;");
                    Scanner sc2 = new Scanner(System.in);
                    int in2 = sc2.nextInt();
                    if (in2 == 1) {
                        System.out.println("Введіть елемент який ви хочете додати: ");
                        Scanner sc3 = new Scanner(System.in);
                        String str1 = sc3.nextLine();
                        queue.add(str1);
                        System.out.println("елемент додано; ");
                        Scanner sc4 = new Scanner(System.in);
                        String contin = sc4.nextLine();
                    }
                    else if (in2 == 2) {
                        if(queue.isEmpty() == false) {
                            queue.remove();
                            System.out.println("елемент видалено; ");
                            Scanner sc4 = new Scanner(System.in);
                            String contin = sc4.nextLine();
                        }
                        else{
                            System.out.println("Черга є пустою;");
                        }
                    }
                    else if (in2 == 3) {
                        if(queue.isEmpty() == false) {
                            System.out.println(queue.getElements());
                            System.out.println("елемент виведено; ");
                            Scanner sc4 = new Scanner(System.in);
                            String contin = sc4.nextLine();
                        }
                        else{
                            System.out.println("Черга є пустою;");
                        }
                    }
                    else if (in2 == 4) {
                        i++;
                    }
                    else {
                        System.out.println("Ви ввели неправильне значення. Спробуйте ще раз");
                    }
                }
            }
            else if (in1 == 2){
                Stack names = new Stack();

                loop:while(true) {
                    System.out.println("Виберіть операцію над стеком: ");
                    System.out.println("1. додати елемент");
                    System.out.println("2. вивести елементи стеку");
                    System.out.println("3. видалити елемент");
                    System.out.println("4. вийти");
                    Scanner sc2 = new Scanner(System.in);
                    int in2 = sc1.nextInt();
                    if (in2 == 1) {
                        for(int k = 0; k < 1;) {
                            Name name = new Name();
                            System.out.println("Введіть ім'я: ");
                            Scanner sc3 = new Scanner(System.in);
                            String val1 = sc3.nextLine();
                            name.Name = val1;
                            System.out.println("Введіть стать імені (\"чоловіча\" чи \"жіноча\": ");
                            for(int i = 0; i < 1;) {
                                Scanner sc4 = new Scanner(System.in);
                                String vall = sc4.nextLine();
                                if((vall.equals("чоловіча")) || vall.equals("жіноча")) {
                                    name.MaleOrFem = vall;
                                    i++;
                                }
                                else {
                                    System.out.println("Неправильно вказана стать. Спробуйте ще раз (введіть \"чоловіча\"" +
                                            " або \"жіноча\")");
                                }
                            }
                            names.add(name);
                            for(int i = 0; i < 1; ) {
                                System.out.println("Бажаєте продовжити ввід імен? (напишіть \"так\" або \"ні\")");
                                Scanner sc5 = new Scanner(System.in);
                                String val3 = sc3.nextLine();
                                if(val3.equals("так")){
                                    i++;
                                }
                                else if(val3.equals("ні")){
                                    System.out.println("Стек імен сформовано");
                                    k++;
                                    i++;
                                }
                            }
                        }

                    }
                    else if (in2 == 2) {
                        if(names.isEmpty() == true) {
                            System.out.println(names.getElements());
                        }
                        else{
                            System.out.println("Стек є пустим");
                        }
                    }
                    else if (in2 == 3) {
                        if(names.isEmpty() == true) {
                            names.remove();
                            System.out.println("Елемент видалено");
                        }
                        else{
                            System.out.println("Неможливо видалити елемент, оскільки стек є пустим");
                        }
                    }
                    else if (in2 == 4){
                        break loop;
                    }
                    else{
                        System.out.println("Ви ввели неправильне значення. Спробуйте ще раз");
                    }
                }

            }
            else {
                System.out.println("Ви ввели неправильне значення. Спробуйте ще раз");
            }
        }
    }
}




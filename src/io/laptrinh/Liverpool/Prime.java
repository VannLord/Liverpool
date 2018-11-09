package io.laptrinh.Liverpool;

import java.util.Date;

public class Prime {
    public static void main(String[] args) {
        int count = 0,prime=2;
        while( count < 20){
            int number =0;
            for (int i = 2; i <= prime/2 ; i++) {
                if(prime % i == 0) {
                    number++;
                }
            }
                if(number==0)
                {
                    System.out.println(prime);
                    count++;
            }
            prime++;

            }
            Date date = new Date();
        System.out.println(date.toString());
        int[] i = new int[10];
        System.out.println(i.length);
        i = new int[i.length+10];
        System.out.println(i.length);
        }

    }


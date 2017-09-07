package com.company;

import java.util.Scanner;

public class ques4 {

    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("hi ");
        int it1 =1;
        int it2 =2;
        int it3 =3;
        int itn;
        int nit;
        double count;
        double R;
        double T;
        double second;
        System.out.println(" Enter \" 1 \" For instruction Set 1");
        System.out.println(" Enter \" 2 \" For instruction Set 2");
        System.out.println(" Enter \" 3 \" to end ");

        do {
            System.out.println("Enter Instruction # ");
            itn = abc.nextInt();
            if(itn == 1){
                System.out.println("Enter Instructions no");
                nit = abc.nextInt();
                System.out.println("Enter cycle count ");
                count = abc.nextDouble();
                System.out.println("Enter Rate");
                R = 1/(abc.nextDouble()* 1000000);
                T =( nit * count * R);
                System.out.println(" time is: " + T + " Seconds");
            }
            else if(itn ==2){
                System.out.println("Enter Instructions no ");
                nit = abc.nextInt();
                System.out.println("Enter the seconds required per instruction");
                second = abc.nextDouble();
                T = (second * nit);
                System.out.println("time is: " + T + " Seconds");
            }
            else{}

        }
        while ( itn != 3);

    }
    }


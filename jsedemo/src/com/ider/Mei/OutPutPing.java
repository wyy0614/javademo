package com.ider.Mei;
import java.util.Scanner;
public class OutPutPing {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     pinXing(a,b);
    }




    public static void pinXing(int x,int y){
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print("*");
                if(j==y){
                    System.out.println(" ");
                }

                }
            System.out.println("\t\t");
            }

        }
    }


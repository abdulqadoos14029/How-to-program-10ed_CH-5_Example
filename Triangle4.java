package com.example.triangle;

public class Triangle4 {
    public static void main(String[] args){
        for(int i=0;i<=10;++i){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
            for (int k=10;k>=i;k--){
                System.out.print(" ");
            }
        }
    }
}

package com.company;


import java.util.Scanner;

public class Main {
    public static void f6(int n,int k) //задание 6
    {
        if(n%k!=0) {
            f6(n,++k);
        } else if(n%k==0&&k!=1&&n!=k){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
    public static void f7(int n,int k) //задание 7
    {
        if(k>n/2){
            System.out.println(n);
            return;
        }
        if(n%k==0){
            System.out.println(k);
            f7(n/2,k);
        }else {
            f7(n,++k);
        }
    }
    public static String f8(String s) //задание 8
    {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return f8(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }
    public static int f9(int a,int b) // задание 9
    {
        if (a> b+1) return 0;
        if (a==0 || b==0) return 1;
        return f9(a,b-1)+f9(a-1,b-1);
    }
    public static void f10(int n) //задание 10
    {
        System.out.print(n%10);
        if(n/10!=0)
            f10(n/10);
        else
            return;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        f6(17,2);
        f7(17,2);
        System.out.println(f8(scanner.next()));
        System.out.println(f9(10,10));
        f10(321);
    }
}

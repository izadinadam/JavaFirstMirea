package ru.mirea.task1.opt7;

public class Opt7 {
    static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(calculateFactorial(4));
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loc.kiemthu;

/**
 *
 * @author Lọt
 */
public class Utils {
    public static boolean ktNt(int n) throws InterruptedException{
        if (n<0)
            throw new ArithmeticException();
        
        Thread.sleep(2000);
        
        if (n>=2) {
            for (int i=2; i<=Math.sqrt(n);i++)
                if  (n % i == 0)
                    return false;
            return true;
        }
        return false;
    }
}

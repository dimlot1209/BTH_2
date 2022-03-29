/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loc.kiemthu;

/**
 *
 * @author Lọt
 */
public class demo {
    public static void main(String[] args){
        int[] a= {2,3,5,6,4,8,9};
                
        int sum =0;
        for (int x:a)
            if (Utils.ktNt(x) == true)
                sum += x;
        
        System.out.println(sum);
    }
}

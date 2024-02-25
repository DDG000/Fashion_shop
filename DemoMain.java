/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.demomain;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoMain {

    public static void main(String[] args) {

        Fashionshop.list.add(new Order("ODR#00001", "0111111111", "S", 12, 0, 10000));
        Fashionshop.list.add(new Order("ODR#00002", "0222222222", "XS", 12, 0, 20000));
        Fashionshop.list.add(new Order("ODR#00003", "0111111111", "M", 12, 0, 30000));
        Fashionshop.list.add(new Order("ODR#00004", "0222222222", "L", 12, 0, 40000));
        Fashionshop.list.add(new Order("ODR#00005", "0333333333", "M", 12, 0, 50000));
        Fashionshop.list.add(new Order("ODR#00006", "0444444444", "XL", 12, 0, 60000));
        Fashionshop.list.add(new Order("ODR#00007", "0555555555", "XXL", 12, 0, 800000));

        String[] arr = {"A", "B", "A", "C"};


        Fashionshop frame = new Fashionshop();
        frame.setVisible(true);
    }
}

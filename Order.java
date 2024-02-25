/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demomain;

import java.util.ArrayList;

/**
 *
 * @author dilsh
 */
public class Order {
    private String orderid;
    private String Telephone;
    private String sizes;
    private int Qts;
    private int status;
    private int Amount;

  public static int  processing =0;
  public static int  Delevering =1;
  public static int  Delevered =2;
  
   

    public Order(String orderid, String Telephone, String sizes, int Qts, int status, int Amount) {
        this.orderid = orderid;
        this.Telephone = Telephone;
        this.sizes = sizes;
        this.Qts = Qts;
        this.status = status;
        this.Amount = Amount;
    }

    /**
     * @return the orderid
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * @return the Telephone
     */
    public String getTelephone() {
        return Telephone;
    }

    /**
     * @return the sizes
     */
    public String getSizes() {
        return sizes;
    }

    /**
     * @return the Qts
     */
    public int getQts() {
        return Qts;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public int setStatus(int status) {
       
        this.status=status;
        return status;
    }

    /**
     * @return the Amount
     */
    public int getAmount() {
        return Amount;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmenu2;

/**
 *
 * @author Admin
 */
public class CustomerData {
    
    private String customer;
    private String Milktea;
    private String Fries;
    private String Burger;
    private double mprice, fprice, bprice;
    
    public CustomerData(String customer, String Milktea, String Fries, String Burger, double mprice, double fprice , double bprice){
        this.customer = customer;
        this.Milktea = Milktea;
        this.Fries = Fries;
        this.Burger = Burger;
        this.mprice = mprice;
        this.fprice = fprice;
        this.bprice = bprice;
    }

    /**
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * @return the Milktea
     */
    public String getMilktea() {
        return Milktea;
    }

    /**
     * @param Milktea the Milktea to set
     */
    public void setMilktea(String Milktea) {
        this.Milktea = Milktea;
    }

    /**
     * @return the Fries
     */
    public String getFries() {
        return Fries;
    }

    /**
     * @param Fries the Fries to set
     */
    public void setFries(String Fries) {
        this.Fries = Fries;
    }

    /**
     * @return the Burger
     */
    public String getBurger() {
        return Burger;
    }

    /**
     * @param Burger the Burger to set
     */
    public void setBurger(String Burger) {
        this.Burger = Burger;
    }

    /**
     * @return the mprice
     */
    public double getMprice() {
        return mprice;
    }

    /**
     * @param mprice the mprice to set
     */
    public void setMprice(double mprice) {
        this.mprice = mprice;
    }

    /**
     * @return the fprice
     */
    public double getFprice() {
        return fprice;
    }

    /**
     * @param fprice the fprice to set
     */
    public void setFprice(double fprice) {
        this.fprice = fprice;
    }

    /**
     * @return the bprice
     */
    public double getBprice() {
        return bprice;
    }

    /**
     * @param bprice the bprice to set
     */
    public void setBprice(double bprice) {
        this.bprice = bprice;
    }
    
    
}

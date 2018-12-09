/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

/**
 *
 * @author GOWTHAM V BHAT
 */
class Product {
    private String pid, name, com_name, material, color, capacity, dno, stock, price, gst;
    
    public Product(String pid ,String name, String com_name, String material, String color, String capacity, String dno, String stock, String price, String gst)
    {
        this.pid = pid;
        this.name = name;
        this.com_name = com_name;
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        this.dno = dno;
        this.stock = stock;
        this.price = price;
        this.gst = gst;
    }
    
    public String getpid() {
        return pid;
    }
    
    public String getname() {
        return name;
    }
    
    public String getcom_name() {
        return com_name;
    }
    
    public String getmaterial() {
        return material;
    }
    
    public String getcolor() {
        return color;
    }
    
    public String getcapacity() {
        return capacity;
    }
    
    public String getdno() {
        return dno;
    }
    
    public String getstock() {
        return stock;
    }
    
    public String getprice() {
        return price;
    }
    
    public String getgst() {
        return gst;
    }
}

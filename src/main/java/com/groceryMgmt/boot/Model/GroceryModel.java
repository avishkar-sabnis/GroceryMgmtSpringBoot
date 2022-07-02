package com.groceryMgmt.boot.Model;


import javax.persistence.*;

@Entity
@Table(name = "grocerymanagement")
public class GroceryModel {
    @Id
    int price;
    @Column(name = "customerName")
    String customerName;
    @Column(name = "customerAddress")
    String customerAddress;
    @Column(name = "itemTotal")
    int itemTotal;

    public GroceryModel(int price, String customerName, String customerAddress, int itemTotal) {
        this.price = price;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.itemTotal = itemTotal;
    }

    @Override
    public String toString() {
        return "GroceryModel{" +
                "price=" + price +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", itemTotal=" + itemTotal +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(int itemTotal) {
        this.itemTotal = itemTotal;
    }

    public GroceryModel() {
    }
}

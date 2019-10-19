package com.mhasancse.eshopping.ModelClass;

/**
 * Created by wolfsoft5 on 28/2/19.
 */

public class MyOrderModelClass {

    Integer image;
    String title,quantity,price,date,order_no;

    public MyOrderModelClass(Integer image, String title, String quantity, String price, String date, String order_no) {
        this.image = image;
        this.title = title;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
        this.order_no = order_no;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }
}

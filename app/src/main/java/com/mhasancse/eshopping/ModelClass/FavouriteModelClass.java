package com.mhasancse.eshopping.ModelClass;

/**
 * Created by wolfsoft5 on 14/2/19.
 */

public class FavouriteModelClass {

    Integer image;
    String title,price;
    boolean isSelected = true;


    public FavouriteModelClass(Integer image, String title, String price) {
        this.image = image;
        this.title = title;
        this.price = price;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}

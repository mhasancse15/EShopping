package com.mhasancse.eshopping.ModelClass;

/**
 * Created by wolfsoft5 on 7/5/18.
 */

public class ProductListModellClass {

    Integer image;
    String title;
    Integer like;

    public ProductListModellClass(Integer image, String title, Integer like) {
        this.image = image;
        this.title = title;
        this.like = like;
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

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }
}

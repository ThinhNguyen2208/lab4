package com.example.myapplication;

public class ItemListView {
    private String name;
    private String shopName;
    private int imageShopItem;

    public ItemListView(String name, String shopName, int imageShopItem) {
        this.name = name;
        this.shopName = shopName;
        this.imageShopItem = imageShopItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getImageShopItem() {
        return imageShopItem;
    }

    public void setImageShopItem(int imageShopItem) {
        this.imageShopItem = imageShopItem;
    }
}

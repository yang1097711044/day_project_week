package com.entity;

public class GoodsInfo {
    private int id;
    private String goodsInfo_name;
    private String goodsInfo_pic;
    private String goodsInfo_price;
    private String goodsInfo_description;
    private int goods_stock;
    private char flag;

    public GoodsInfo() {
    }

    public GoodsInfo(int id, String goodsInfo_name, String goodsInfo_pic, String goodsInfo_price, String goodsInfo_description, int goods_stock, char flag) {
        this.id = id;
        this.goodsInfo_name = goodsInfo_name;
        this.goodsInfo_pic = goodsInfo_pic;
        this.goodsInfo_price = goodsInfo_price;
        this.goodsInfo_description = goodsInfo_description;
        this.goods_stock = goods_stock;
        this.flag = flag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsInfo_name() {
        return goodsInfo_name;
    }

    public void setGoodsInfo_name(String goodsInfo_name) {
        this.goodsInfo_name = goodsInfo_name;
    }

    public String getGoodsInfo_pic() {
        return goodsInfo_pic;
    }

    public void setGoodsInfo_pic(String goodsInfo_pic) {
        this.goodsInfo_pic = goodsInfo_pic;
    }

    public String getGoodsInfo_price() {
        return goodsInfo_price;
    }

    public void setGoodsInfo_price(String goodsInfo_price) {
        this.goodsInfo_price = goodsInfo_price;
    }

    public String getGoodsInfo_description() {
        return goodsInfo_description;
    }

    public void setGoodsInfo_description(String goodsInfo_description) {
        this.goodsInfo_description = goodsInfo_description;
    }

    public int getGoods_stock() {
        return goods_stock;
    }

    public void setGoods_stock(int goods_stock) {
        this.goods_stock = goods_stock;
    }

    public char getFlag() {
        return flag;
    }

    public void setFlag(char flag) {
        this.flag = flag;
    }
}

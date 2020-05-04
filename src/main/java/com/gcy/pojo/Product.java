package com.gcy.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private Integer itemId;

    private String itemName;

    private BigDecimal itemPrice;

    private String itemDes;

    private String itemImage;

    private String itemImages;

    private String itemDetail;

    private Integer itemStock;

    private Integer itemStatus;

    private Date createTime;

    private Date updateTime;

    public Product(Integer itemId, String itemName, BigDecimal itemPrice, String itemDes, String itemImage, String itemImages, String itemDetail, Integer itemStock, Integer itemStatus, Date createTime, Date updateTime) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDes = itemDes;
        this.itemImage = itemImage;
        this.itemImages = itemImages;
        this.itemDetail = itemDetail;
        this.itemStock = itemStock;
        this.itemStatus = itemStatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Product() {
        super();
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDes() {
        return itemDes;
    }

    public void setItemDes(String itemDes) {
        this.itemDes = itemDes == null ? null : itemDes.trim();
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage == null ? null : itemImage.trim();
    }

    public String getItemImages() {
        return itemImages;
    }

    public void setItemImages(String itemImages) {
        this.itemImages = itemImages == null ? null : itemImages.trim();
    }

    public String getItemDetail() {
        return itemDetail;
    }

    public void setItemDetail(String itemDetail) {
        this.itemDetail = itemDetail == null ? null : itemDetail.trim();
    }

    public Integer getItemStock() {
        return itemStock;
    }

    public void setItemStock(Integer itemStock) {
        this.itemStock = itemStock;
    }

    public Integer getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
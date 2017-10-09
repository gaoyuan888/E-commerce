package com.qunar.flight.cms.model;

import java.math.BigDecimal;
import java.util.Date;

public class ProductSaleStat {
    private Integer id;

    private String channelId;

    private Date aimDate;

    private Integer productId;

    private Integer saleProductCount;

    private Integer withdrawalProductCount;

    private BigDecimal saleAmount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public Date getAimDate() {
        return aimDate;
    }

    public void setAimDate(Date aimDate) {
        this.aimDate = aimDate;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSaleProductCount() {
        return saleProductCount;
    }

    public void setSaleProductCount(Integer saleProductCount) {
        this.saleProductCount = saleProductCount;
    }

    public Integer getWithdrawalProductCount() {
        return withdrawalProductCount;
    }

    public void setWithdrawalProductCount(Integer withdrawalProductCount) {
        this.withdrawalProductCount = withdrawalProductCount;
    }

    public BigDecimal getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(BigDecimal saleAmount) {
        this.saleAmount = saleAmount;
    }
}
package com.wrt.carspa.domain;


import com.wrt.carspa.model.PmsProduct;
import com.wrt.carspa.model.PmsProductAttribute;
import com.wrt.carspa.model.PmsSkuStock;

import java.util.List;

/**
 * 购物车中带规格和SKU的商品信息
 * Created by macro on 2018/8/2.
 */
public class CartProduct extends PmsProduct {
    //商品属性列表
    private List<PmsProductAttribute> productAttributeList;
    //商品SKU库存列表
    private List<PmsSkuStock> skuStockList;

    public List<PmsProductAttribute> getProductAttributeList() {
        return productAttributeList;
    }

    public void setProductAttributeList(List<PmsProductAttribute> productAttributeList) {
        this.productAttributeList = productAttributeList;
    }

    public List<PmsSkuStock> getSkuStockList() {
        return skuStockList;
    }

    public void setSkuStockList(List<PmsSkuStock> skuStockList) {
        this.skuStockList = skuStockList;
    }
}

package com.wrt.carspa.domain;


import com.wrt.carspa.model.OmsOrder;
import com.wrt.carspa.model.OmsOrderItem;

import java.util.List;

/**
 * 包含商品信息的订单详情
 * Created by macro on 2018/9/4.
 */
public class OmsOrderDetail extends OmsOrder {
    //订单商品列表
    private List<OmsOrderItem> orderItemList;

    public List<OmsOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OmsOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
}

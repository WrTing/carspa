package com.wrt.carspa.search.dao;

import com.wrt.carspa.dto.OmsOrderDeliveryParam;
import com.wrt.carspa.dto.OmsOrderDetail;
import com.wrt.carspa.dto.OmsOrderQueryParam;
import com.wrt.carspa.model.OmsOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单查询自定义Dao
 * Created by macro on 2018/10/12.
 */
public interface OmsOrderDao {
    /**
     * 条件查询订单
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

    /**
     * 批量发货
     */
    int delivery(@Param("list") List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 获取订单详情
     */
    OmsOrderDetail getDetail(@Param("id") Long id);
}

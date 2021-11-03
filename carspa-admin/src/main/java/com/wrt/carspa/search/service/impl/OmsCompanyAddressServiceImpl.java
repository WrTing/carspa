package com.wrt.carspa.search.service.impl;

import com.wrt.carspa.mapper.OmsCompanyAddressMapper;
import com.wrt.carspa.model.OmsCompanyAddress;
import com.wrt.carspa.model.OmsCompanyAddressExample;
import com.wrt.carspa.search.service.OmsCompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址管理Service实现类
 * Created by macro on 2018/10/18.
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}

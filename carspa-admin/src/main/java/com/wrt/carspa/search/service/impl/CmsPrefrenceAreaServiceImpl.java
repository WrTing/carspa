package com.wrt.carspa.search.service.impl;

import com.wrt.carspa.mapper.CmsPrefrenceAreaMapper;
import com.wrt.carspa.model.CmsPrefrenceArea;
import com.wrt.carspa.model.CmsPrefrenceAreaExample;
import com.wrt.carspa.search.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选管理Service实现类
 * Created by macro on 2018/6/1.
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}

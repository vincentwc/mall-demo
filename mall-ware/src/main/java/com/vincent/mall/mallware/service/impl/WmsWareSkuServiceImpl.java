package com.vincent.mall.mallware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vincent.common.utils.PageUtils;
import com.vincent.common.utils.Query;

import com.vincent.mall.mallware.dao.WmsWareSkuDao;
import com.vincent.mall.mallware.entity.WmsWareSkuEntity;
import com.vincent.mall.mallware.service.WmsWareSkuService;


@Service("wmsWareSkuService")
public class WmsWareSkuServiceImpl extends ServiceImpl<WmsWareSkuDao, WmsWareSkuEntity> implements WmsWareSkuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WmsWareSkuEntity> page = this.page(
                new Query<WmsWareSkuEntity>().getPage(params),
                new QueryWrapper<WmsWareSkuEntity>()
        );

        return new PageUtils(page);
    }

}
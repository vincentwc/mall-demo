package com.vincent.mall.mallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.common.utils.PageUtils;
import com.vincent.mall.mallcoupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 16:57:21
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


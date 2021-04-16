package com.vincent.mall.mallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.common.utils.PageUtils;
import com.vincent.mall.mallcoupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 16:57:21
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


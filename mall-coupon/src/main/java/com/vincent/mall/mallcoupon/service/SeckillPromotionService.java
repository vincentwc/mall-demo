package com.vincent.mall.mallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.common.utils.PageUtils;
import com.vincent.mall.mallcoupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 16:57:21
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


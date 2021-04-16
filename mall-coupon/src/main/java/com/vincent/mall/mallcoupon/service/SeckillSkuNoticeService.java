package com.vincent.mall.mallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.common.utils.PageUtils;
import com.vincent.mall.mallcoupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 16:57:21
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


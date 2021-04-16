package com.vincent.mall.mallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.common.utils.PageUtils;
import com.vincent.mall.mallcoupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 16:57:21
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


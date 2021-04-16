package com.vincent.mall.mallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.common.utils.PageUtils;
import com.vincent.mall.mallcoupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 16:57:21
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


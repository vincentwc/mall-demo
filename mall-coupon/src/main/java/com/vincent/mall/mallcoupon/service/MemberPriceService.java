package com.vincent.mall.mallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.common.utils.PageUtils;
import com.vincent.mall.mallcoupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 16:57:21
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


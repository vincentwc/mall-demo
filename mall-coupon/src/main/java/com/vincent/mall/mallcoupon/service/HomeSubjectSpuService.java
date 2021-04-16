package com.vincent.mall.mallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.common.utils.PageUtils;
import com.vincent.mall.mallcoupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 16:57:21
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


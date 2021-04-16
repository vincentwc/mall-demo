package com.vincent.mall.mallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.common.utils.PageUtils;
import com.vincent.mall.mallorder.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 17:24:06
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


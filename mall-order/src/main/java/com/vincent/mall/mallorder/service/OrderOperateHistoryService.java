package com.vincent.mall.mallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.common.utils.PageUtils;
import com.vincent.mall.mallorder.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 17:24:06
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


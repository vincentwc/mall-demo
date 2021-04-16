package com.vincent.mall.mallorder.dao;

import com.vincent.mall.mallorder.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 17:24:06
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}

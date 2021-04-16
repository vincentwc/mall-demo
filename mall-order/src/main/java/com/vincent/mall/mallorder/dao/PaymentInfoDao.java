package com.vincent.mall.mallorder.dao;

import com.vincent.mall.mallorder.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 17:24:06
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}

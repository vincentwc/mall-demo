package com.vincent.mall.mallcoupon.dao;

import com.vincent.mall.mallcoupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 16:57:21
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

package com.vincent.mall.mallcoupon.dao;

import com.vincent.mall.mallcoupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 16:57:21
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}

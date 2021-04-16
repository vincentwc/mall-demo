package com.vincent.mall.mallcoupon.dao;

import com.vincent.mall.mallcoupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 16:57:21
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}

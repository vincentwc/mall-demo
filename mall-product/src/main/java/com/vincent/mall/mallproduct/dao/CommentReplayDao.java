package com.vincent.mall.mallproduct.dao;

import com.vincent.mall.mallproduct.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 11:56:19
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}

package com.vincent.mall.mallmember.dao;

import com.vincent.mall.mallmember.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 * 
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 17:09:49
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {
	
}

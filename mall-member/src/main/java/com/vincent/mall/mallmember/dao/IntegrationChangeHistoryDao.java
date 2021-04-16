package com.vincent.mall.mallmember.dao;

import com.vincent.mall.mallmember.entity.IntegrationChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分变化历史记录
 * 
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 17:09:49
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseMapper<IntegrationChangeHistoryEntity> {
	
}

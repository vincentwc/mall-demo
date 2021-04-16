package com.vincent.mall.mallmember.dao;

import com.vincent.mall.mallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 17:09:49
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

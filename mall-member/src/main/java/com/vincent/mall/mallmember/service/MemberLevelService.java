package com.vincent.mall.mallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.common.utils.PageUtils;
import com.vincent.mall.mallmember.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 17:09:49
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


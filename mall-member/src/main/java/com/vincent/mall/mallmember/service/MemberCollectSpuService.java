package com.vincent.mall.mallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.common.utils.PageUtils;
import com.vincent.mall.mallmember.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 17:09:49
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


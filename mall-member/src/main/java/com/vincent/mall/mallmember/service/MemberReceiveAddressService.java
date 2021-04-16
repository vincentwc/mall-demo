package com.vincent.mall.mallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.common.utils.PageUtils;
import com.vincent.mall.mallmember.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 17:09:49
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


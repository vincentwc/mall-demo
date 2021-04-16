package com.vincent.mall.mallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.common.utils.PageUtils;
import com.vincent.mall.mallorder.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 17:24:06
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


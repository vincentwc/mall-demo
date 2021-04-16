package com.vincent.mall.mallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.common.utils.PageUtils;
import com.vincent.mall.mallware.entity.WmsPurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 17:30:17
 */
public interface WmsPurchaseService extends IService<WmsPurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


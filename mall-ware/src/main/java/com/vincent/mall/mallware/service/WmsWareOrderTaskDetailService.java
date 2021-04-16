package com.vincent.mall.mallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.common.utils.PageUtils;
import com.vincent.mall.mallware.entity.WmsWareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 17:30:17
 */
public interface WmsWareOrderTaskDetailService extends IService<WmsWareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


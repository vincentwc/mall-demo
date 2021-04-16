package com.vincent.mall.mallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.common.utils.PageUtils;
import com.vincent.mall.mallware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 17:30:17
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


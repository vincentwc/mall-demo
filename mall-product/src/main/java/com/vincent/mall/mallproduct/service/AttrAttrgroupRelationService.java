package com.vincent.mall.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.common.utils.PageUtils;
import com.vincent.mall.mallproduct.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 11:56:19
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


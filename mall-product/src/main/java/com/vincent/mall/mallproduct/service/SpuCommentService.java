package com.vincent.mall.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.common.utils.PageUtils;
import com.vincent.mall.mallproduct.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 11:56:19
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


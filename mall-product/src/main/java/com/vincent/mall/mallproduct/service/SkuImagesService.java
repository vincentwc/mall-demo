package com.vincent.mall.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vincent.common.utils.PageUtils;
import com.vincent.mall.mallproduct.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 11:56:19
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


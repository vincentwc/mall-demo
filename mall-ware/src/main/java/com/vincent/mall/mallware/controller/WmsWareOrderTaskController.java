package com.vincent.mall.mallware.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vincent.mall.mallware.entity.WmsWareOrderTaskEntity;
import com.vincent.mall.mallware.service.WmsWareOrderTaskService;
import com.vincent.common.utils.PageUtils;
import com.vincent.common.utils.R;



/**
 * 库存工作单
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 17:30:17
 */
@RestController
@RequestMapping("mallware/wmswareordertask")
public class WmsWareOrderTaskController {
    @Autowired
    private WmsWareOrderTaskService wmsWareOrderTaskService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("mallware:wmswareordertask:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wmsWareOrderTaskService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("mallware:wmswareordertask:info")
    public R info(@PathVariable("id") Long id){
		WmsWareOrderTaskEntity wmsWareOrderTask = wmsWareOrderTaskService.getById(id);

        return R.ok().put("wmsWareOrderTask", wmsWareOrderTask);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("mallware:wmswareordertask:save")
    public R save(@RequestBody WmsWareOrderTaskEntity wmsWareOrderTask){
		wmsWareOrderTaskService.save(wmsWareOrderTask);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("mallware:wmswareordertask:update")
    public R update(@RequestBody WmsWareOrderTaskEntity wmsWareOrderTask){
		wmsWareOrderTaskService.updateById(wmsWareOrderTask);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("mallware:wmswareordertask:delete")
    public R delete(@RequestBody Long[] ids){
		wmsWareOrderTaskService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

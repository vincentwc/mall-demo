package com.vincent.mall.mallmember.controller;

import java.util.Arrays;
import java.util.Map;

import com.vincent.mall.mallmember.feign.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vincent.mall.mallmember.entity.MemberEntity;
import com.vincent.mall.mallmember.service.MemberService;
import com.vincent.common.utils.PageUtils;
import com.vincent.common.utils.R;



/**
 * 会员
 *
 * @author vincent
 * @email vincenttwwc@gmail.com
 * @date 2021-04-15 17:09:49
 */
@RestController
@RequestMapping("mallmember/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private CouponService couponService;

    @RequestMapping("/coupons")
    public R test(){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("张三");

        R memberCoupons = couponService.memberCoupons();
        return R.ok().put("member",memberEntity).put("coupons",memberCoupons.get("coupons"));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("mallmember:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("mallmember:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("mallmember:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("mallmember:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("mallmember:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

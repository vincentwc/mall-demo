package com.vincent.mall.mallproduct;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.vincent.mall.mallproduct.entity.BrandEntity;
import com.vincent.mall.mallproduct.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为");
//        brandEntity.setDescript("");
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        brandService.updateById(brandEntity);
//        System.out.println("保存成功");
        List<BrandEntity> brandEntityList = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
        brandEntityList.forEach(item -> System.out.println(item));
    }

}

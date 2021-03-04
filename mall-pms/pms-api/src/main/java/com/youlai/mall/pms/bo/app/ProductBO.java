package com.youlai.mall.pms.bo.app;

import com.youlai.mall.pms.pojo.domain.PmsInventory;
import com.youlai.mall.pms.pojo.domain.PmsProductAttrValue;
import com.youlai.mall.pms.pojo.domain.PmsCategorySpec;
import com.youlai.mall.pms.pojo.dto.SpuDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductBO {

    private SpuDTO spu;

    private List<PmsProductAttrValue> attrs;

    private List<PmsCategorySpec> specs;

    private List<PmsInventory> skuList;

}
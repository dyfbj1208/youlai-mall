package com.youlai.mall.ums.api;

import com.youlai.common.result.Result;
import com.youlai.mall.ums.pojo.entity.UmsAddress;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "mall-ums",contextId = "address")
public interface MemberAddressFeignClient {

    /**
     * 获取地址详情
     */
    @GetMapping("/app-api/v1/addresses/{id}")
    Result<UmsAddress> getById(@PathVariable("id") Long id);


    /**
     * 获取会员地址列表
     *
     * @param memberId
     * @return
     */
    @GetMapping("/app-api/v1/addresses")
    Result<List<UmsAddress>> list(@RequestParam Long memberId);

}



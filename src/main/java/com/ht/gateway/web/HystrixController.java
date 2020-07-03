package com.ht.gateway.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanggq
 * @Description:
 * @date 2020/3/9 14:39
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixController {

	@RequestMapping("fallback")
	public String fallback(){
		return "调用gateway全局降级处理";
	}

}

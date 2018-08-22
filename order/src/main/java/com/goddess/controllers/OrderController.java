package com.goddess.controllers;

import com.goddess.beans.TbOrder;
import com.goddess.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/order/")
public class OrderController {

	@Resource(name = "orderServiceImpl")
	OrderService orderService;

	@RequestMapping("findAll")
	@ResponseBody
	public String findAll(){
		List<TbOrder> all = orderService.findAll();
		System.out.println(all.get(3));
		return all.toString();
	}
}

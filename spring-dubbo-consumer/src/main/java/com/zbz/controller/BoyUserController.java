package com.zbz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zbz.service.BoyUserServiceImpl;

/**
 *  http://127.0.0.1:8080/spring-dubbo-consumer/service/girl 
 * @ClassName: BoyUserController
 * @author: ag
 * @date: 2019年10月25日 下午3:32:44
 */

@Controller
@RequestMapping("/service")
public class BoyUserController {
	
	@Autowired
	private BoyUserServiceImpl boyUser;
	@ResponseBody
	@RequestMapping(value = "girl" ,method = RequestMethod.GET )
	public String service( String str) throws Exception{
		String result ="{\"result\" : \"success\"}";
		boyUser.getInfo();
		return result;
	}

}

package com.zbz.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zbz.api.GirlService;

/**
 *  
 * @ClassName: BoyUserServiceImpl
 * @author: ag
 * @date: 2019年10月25日 下午3:32:07
 */
@Service
public class BoyUserServiceImpl {
	
	private static final Logger logger = LoggerFactory.getLogger(BoyUserServiceImpl.class);
	
	/**注入dubbo配置文件中,从远程zookeeper获取服务实现类*/
	@Autowired 
	public GirlService girlsService;
	
	public void getInfo(){
		logger.info("消费dubbo服务开始......");
		String info = girlsService.getGirlInfo();
		logger.info("消费信息: {}",info);
		logger.info("消费dubbo服务结束......");
	}

}

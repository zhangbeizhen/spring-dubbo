package com.zbz.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.zbz.api.GirlService;

/**
 *
 * 
 * @ClassName: GirlServiceImpl
 * @author: ag
 * @date: 2019年10月25日 下午2:46:05
 */

@Service("girlService")
public class GirlServiceImpl implements GirlService {

	private static final Logger logger = LoggerFactory.getLogger(GirlServiceImpl.class);
	@Override
	public String getGirlInfo() {
		
		String info = "The Girl is "+getCup()+" Cup.";
		logger.info("服务提供者服务信息: {}",info);
		return info;
	}

	private String getCup() {
		int in = 5;
		in = (int) (Math.random() * 6 + 1);
		if (in == 1) {
			return "A";
		} else if (in == 2) {
			return "B";
		} else if (in == 3) {
			return "C";
		} else if (in == 4) {
			return "D";
		} else if (in == 5) {
			return "E";
		} else if (in == 6) {
			return "F";
		} else if (in == 7) {
			return "G";
		}
		return "C";
	}

}

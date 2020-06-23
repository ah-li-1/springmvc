/**
 * @author ZhongLi
 * @date 2020-06-23
 */
package com.swmfizl.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

@Controller
public class TestController {

	/**
	 * ������ͼҳ��
	 * 
	 * @return
	 */
	@RequestMapping(value = "welcomePage")
	public String welcomePage() {
		return "welcome";
	}

	/**
	 * ���� Json ����
	 * 
	 * @return
	 */
	@RequestMapping(value = "welcomeData", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	@ResponseBody
	public String welcomeData() {
		Map<String, Object> response = new HashMap<String, Object>();
		Gson gson = new Gson();
		response.put("code", 0);
		response.put("msg", "��ӭ");
		return gson.toJson(response);
	}
}

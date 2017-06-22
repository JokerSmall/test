package com.sunyi.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: IndexController
 * @Description: 主页
 * @author joker
 * @date 2017年5月2日 上午10:21:25
 */
@Controller
public class IndexController {
	@RequestMapping("/index.action")
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView modelAndView = new ModelAndView();
		// // 访客信息
		// String ip = request.getHeader("x-forwarded-for");
		// if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
		// ip = request.getHeader("Proxy-Client-IP");
		// }
		// if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
		// ip = request.getHeader("WL-Proxy-Client-IP");
		// }
		// if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
		// ip = request.getHeader("HTTP_CLIENT_IP");
		// }
		// if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
		// ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		// }
		// if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
		// ip = request.getRemoteAddr();
		// }
		// UserDO user = new UserDO();
		//
		// System.out.println(ip);
		// AddressUtils addressUtils = new AddressUtils();
		// // 测试ip 219.136.134.157 中国=华南=广东省=广州市=越秀区=电信
		// String address = "";
		// try {
		// address = addressUtils.getAddresses("ip=" + ip, "utf-8");
		// } catch (UnsupportedEncodingException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// System.out.println(address);
		// user.setAddress(address);
		// user.setIp(ip);
		// // 指定视图
		modelAndView.setViewName("index");

		return modelAndView;

	}

}

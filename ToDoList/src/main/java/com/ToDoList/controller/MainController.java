package com.ToDoList.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ToDoList.service.UserService;
import com.ToDoList.vo.UserVo;

@RestController
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@Autowired
	private UserService userService;

	@RequestMapping("toDoLogin.htm")
	public ModelAndView homeView() {
		ModelAndView mav = null;
		try {
			mav = new ModelAndView("ToDoLogin");
			logger.info("Info : homveView() method of MainController is executed sucessfully.");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return mav;
	}

	@RequestMapping("viewRegister.htm")
	public ModelAndView registerView() {
		ModelAndView mav = null;
		try {
			mav = new ModelAndView("Register");
			logger.info("registerView() of MainController is executed sucessfully.");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return mav;
	}

	@RequestMapping("register.htm")
	public ModelAndView getRegistered(@ModelAttribute UserVo userVo) {
		ModelAndView mav=null;
		try {
			userService.saveUser(userVo);
			mav = new ModelAndView("ToDoLogin");
			logger.info("getRegistered() of MainController is executed sucessfully."); 
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return mav;
	}

	@RequestMapping("verifyLogin.htm")
	public ModelAndView getVerifiedLogin(@ModelAttribute UserVo userVo) {		
		ModelAndView mav = null;
		try {
			mav = new ModelAndView();
			if (userService.getUserVerified(userVo.getMail(), userVo.getPassword())) {
				mav.setViewName("Home");
			} else {
				mav.setViewName("ToDoLogin");
			}
			logger.info("getVerifiedLogin() of MainController is executed sucessfully.");
		}catch(Exception e) {
			logger.error(e.getMessage());
		}		
		return mav;
	}
}

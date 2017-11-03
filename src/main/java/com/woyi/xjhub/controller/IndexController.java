package com.woyi.xjhub.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woyi.xjhub.domain.DemoEntity;
import com.woyi.xjhub.service.DemoService;

@RequestMapping("/")
@Controller
public class IndexController {  
	
	private static final Logger log = LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
	private DemoService demoService;
	
    @RequestMapping("/hello")  
    public String index(HttpServletRequest request, Model model) {
    	List<DemoEntity> list = demoService.getAll();
    	model.addAttribute("list", list);
    	log.debug("debug");
    	log.error("error");
        return "index";  
    }  
}
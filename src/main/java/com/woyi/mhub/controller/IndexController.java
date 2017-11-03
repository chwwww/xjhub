package com.woyi.mhub.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woyi.mhub.domain.DemoEntity;
import com.woyi.mhub.service.impl.DemoService;

@RequestMapping("/")
@Controller
public class IndexController {  
	
	@Autowired
	private DemoService demoService;
	
    @RequestMapping("/hello")  
    public String index(HttpServletRequest request, Model model) {
    	List<DemoEntity> list = demoService.getAll();
    	if(null != list && !list.isEmpty()) {
    		for (DemoEntity demoEntity : list) {
				System.out.println(demoEntity);
			}
    	}
    	model.addAttribute("a", "hello world!A");
        return "index";  
    }  
}
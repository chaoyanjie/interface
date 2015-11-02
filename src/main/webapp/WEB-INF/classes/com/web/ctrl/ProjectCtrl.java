package com.web.ctrl;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.common.ctrl.BaseCtrl;
import com.web.dao.ProjectDao;
import com.web.entity.ProjectEntity;
import com.web.service.impl.ProjectServiceImpl;
@Controller
@RequestMapping("/pro")
public class ProjectCtrl extends BaseCtrl {
	@Resource
	ProjectServiceImpl projectService;
	   @RequestMapping(value = "/greet", method = RequestMethod.GET)
	   public String greetPath(ModelMap model) {
	    logger.debug("Method greetPath");
	    model.addAttribute("name", "index");
	    return "index";
	  }
	   
	   @RequestMapping(value = "/list", method = RequestMethod.GET)
	   public String list(ModelMap model) {
//		 pageSize=getParameter(pageSize);
//		 pageNum=getParameter(pageNum);
	     model.addAttribute("data", projectService.getAllByPage(10, 0, new ProjectEntity()));
//	     ,ProjectEntity pageEntity,Integer pageSize,Integer pageNum
//	     pageSize=getParameter(pageSize);
//	     pageNum=getParameter(pageNum);
//	     model.addAttribute("data", projectService.getAllByPage(pageSize, pageNum, pageEntity));
	     return "pro/list";
	  }
	   
	   public int getParameter(Integer obj){
		   if(obj==null){
			   return 0;
		   }else{
			   return obj;
		   }
	   }
	   
	  
	   
}

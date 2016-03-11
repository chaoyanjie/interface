package com.web.ctrl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.common.ctrl.BaseCtrl;
import com.web.entity.InterfaceEntity;
import com.web.entity.ModelEntity;
import com.web.entity.ParameterEntity;
import com.web.entity.ProjectEntity;
import com.web.service.impl.InterfaceServiceImpl;
import com.web.service.impl.ModelServiceImpl;
import com.web.service.impl.ParameterServiceImpl;
import com.web.service.impl.ProjectServiceImpl;
@Controller
@RequestMapping("/pro")
public class ProjectCtrl extends BaseCtrl {
	@Resource
	ProjectServiceImpl projectService;
	@Resource
	InterfaceServiceImpl interfaceService;
	@Resource
	ParameterServiceImpl parameterService;
	@Resource
	ModelServiceImpl modelService;
	   @RequestMapping(value = "/greet", method = RequestMethod.GET)
	   public String greetPath(ModelMap model) {
	    logger.debug("Method greetPath");
	    model.addAttribute("name", "index");
	    return "index";
	  }
	   
	   @RequestMapping(value = "/list", method = RequestMethod.GET)
	   public String list(ModelMap model,ProjectEntity pageEntity,Integer pageSize,Integer pageNum) {
//		 pageSize=getParameter(pageSize);
//		 pageNum=getParameter(pageNum);
	     model.addAttribute("data", projectService.getAllByPage(10, 0, new ProjectEntity()));
//	     ,ProjectEntity pageEntity,Integer pageSize,Integer pageNum
//	     pageSize=getParameter(pageSize);
//	     pageNum=getParameter(pageNum);
//	     model.addAttribute("data", projectService.getAllByPage(pageSize, pageNum, pageEntity));
	     return "pro/list";
	  }
	   @RequestMapping(value = "/jiekou/{pid}", method = RequestMethod.GET)
	   public String jiekou(ModelMap model,@PathVariable("pid") Integer pid){
		  ProjectEntity entity= (ProjectEntity) projectService.getBaseEntityById(pid);
		  String title=entity.getPname()+":"+entity.getPversion()+" 接口列表";
		   model.addAttribute("title", title);
		   model.addAttribute("data", interfaceService.getAllByProId(pid));
		   return "pro/interface";
	   }
	   
	   @RequestMapping(value = "/jiekoum/{pid}", method = RequestMethod.GET)
	   public String jiekoum(ModelMap model,@PathVariable("pid") Integer pid){
		   ModelEntity entity=(ModelEntity) modelService.getBaseEntityById(pid);
		   String title=entity.getModelName()+": 接口列表";
		   
		   model.addAttribute("title", title);
		   model.addAttribute("data", interfaceService.getAllByModelId(entity.getInterIds()));
		   return "pro/interface";
	   }
	   
	   @RequestMapping(value = "/model/{pid}", method = RequestMethod.GET)
	   public String model(ModelMap model,@PathVariable("pid") Integer pid){
		   ProjectEntity entity= (ProjectEntity) projectService.getBaseEntityById(pid);
		  String title=entity.getPname()+":"+entity.getPversion()+" 模块列表";
		   model.addAttribute("title", title);
		   model.addAttribute("data", modelService.getAllByProId(pid));
		   return "pro/model";
	   }
	   
	   @RequestMapping(value = "/detail/{pid}", method = RequestMethod.GET)
	   public String detail(ModelMap model,@PathVariable("pid") Integer pid){
		   
		   model.addAttribute("data", projectService.getProjectDetail(pid));
		   return "pro/detail";
	   }
	   
	   @RequestMapping(value = "/execi/{pid}", method = RequestMethod.GET)
	   @ResponseBody
	   public Map execi(@PathVariable("pid") Integer pid){
		   InterfaceEntity entity=(InterfaceEntity) interfaceService.getBaseEntityById(pid);
		   Map m=new HashMap();
		   m.put("status", 0);
		   m.put("msg", entity.getIname()+"执行成功！");
		   return m;
	   }
	   @RequestMapping(value = "/pa/{pid}", method = RequestMethod.GET)
	   @ResponseBody
	   public Map pa(@PathVariable("pid") Integer pid){
		   List<ParameterEntity> list=parameterService.getAllByInterId(pid);
		    
		   Map m=new HashMap();
		   
		   m.put("msg", list);
		   return m;
	   }
	   
	   
	   public int getParameter(Integer obj){
		   if(obj==null){
			   return 0;
		   }else{
			   return obj;
		   }
	   }
	   
	  
	   
}

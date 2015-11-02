package com.web.ut;

import com.web.entity.InterfaceEntity;
import com.web.entity.ParameterEntity;
import com.web.entity.ProjectEntity;
import com.web.entity.dto.InterDto;
import com.web.entity.dto.ProjectDto;

public class GeneraInsert {
	public static void getSql(){
        ProjectDto pdto=new ProjectDto();
		ProjectEntity entity=new ProjectEntity("工程2","V1.2","工程2detail");
		entity.setId(2);
		pdto.setProEntity(entity);
		
		InterDto idto=new InterDto();
		InterfaceEntity i=new InterfaceEntity("接口1", "接口1代码", "接口1描述", "1");
		i.setId(3);
		idto.setiEntity(i);
		
		ParameterEntity p=new ParameterEntity("参数1", "参数名称", "参数默认值");
		idto.addParam(p);
//		p.setPaName("ddddd");
//		idto.addParam(p);
		  p=new ParameterEntity("参数2", "参数2名称", "参数2默认值");
		idto.addParam(p);
		p.setPaName("sdsfdsfds");
		pdto.addInter(idto);
		
		
		System.out.println("insert  into `t_project`(`pname`,`pversion`,`pdetail`,`id`) values ('"+pdto.getProEntity().getPname()+"','"+pdto.getProEntity().getPversion()+"','"+pdto.getProEntity().getPdetail()+"',"+pdto.getProEntity().getId()+");");
		for(int a=0;a<pdto.getiList().size();a++){
			InterfaceEntity temp=pdto.getiList().get(a).getiEntity();
			System.out.println("insert  into `t_interface`(`pro_id`,`iname`,`icode`,`idetail`,`h_inter_id`,`id`) values ('"+pdto.getProEntity().getId()+"','"+temp.getIname()+"','"+temp.getIcode()+"','"+temp.getIdetail()+"','"+temp.gethInterId()+"',1);");
			for(int m=0;m<pdto.getiList().get(a).getiList().size();m++){
				ParameterEntity ptemp=pdto.getiList().get(a).getiList().get(m);
				System.out.println("insert  into `t_parameter`(`inter_id`,`pa_name`,`pa_code`,`pa_value`,`id`) values ('"+ptemp.getInterId()+"','"+ptemp.getPaName()+"','"+ptemp.getPaCode()+"','"+ptemp.getPaValue()+"',1);");
			}
		}
		
	}
public static void main(String[] args) {
	
	getSql();
	
}
}

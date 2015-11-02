package com.web.ut;

import java.io.IOException;

import com.model.common.entity.MessageEntity;
import com.model.common.util.generate.Fields;
import com.model.common.util.generate.Service;
import com.web.entity.InterfaceEntity;
import com.web.entity.ParameterEntity;
import com.web.entity.ProjectEntity;

public class Generator {
	/**
	 * 生成对应的文件 刷新项目
	 * @param obj
	 * @param servicePath
	 * @param tableName
	 * @throws IOException
	 */
	public void gen(Object obj,String servicePath,String tableName) throws IOException{
//		Service se=new Service();
//		se.setPath(servicePath);
//		se.service(obj);
		Fields f = new Fields();
		f.setTableName(tableName);
//		f.getSql(obj);
		f.fields(obj);
//		f.insert(obj);
//		f.upadate(obj);
//		f.delete(obj);
//		f.table(obj);
		f.select(obj);
	}
	public static void main(String[] args) throws IOException {
		Generator ge=new Generator();
		ProjectEntity obj=new ProjectEntity();
		ge.gen(obj, "D:\\workspace\\web\\src\\main\\java\\", "t_project");
		
		InterfaceEntity obj1=new InterfaceEntity();
		ge.gen(obj1, "D:\\workspace\\web\\src\\main\\java\\", "t_interface");
		
		ParameterEntity obj2=new ParameterEntity();
		ge.gen(obj2, "D:\\workspace\\web\\src\\main\\java\\", "t_parameter");
		 
		
	}

}

package com.web.dao;

import java.util.List;

import com.model.common.dao.BaseDao;
import com.web.entity.InterfaceEntity;

public interface InterfaceDao extends BaseDao<InterfaceEntity>{ 
	/**
	 *获取所有的接口 by 工程id
	 * @param pid 
	 * @return
	 */
	public List<InterfaceEntity> getAllByProjectId(Integer pid);
	/**
	 *获取所有的接口 by 模块 ids
	 * @param pid 
	 * @return
	 */
	public List<InterfaceEntity> getAllByModelId(String ids);

}
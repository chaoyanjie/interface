package com.web.service;

import java.util.List;

import com.web.entity.InterfaceEntity;

public interface InterfaceService {
	public List<InterfaceEntity> getAllByProId(Integer pid);
}
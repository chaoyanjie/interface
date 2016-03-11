package com.web.service;

import java.util.List;

import com.web.entity.ParameterEntity;

public interface ParameterService {
public List<ParameterEntity> getAllByInterId(Integer id);
}
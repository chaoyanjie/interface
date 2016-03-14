package com.web.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.web.entity.ParameterEntity;

public class JsonUtil {
	
	public static String getJsonString(Map map){
		ObjectMapper mapper = new ObjectMapper();
		try {
		  return	mapper.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public static List<ParameterEntity> readJson2Map(String json) {
		List<ParameterEntity> list=new ArrayList<ParameterEntity>();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Map<String, Object> maps = objectMapper.readValue(
                    json, Map.class);
            Set<String> key = maps.keySet();
            Iterator<String> iter = key.iterator();
            while (iter.hasNext()) {
                String field = iter.next();
                list.add(new ParameterEntity(field,field,maps.get(field)+"",getType(maps.get(field))));
            }
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
	
	public static String getType(Object obj){
		 if(obj==null){
			 return "String";//default
		 }
		 return obj.getClass().getSimpleName();
	}
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("method","json");
		map.put("param",null);
		map.put("param1",1);
		map.put("time","2015-01-23 10:54:55");
		System.out.println(getJsonString(map));
		String temp="{\"time\":\"2015-01-23 10:54:55\",\"param\":null,\"method\":\"json\",\"param1\":1}";
		System.out.println(JSON.toJSONString(readJson2Map(temp)));
	}
	
	
 
}

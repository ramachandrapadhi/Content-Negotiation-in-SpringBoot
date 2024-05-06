package com.learningtech.util;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;

import lombok.Data;

public interface  GenerateResponseData {
	
	public static <T, S> GenericResponse setData(GenericResponse genericResponse ,Page<S> page, Class<T> target){
		PageDataObj obj = new PageDataObj();
		
		System.out.println(page.getContent().getClass());
		List<S> content = page.getContent();
		T t = BeanUtils.instantiateClass(target);
		
		BeanMapperUtils.copyList(content, t.getClass());
		obj.setData(BeanMapperUtils.copyList(content, t.getClass()));
		
		obj.setPageNo(page.getNumber()+1);
		obj.setPageSize(page.getSize());
		obj.setTotalRecord((int)page.getTotalElements());
		obj.setTotalpages(page.getTotalPages());
		genericResponse.setData(obj);
		return genericResponse;
	}

	public static <T> GenericResponse setData(GenericResponse genericResponse, List<T> page) {
		DataObj obj = new DataObj();
		obj.setData(page);
		obj.setTotalRecord(page != null ? page.size() : 0);
		genericResponse.setData(obj);
		return genericResponse;
	}
	
	@Data
	public class PageDataObj{
		private Integer pageSize;
		private Integer pageNo;
		private Integer totalRecord;
		private Integer totalpages;
		private Object data;
	}
	@Data
	public class DataObj{
		private Object data;
		private Integer totalRecord;
	}

}

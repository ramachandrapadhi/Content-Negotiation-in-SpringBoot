package com.learningtech.util;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;

public class BeanMapperUtils {
	
	public static <S, T> void copy(S source, T target) {
		BeanUtils.copyProperties(source, target);
	}
	
	public static <S, T> List<T> copyList(List<S> sourceList, Class<T> type ) {
	    List<T> targetList = new ArrayList<>(); 
	     for (S source: sourceList ) {
	        T target = BeanUtils.instantiateClass(type);
	        BeanUtils.copyProperties(source , target);
	        targetList.add(target);
	     }
		return targetList;
	}
}

package com.entity.view;

import com.entity.DiscussxuanchuanxinwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宣传新闻评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-12 09:24:41
 */
@TableName("discussxuanchuanxinwen")
public class DiscussxuanchuanxinwenView  extends DiscussxuanchuanxinwenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxuanchuanxinwenView(){
	}
 
 	public DiscussxuanchuanxinwenView(DiscussxuanchuanxinwenEntity discussxuanchuanxinwenEntity){
 	try {
			BeanUtils.copyProperties(this, discussxuanchuanxinwenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

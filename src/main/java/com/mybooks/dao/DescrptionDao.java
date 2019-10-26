package com.mybooks.dao;

import com.mybooks.entity.Description;

public interface DescrptionDao {
	
	/**
	 * 获取最新一条描述
	 * @return
	 */
	Description getLastDescript();
}

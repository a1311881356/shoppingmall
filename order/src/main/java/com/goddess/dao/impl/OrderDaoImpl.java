package com.goddess.dao.impl;

import com.goddess.beans.PageResult;
import com.goddess.beans.TbOrder;
import com.goddess.beans.TbPayLog;
import com.goddess.dao.OrderDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDaoImpl implements OrderDao {

	@Autowired
	SqlSessionTemplate sst;

	private String prefixSql="com.goddess.mapper.OrderMapper.";

	@Override
	public List<TbOrder> findAll() {
		return sst.selectList(prefixSql+"findAll",TbOrder.class);
	}

	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		return null;
	}

	@Override
	public void add(TbOrder order) {

	}

	@Override
	public void update(TbOrder order) {

	}

	@Override
	public TbOrder findOne(Long id) {
		return null;
	}

	@Override
	public void delete(Long[] ids) {

	}

	@Override
	public PageResult findPage(TbOrder order, int pageNum, int pageSize) {
		return null;
	}

	@Override
	public TbPayLog searchPayLogFromRedis(String userId) {
		return null;
	}

	@Override
	public void updateOrderStatus(String out_trade_no, String transaction_id) {

	}
}

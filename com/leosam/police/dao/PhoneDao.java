package com.leosam.police.dao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.leosam.police.entity.Phone;
import com.leosam.police.entity.PhoneExample;
import com.leosam.police.mapper.PhoneMapper;
import com.leosam.police.utis.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component("phoneDao")
public class PhoneDao {

	@Autowired
	private PhoneMapper phoneMapper;
	public ResultVO<Phone> listPhone(int page, int limit, Phone phone) {
		// 1. 初始化参数变量
		if (page <= 0) {
			page = 1;
		}
		if (limit <= 0) {
			limit = 20;
		}
		// 2. 开启分页插件
		Page pageInfo = PageHelper.startPage(page, limit);
		PhoneExample phoneExample = new PhoneExample();
		// 5. 查询list列表
		phoneMapper.selectByExample(phoneExample);
		// 6. 返回结果
		return new ResultVO().setCode(200).setCount(pageInfo.getTotal()).setData(pageInfo.getResult());

	}
	public Phone getPhone(Integer phoneId) {
		if (phoneId == null || phoneId == 0) {
			return null;
		}
		return phoneMapper.selectByPrimaryKey(phoneId);
	}

	public ResultVO savePhone(Integer phoneId, Phone phone) throws Exception {
		if (phone == null) {
			return ResultVO.build(-1, "内容为空");
		}
		phone.setUpdateTime(new Date());
		boolean isNew = phoneId == null || phoneId == 0;

		int count;
		if (!isNew) {
			count = phoneMapper.updateByPrimaryKeySelective(phone);
		} else {
			phone.setCreateTime(new Date());
			count = phoneMapper.insertSelective(phone);
		}
		if (count <= 0) {
			throw new Exception("PhoneDao phoneMapper savePhone has error count <= 0");
		}
		if (isNew) {
			return ResultVO.ADD_OK;
		} else {
			return ResultVO.UPDATE_OK;
		}
	}

}

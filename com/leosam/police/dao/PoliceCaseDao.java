package com.leosam.police.dao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.leosam.police.entity.PoliceCase;
import com.leosam.police.entity.PoliceCaseExample;
import com.leosam.police.mapper.PoliceCaseMapper;
import com.leosam.police.utis.ResultVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component("policeCaseDao")
public class PoliceCaseDao {
	@Autowired
	private PoliceCaseMapper policeCaseMapper;

	public ResultVO<PoliceCase> listPoliceCase(int page, int limit, PoliceCase policeCase) {
		// 1. 初始化参数变量
		if (page <= 0) {
			page = 1;
		}
		if (limit <= 0) {
			limit = 20;
		}
		// 2. 开启分页插件
		Page pageInfo = PageHelper.startPage(page, limit);
		PoliceCaseExample policeCaseExample = new PoliceCaseExample();
		// 5. 查询list列表
		policeCaseMapper.selectByExample(policeCaseExample);
		// 6. 返回结果
		return new ResultVO().setCode(200).setCount(pageInfo.getTotal()).setData(pageInfo.getResult());
	}

	public PoliceCase getPoliceCase(String id) {
		if (StringUtils.isEmpty(id)) {
			return null;
		}
		return policeCaseMapper.selectByPrimaryKey(id);
	}

	public ResultVO<PoliceCase> savePoliceCase(String caseId, PoliceCase policeCase) throws Exception {
		if (policeCase == null) {
			return ResultVO.build(-1, "内容为空");
		}
		policeCase.setUpdateTime(new Date());
		boolean isNew = StringUtils.isBlank(caseId);

		int count;
		if (!isNew) {
			count = policeCaseMapper.updateByPrimaryKeySelective(policeCase);
		} else {
			policeCase.setCreateTime(new Date());
			count = policeCaseMapper.insertSelective(policeCase);
		}
		if (count <= 0) {
			throw new Exception("PoliceCaseDao policeCaseMapper savePoliceCase has error count <= 0");
		}
		if (isNew) {
			return ResultVO.ADD_OK;
		} else {
			return ResultVO.UPDATE_OK;
		}
	}
}
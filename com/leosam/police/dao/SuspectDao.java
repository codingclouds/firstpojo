package com.leosam.police.dao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.leosam.police.entity.Suspect;
import com.leosam.police.entity.SuspectExample;
import com.leosam.police.mapper.SuspectMapper;
import com.leosam.police.utis.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component("suspectDao")
public class SuspectDao {
	@Autowired
	private SuspectMapper suspectMapper;

	public ResultVO<Suspect> listSuspect(int page, int limit, Suspect suspect) {
		// 1. 初始化参数变量
		if (page <= 0) {
			page = 1;
		}
		if (limit <= 0) {
			limit = 20;
		}
		// 2. 开启分页插件
		Page pageInfo = PageHelper.startPage(page, limit);
		SuspectExample suspectExample = new SuspectExample();
		// 5. 查询list列表
		suspectMapper.selectByExample(suspectExample);
		// 6. 返回结果
		return new ResultVO().setCode(200).setCount(pageInfo.getTotal()).setData(pageInfo.getResult());

	}

	public Suspect getSuspect(Integer suspectId) {
		if (suspectId == null || suspectId == 0) {
			return null;
		}
		return suspectMapper.selectByPrimaryKey(suspectId);
	}

	public ResultVO saveSuspect(Integer suspectId, Suspect suspect) throws Exception {
		if (suspect == null) {
			return ResultVO.build(-1, "内容为空");
		}
		suspect.setUpdateTime(new Date());
		boolean isNew = suspectId == null || suspectId == 0;

		int count;
		if (!isNew) {
			count = suspectMapper.updateByPrimaryKeySelective(suspect);
		} else {
			suspect.setCreateTime(new Date());
			count = suspectMapper.insertSelective(suspect);
		}
		if (count <= 0) {
			throw new Exception("SuspectDao suspectMapper saveSuspect has error count <= 0");
		}
		if (isNew) {
			return ResultVO.ADD_OK;
		} else {
			return ResultVO.UPDATE_OK;
		}

	}
}

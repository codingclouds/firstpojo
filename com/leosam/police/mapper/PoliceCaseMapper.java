package com.leosam.police.mapper;

import com.leosam.police.entity.PoliceCase;
import com.leosam.police.entity.PoliceCaseExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PoliceCaseMapper {
	long countByExample(PoliceCaseExample example);

	int deleteByExample(PoliceCaseExample example);

	int deleteByPrimaryKey(String id);

	int insert(PoliceCase record);

	int insertSelective(PoliceCase record);

	List<PoliceCase> selectByExample(PoliceCaseExample example);

	PoliceCase selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") PoliceCase record, @Param("example") PoliceCaseExample example);

	int updateByExample(@Param("record") PoliceCase record, @Param("example") PoliceCaseExample example);

	int updateByPrimaryKeySelective(PoliceCase record);

	int updateByPrimaryKey(PoliceCase record);
}
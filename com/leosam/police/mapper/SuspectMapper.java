package com.leosam.police.mapper;

import com.leosam.police.entity.Suspect;
import com.leosam.police.entity.SuspectExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface SuspectMapper {
	long countByExample(SuspectExample example);

	int deleteByExample(SuspectExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Suspect record);

	int insertSelective(Suspect record);

	List<Suspect> selectByExample(SuspectExample example);

	Suspect selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Suspect record, @Param("example") SuspectExample example);

	int updateByExample(@Param("record") Suspect record, @Param("example") SuspectExample example);

	int updateByPrimaryKeySelective(Suspect record);

	int updateByPrimaryKey(Suspect record);
}
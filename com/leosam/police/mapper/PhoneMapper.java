package com.leosam.police.mapper;

import com.leosam.police.entity.Phone;
import com.leosam.police.entity.PhoneExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PhoneMapper {
	long countByExample(PhoneExample example);

	int deleteByExample(PhoneExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Phone record);

	int insertSelective(Phone record);

	List<Phone> selectByExample(PhoneExample example);

	Phone selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Phone record, @Param("example") PhoneExample example);

	int updateByExample(@Param("record") Phone record, @Param("example") PhoneExample example);

	int updateByPrimaryKeySelective(Phone record);

	int updateByPrimaryKey(Phone record);
}
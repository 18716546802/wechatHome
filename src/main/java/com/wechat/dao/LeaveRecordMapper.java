package com.wechat.dao;

import com.wechat.entity.LeaveRecord;
import com.wechat.entity.LeaveRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeaveRecordMapper {
    int countByExample(LeaveRecordExample example);

    int deleteByExample(LeaveRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LeaveRecord record);

    int insertSelective(LeaveRecord record);

    List<LeaveRecord> selectByExample(LeaveRecordExample example);

    LeaveRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LeaveRecord record, @Param("example") LeaveRecordExample example);

    int updateByExample(@Param("record") LeaveRecord record, @Param("example") LeaveRecordExample example);

    int updateByPrimaryKeySelective(LeaveRecord record);

    int updateByPrimaryKey(LeaveRecord record);
}
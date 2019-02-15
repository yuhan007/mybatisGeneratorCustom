package com.vzoom.charge.sync.dao;

import com.vzoom.charge.model.sync.SyncRecord;
import com.vzoom.charge.model.sync.SyncRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyncRecordMapper {
    long countByExample(SyncRecordExample example);

    int deleteByExample(SyncRecordExample example);

    int deleteByPrimaryKey(String sycnId);

    int insert(SyncRecord record);

    int insertSelective(SyncRecord record);

    List<SyncRecord> selectByExample(SyncRecordExample example);

    SyncRecord selectByPrimaryKey(String sycnId);

    int updateByExampleSelective(@Param("record") SyncRecord record, @Param("example") SyncRecordExample example);

    int updateByExample(@Param("record") SyncRecord record, @Param("example") SyncRecordExample example);

    int updateByPrimaryKeySelective(SyncRecord record);

    int updateByPrimaryKey(SyncRecord record);
}
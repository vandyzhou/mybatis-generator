package com.zhoumj.dao;

import com.zhoumj.model.AuditInfo;

public interface AuditInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table O2O.TBL_O2O_AUDITINFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table O2O.TBL_O2O_AUDITINFO
     *
     * @mbggenerated
     */
    int insert(AuditInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table O2O.TBL_O2O_AUDITINFO
     *
     * @mbggenerated
     */
    int insertSelective(AuditInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table O2O.TBL_O2O_AUDITINFO
     *
     * @mbggenerated
     */
    AuditInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table O2O.TBL_O2O_AUDITINFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AuditInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table O2O.TBL_O2O_AUDITINFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AuditInfo record);
}
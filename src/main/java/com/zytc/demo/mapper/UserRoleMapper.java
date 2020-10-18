package com.zytc.demo.mapper;

import com.zytc.demo.entity.UserRole;
import com.zytc.demo.entity.UserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zytc_user_role
     *
     * @mbg.generated Sat Oct 17 09:22:41 CST 2020
     */
    long countByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zytc_user_role
     *
     * @mbg.generated Sat Oct 17 09:22:41 CST 2020
     */
    int deleteByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zytc_user_role
     *
     * @mbg.generated Sat Oct 17 09:22:41 CST 2020
     */
    int deleteByPrimaryKey(Integer urId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zytc_user_role
     *
     * @mbg.generated Sat Oct 17 09:22:41 CST 2020
     */
    int insert(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zytc_user_role
     *
     * @mbg.generated Sat Oct 17 09:22:41 CST 2020
     */
    int insertSelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zytc_user_role
     *
     * @mbg.generated Sat Oct 17 09:22:41 CST 2020
     */
    List<UserRole> selectByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zytc_user_role
     *
     * @mbg.generated Sat Oct 17 09:22:41 CST 2020
     */
    UserRole selectByPrimaryKey(Integer urId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zytc_user_role
     *
     * @mbg.generated Sat Oct 17 09:22:41 CST 2020
     */
    int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zytc_user_role
     *
     * @mbg.generated Sat Oct 17 09:22:41 CST 2020
     */
    int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zytc_user_role
     *
     * @mbg.generated Sat Oct 17 09:22:41 CST 2020
     */
    int updateByPrimaryKeySelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zytc_user_role
     *
     * @mbg.generated Sat Oct 17 09:22:41 CST 2020
     */
    int updateByPrimaryKey(UserRole record);
}
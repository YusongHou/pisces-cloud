package com.besscroft.pisces.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.besscroft.pisces.auth.entity.User;
import org.apache.ibatis.annotations.Select;

/**
 * @Description
 * @Author Bess Croft
 * @Date 2022/2/4 13:16
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @return
     */
    @Select("SELECT " +
            "   * " +
            "FROM " +
            "   pisces_auth_user " +
            "WHERE " +
            "   username = #{username} ")
    User findByUsername(String username);

}

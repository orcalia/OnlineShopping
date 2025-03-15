package com.onlineshopping.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private int id;


    /**
     * 用户名，默认是随机字符
     */
    private String name;

    /**
     * 手机号码
     */
    private String phone;


    /**
     * 密码，加密存储
     */
    private String password;




    /**
     * 用户角色private String role;
     */



    /**
     * 创建时间private LocalDateTime createTime;
     */


    /**
     * 更新时间private LocalDateTime updateTime;
     */



}
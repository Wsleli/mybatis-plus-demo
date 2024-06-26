package com.wsleli.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description: 功能描述
 * @Version: 1.0
 * @Author: Wsleli Wiliams
 * @Date: 2024/06/25 22:40
 */
@Data
// @TableName("tbl_user")
public class User {
    // @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    private String name;

    @TableField(value = "password", select = false)
    private String pwd;

    private Integer age;

    private String tel;

    @TableField(exist = false)
    private Integer online;
}

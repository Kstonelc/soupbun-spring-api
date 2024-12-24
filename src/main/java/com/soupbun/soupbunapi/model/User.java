package com.soupbun.soupbunapi.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user") // 对应数据库表名
public class User {
    private Long id;
    private String username;
    private String email;
    private String password;
}

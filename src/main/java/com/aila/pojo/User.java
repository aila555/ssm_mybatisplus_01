package com.aila.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("tb_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private String name;
    private String password;
    private Integer age;
    private String tel;
}

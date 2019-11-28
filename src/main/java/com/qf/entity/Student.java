package com.qf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * Author Amos
 * Creat Time 2019 11 27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("t_student")
public class Student implements Serializable {
    @TableId(type= IdType.AUTO)
    private Integer id;
    private String name;
    private Integer age;
    private Date birthday;
    private String hobby;
}

package com.drf.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Damon
 * @since 2020-01-25
 */
@EqualsAndHashCode(callSuper = true)
@TableName("user")
@Data
public class User extends Model<User> {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String name;

    private Integer age;

    private Integer sex;

    private LocalDateTime timeDate;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", name=" + name +
        ", age=" + age +
        ", sex=" + sex +
        ", timeDate=" + timeDate +
        "}";
    }
}

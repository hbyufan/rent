package com.rent.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rent.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * 用户实体类
 */
@Data
@Entity
@Table(name = "t_user")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String username;

    private String password;

    private String nickName;

    private String telPhone;

    private String email;

    private String address;

    /**
     * 0女 1男 2保密
     */
    private Integer sex;

    private String avatar;

    private Integer type;

}

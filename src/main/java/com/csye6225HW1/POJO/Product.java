package com.csye6225HW1.POJO;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gitee.sunchenbin.mybatis.actable.annotation.*;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;


@Data
@Table(name = "tbl_product")
public class Product  {
    //primary key
    @TableId(type = IdType.ASSIGN_ID)
    @TableField
    @IsNotNull
    private Long id;


    @TableField
    @IsNotNull
    private String name;

    @TableField
    @IsNotNull
    private String description;

    @TableField
    @IsNotNull
    private String sku;


    @TableField
    @IsNotNull
    private String manufacturer;

    @TableField
    @IsNotNull
    private Long quantity;


    @TableField(fill = FieldFill.INSERT)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String dateAdded;



    @TableField(fill = FieldFill.INSERT_UPDATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String dateLastUpdated;


    @TableField
    private Long ownerUserId;}






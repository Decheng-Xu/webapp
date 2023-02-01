package com.csye6225HW1.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;
//This class will automatically fill the create_time and updated_time field
@Component
public class DateConfig implements MetaObjectHandler {

    /**
     * Using Mybatis plus do insert operation, this method will operate automatically
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {

        this.setFieldValByName("accountCreated",new Date().toString(),metaObject);
        this.setFieldValByName("accountUpdated",new Date().toString(),metaObject);
    }

    /**
     * Using Mybatis plus do update operation, this method will operate automatically
     *
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("accountUpdated",new Date().toString(),metaObject);
    }
}


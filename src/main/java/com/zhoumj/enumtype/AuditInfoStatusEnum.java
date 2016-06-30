package com.zhoumj.enumtype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mengjie.zhou
 * @version 1.00
 * @date 六月-29-2016,13:56
 * @description
 */
public enum AuditInfoStatusEnum {
    SUCCESS("审核通过"),
    FAILED("审核不通过");



    public static Map<String,String> map = new HashMap<String,String>();
    static{
        AuditInfoStatusEnum [] enums = AuditInfoStatusEnum.values();
        for(AuditInfoStatusEnum enumItem : enums){
            map.put(enumItem.name(), enumItem.getNameInfo());
        }
    }

    public static Map<String,String> getMessage(){
        return map;
    }
    private String name;


    AuditInfoStatusEnum(String name){
        this.name = name ;
    }
    public String getName(){
        return this.name;
    }

    public String getNameInfo(){
        return this.name;
    }
}

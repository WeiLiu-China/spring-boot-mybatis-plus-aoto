package com.ltt.demo.bean;


import com.ltt.demo.entity.PropertyValue;
import lombok.Data;

@Data
public class PropertyValueBean extends PropertyValue {
   //private  String name;  name即value
   private  int type;
}

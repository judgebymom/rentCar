package cn.ycl.entity;

import lombok.Data;

import java.util.Date;

@Data
public class CarRecord {
    //记录id
    private int recordId;
    //出租车编号
    private int cId;
    //出发时间
    private Date beginTime;
    //到达时间
    private Date endTime;
    //出发地
    private String beginPlace;
    //目的地
    private String endPlace;
    //行程总长
    private double totalLength;
}

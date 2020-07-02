package cn.ycl.entity;

import lombok.Data;

@Data
public class Car {
    //车辆id
    private int carId;


    //车牌号
    private String carNumber;

    public String getCarNumber() {
        return carNumber;
    }
}

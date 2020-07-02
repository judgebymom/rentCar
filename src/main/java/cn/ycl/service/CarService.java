package cn.ycl.service;

import cn.ycl.dao.CarDao;
import cn.ycl.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface CarService {
    public List<Car> queryCar();

    //添加出租车
    public int insertCar(String carNumber);

    //删除出租车
    public int deleteCar(int id)  ;

    //修改出租车
    public int updateCar(String carNumber,int id);

    public List<Car> queryCarLikely(int carId, String carNumber);
}

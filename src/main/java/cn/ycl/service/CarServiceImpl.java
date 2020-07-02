package cn.ycl.service;

import cn.ycl.dao.CarDao;
import cn.ycl.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao carDao;



    public List<Car> queryCar() {
        return carDao.queryCar();
    }
    //添加出租车
    public int insertCar(String carNumber){
        return carDao.insertCar(carNumber);
    }

    //删除出租车
    public int deleteCar(int id)  {
        return  carDao.deleteCar(id);
    }

    //修改出租车
    public int updateCar(String carNumber,int id){
        return  carDao.updateCar(carNumber,id);
    }

    @Override
    public List<Car> queryCarLikely(int carId, String carNumber) {
        return carDao.queryCarLikely(carId,carNumber);
    }


}

package cn.ycl.dao;

import cn.ycl.entity.Car;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
public interface CarDao {
//查询所有车
public List<Car> queryCar();

//添加出租车
 public int insertCar(String carNumber);

  //删除出租车
  public int deleteCar(int id)  ;

  //修改出租车
    public int updateCar(String carNumber,int id);

//模糊查询
    public List<Car> queryCarLikely(int carId, String carNumber);
}

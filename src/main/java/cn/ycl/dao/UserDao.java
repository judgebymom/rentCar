package cn.ycl.dao;



import cn.ycl.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
//查询所有乘客
public List<User> queryUser();

//添加乘客
 public int insertUser(String carNumber);

  //删除乘客
  public int deleteUser(int id)  ;
//修改乘客



//模糊查询
    public List<User> queryCarLikely(int carId, String carNumber);
}

package cn.ycl.controller;

import cn.ycl.entity.Car;
import cn.ycl.service.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;


@Controller
public class CarController {

    @Autowired
    private CarServiceImpl carServiceImpl;



//=================加载首页===================
    @RequestMapping("/hello")
    public String queryCar(Model model){
         List<Car> cars = carServiceImpl.queryCar();

        model.addAttribute("cars",cars);
        return "/index";
    }


    //=================插入===================

    @RequestMapping("/insertCar")
    @ResponseBody
    public int insertCar( String carNumber){

        String msg="插入失败";
        int result = carServiceImpl.insertCar(carNumber);

        return result;
    }
    //=================删除===================
@RequestMapping("/deleteCar")
@ResponseBody
    public int deleteCar(int carId){

         int result = carServiceImpl.deleteCar(carId);
        return result;
    }

    //=================部分查询===================

    @RequestMapping("/queryCar")
    @ResponseBody
    public int queryCarLikely(int carId,String carNumber,Model model){
        int result=1;
        List<Car>  carLists=carServiceImpl.queryCarLikely(carId,carNumber);
        model.addAttribute("carLists",carLists);
//        for (Car list : carLists) {
//            System.out.println(list.getCarNumber());
//        }
        if (carLists==null){
            result=0;
        }
        return result;
    }

    //=================修改===================

    @RequestMapping("/updateCar")
    @ResponseBody
    public int updateCar(int carId,String carNumber){
        int result=0;
         result=carServiceImpl.updateCar(carNumber,carId);
        return result;
    }

    }


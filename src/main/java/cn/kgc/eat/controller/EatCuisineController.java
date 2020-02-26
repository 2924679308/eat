package cn.kgc.eat.controller;
import cn.kgc.eat.pojo.EatCuisine;

import cn.kgc.eat.service.EatCuisineService;
import com.alibaba.fastjson.JSONObject;
import com.sun.net.httpserver.HttpServer;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * @author 29246
 */
@Controller
@RequestMapping("/cuisine")
public class EatCuisineController{
    private Logger logger=Logger.getLogger(EatCuisineController.class);
    @Resource
    private EatCuisineService EatCuisineService;


    /**
     * @author 刘洋
     * @desc 管理员查询菜品信息(后台页面)
     * @date 2020/2/23
     */
    @RequestMapping(value = "/getCuisineList")
    public ModelAndView getCuisineList(){
        ModelAndView modelAndView = new ModelAndView();
        List<EatCuisine> cuisineList=EatCuisineService.getCuisineList();
        modelAndView.addObject("cuisineList",cuisineList);
        modelAndView.setViewName("back/select-cuisine");
        return modelAndView;
    }
    /**
     * @author 刘洋
     * @desc 管理员添加菜品信息(后台页面)
     * @date 2020/2/23
     */
    @RequestMapping(value="/toAddCuisine")
    public String toAddCuisine(){
        return "back/add-cuisine";
    }
    @RequestMapping(value="/addCuisine")
    public String addCuisine(EatCuisine eatCuisine){
        int result =EatCuisineService.insertSelective(eatCuisine);
        if (result!=0){
            logger.info("增加菜品成功");
        }
        return  "redirect:/cuisine/getCuisineList";
                //"back/select-cuisine";
    }
    /**
     * @author 刘洋
     * @desc 管理员修改菜品信息(后台页面)
     * @date 2020/2/24
     */
    @RequestMapping(value="/toUpdateCuisine")
    public String toUpdateCuisine(HttpServletRequest request, Model model){
        String id=request.getParameter("cuisineId");
        EatCuisine eatCuisine=EatCuisineService.getCuisineById(id);
        model.addAttribute(eatCuisine);
        return "back/update-cuisine";
    }
    @RequestMapping(value="/updateCuisine")
    public String updateCuisine(EatCuisine eatCuisine){
        int result = EatCuisineService.updateByPrimaryKeySelective(eatCuisine);
        if(result!=0){
            logger.info("修改菜品信息成功");
        }
        return "redirect:/cuisine/getCuisineList";
    }
    /**
     * @author 刘洋
     * @desc 管理员删除菜品信息(后台页面)
     * @date 2020/2/24
     */
    @RequestMapping(value="/deleteCuisine")
    public String deleteCuisine(HttpServletRequest request){
        String id = request.getParameter("cuisineId");
        Integer cuisineId = Integer.parseInt(id);
        int result =EatCuisineService.deleteByPrimaryKey(cuisineId);
        if(result!=0){
            logger.info("删除菜品信成功");
        }
        return "redirect:/cuisine/getCuisineList";
               // "back/select-cuisine";
    }
}

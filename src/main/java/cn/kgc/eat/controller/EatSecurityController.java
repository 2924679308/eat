package cn.kgc.eat.controller;
import cn.kgc.eat.pojo.EatSecurity;

import cn.kgc.eat.service.EatSecurityService;
import com.alibaba.fastjson.JSONObject;
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
 * 商家食品安全档案
 */
@Controller
@RequestMapping("security")
public class EatSecurityController{
    private Logger logger=Logger.getLogger(EatSecurityController.class);
    @Resource
    private EatSecurityService EatSecurityService;

//    /**
//     * 后台登录验证
//     * @param username
//     * @param password
//     * @return
//     */
//    @RequestMapping("/doLogin")
//    public String doLogin(@RequestParam("username") String username,@RequestParam("password") String password){
//        return "back/index";
//    }

    /**
     * 后台登录页面
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "back/login";
    }
    /**
     * 前台主页面
     * @return
     */
    @RequestMapping("/Login")
    public String Login(){
        return "front/index";
    }
    /**
     * @author 刘洋
     * @desc 管理员查询商家食品安全档案(后台页面)
     * @date 2020/2/25
     */
    @RequestMapping(value = "/getList")
    public ModelAndView getList(){
        ModelAndView modelAndView = new ModelAndView();
        List<EatSecurity> securityList =  EatSecurityService.getList();
        modelAndView.addObject("securityList",securityList);
        modelAndView.setViewName("back/select-security");
        return modelAndView;
    }
    /**
     * @author 刘洋
     * @desc 管理员增加商家食品安全档案(后台页面)
     * @date 2020/2/25
     */
    @RequestMapping(value = "/toAddSecurity")
    public String toAddSecurity(){
        return "back/add-security";
    }
    @RequestMapping(value="/addSecurity")
    public String toAddSecurity(EatSecurity eatSecurity){
        int result = EatSecurityService.insertSelective(eatSecurity);
        if(result != 0){
            logger.info("增加商家食品安全档案成功");
        }
        return "redirect:/security/getList";
    }
    /**
     * @author 刘洋
     * @desc 管理员修改商家食品安全档案(后台页面)
     * @date 2020/2/25
     */
    @RequestMapping(value="/toUpdateSecurity")
    public String toUpdateSecurity(HttpServletRequest request, Model model){
        String id = request.getParameter("securityId");
        EatSecurity eatSecurity = EatSecurityService.getSecurityById(id);
        model.addAttribute(eatSecurity);
        return "back/update-security";
    }
    @RequestMapping(value="updateSecurity")
    public String updateSecurity(EatSecurity eatSecurity){
        int result = EatSecurityService.updateByPrimaryKeySelective(eatSecurity);
        if(result!=0){
            logger.info("修改商家食品安全档案成功");
        }
        return "redirect:/security/getList";
    }
    /**
     * @author 刘洋
     * @desc 管理员修改商家食品安全档案(后台页面)
     * @date 2020/2/25
     */
    @RequestMapping(value="/deleteSecurity")
    public String deleteSecurity(HttpServletRequest request){
        String id = request.getParameter("securityId");
        Integer securityId = Integer.parseInt(id);
        int result =EatSecurityService.deleteByPrimaryKey(securityId);
        if(result!=0){
            logger.info("删除商家食品安全档案成功");
        }
        return "redirect:/security/getList";
    }

}
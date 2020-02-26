package cn.kgc.eat.service;

import cn.kgc.eat.pojo.EatCuisine;
import cn.kgc.eat.pojo.EatUser;

import java.util.List;

/**
 * @author 29246
 */
public interface EatCuisineService {
    /**
     * @author 刘洋
     * @desc 管理员查询菜品信息
     * @date 2020/2/23
     */
    public List<EatCuisine> getCuisineList();
    /**
     * @author 刘洋
     * @desc 管理员添加菜品信息
     * @date 2020/2/23
     */
    int insertSelective(EatCuisine eatCuisine);
    /**
     * @author 刘洋
     * @desc 管理员修改菜品信息
     * @date 2020/2/23
     */
    int updateByPrimaryKeySelective(EatCuisine eatCuisine);
    /**
     * @author 刘洋
     * @desc 根据菜品id查询菜品信息
     * @date 2020/2/23
     */
    public EatCuisine getCuisineById(String CUISINE_ID);

    /**
     * @author 刘洋
     * @desc 管理员删除菜品信息
     * @date 2020/2/23
     */
    public int deleteByPrimaryKey(Integer cuisineId);
}
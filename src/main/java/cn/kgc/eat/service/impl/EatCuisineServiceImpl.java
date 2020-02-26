package cn.kgc.eat.service.impl;
import cn.kgc.eat.pojo.EatCuisine;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatCuisineMapper;
import cn.kgc.eat.service.EatCuisineService;

import java.util.List;

@Service
public class EatCuisineServiceImpl implements EatCuisineService{
    @Resource
    private EatCuisineMapper EatCuisineMapper;
    /**
     * @author 刘洋
     * @desc 管理员查询菜品信息
     * @date 2020/2/23
     */
    @Override
    public List<EatCuisine> getCuisineList() {
        List<EatCuisine> list=EatCuisineMapper.getCuisineList();
        return list;
    }

    /**
     * @author 刘洋
     * @desc 管理员增加菜品信息
     * @date 2020/2/23
     */

    @Override
    public int insertSelective(EatCuisine eatCuisine) {
       int count=EatCuisineMapper.insertSelective(eatCuisine);
        return count;
    }

    /**
     * @author 刘洋
     * @desc 管理员修改菜品信息
     * @date 2020/2/23
     */
    @Override
    public int updateByPrimaryKeySelective(EatCuisine eatCuisine) {
        int count=EatCuisineMapper.updateByPrimaryKeySelective(eatCuisine);
        return count;
    }

    /**
     * @author 刘洋
     * @desc 管理员查询菜品信息
     * @date 2020/2/23
     */
    @Override
    public EatCuisine getCuisineById(String CUISINE_ID) {
       EatCuisine eatCuisine=EatCuisineMapper.getCuisineById(CUISINE_ID);
        return eatCuisine;
    }

    /**
     * @author 刘洋
     * @desc 管理员删除菜品信息
     * @date 2020/2/23
     */
    @Override
    public int deleteByPrimaryKey(Integer cuisineId) {
       int count=EatCuisineMapper.deleteByPrimaryKey(cuisineId);
        return count;
    }
}
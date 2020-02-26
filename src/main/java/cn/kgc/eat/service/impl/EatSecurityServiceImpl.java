package cn.kgc.eat.service.impl;
import cn.kgc.eat.pojo.EatSecurity;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatSecurityMapper;
import cn.kgc.eat.service.EatSecurityService;

import java.util.List;

@Service
public class EatSecurityServiceImpl implements EatSecurityService{
    @Resource
    private EatSecurityMapper EatSecurityMapper;
    /**
     * @author
     * @desc 管理员查询商家食品安全档案
     * @date 2020/2/26
     */
    @Override
    public List<EatSecurity> getList() {
        List <EatSecurity> list = EatSecurityMapper.getList();
        return list;
    }

    /**
     * @author
     * @desc 管理员增加商家食品安全档案
     * @date 2020/2/26
     */
    @Override
    public int insertSelective(EatSecurity eatSecurity) {
        int count = EatSecurityMapper.insertSelective(eatSecurity);
        return count;
    }

    /**
     * @author
     * @desc 管理员增加商家食品安全档案
     * @date 2020/2/26
     */
    @Override
    public int updateByPrimaryKeySelective(EatSecurity eatSecurity) {
        int count = EatSecurityMapper.updateByPrimaryKeySelective(eatSecurity);
        return count;
    }

    /**
     * @author
     * @desc 管理员增加商家食品安全档案
     * @date 2020/2/26
     */
    @Override
    public EatSecurity getSecurityById(String SECURITY_ID) {
        EatSecurity eatSecurity = EatSecurityMapper.getSecurityById(SECURITY_ID);
        return eatSecurity;
    }

    /**
     * @author
     * @desc 管理员增加商家食品安全档案
     * @date 2020/2/26
     */
    @Override
    public int deleteByPrimaryKey(Integer securityId) {
        int count = EatSecurityMapper.deleteByPrimaryKey(securityId);
        return count;
    }

}
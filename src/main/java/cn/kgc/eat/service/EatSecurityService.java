package cn.kgc.eat.service;

import cn.kgc.eat.pojo.EatSecurity;
import cn.kgc.eat.pojo.EatUser;

import java.util.List;

/**
 * @author 29246
 */
public interface EatSecurityService{

        /**
         * @author
         * @desc 查询商家食品安全档案
         * @date 2020/2/25
         */
        public List<EatSecurity> getList();

        /**
         * @author
         * @desc 增加商家食品安全档案
         * @date 2020/2/25
         */
        int insertSelective(EatSecurity eatSecurity);

        /**
         * @author
         * @desc修改商家食品安全档案
         * @date 2020/2/25
         */
        int updateByPrimaryKeySelective(EatSecurity eatSecurity);
        /**
         * @author
         * @desc 根据用户id查询商家食品安全档案
         * @date 2020/2/25
         */
        public EatSecurity getSecurityById(String SECURITY_ID);

        /**
         * @author
         * @desc 删除商家食品安全档案
         * @date 2020/2/25
         */
        public int deleteByPrimaryKey(Integer securityID);


}

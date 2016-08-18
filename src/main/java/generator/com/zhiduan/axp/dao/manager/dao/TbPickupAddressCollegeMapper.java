package generator.com.zhiduan.axp.dao.manager.dao;

import com.zhiduan.axp.dao.manager.bean.TbPickupAddressCollege;

public interface TbPickupAddressCollegeMapper {
    int deleteByPrimaryKey(Long pacId);

    int insert(TbPickupAddressCollege record);

    int insertSelective(TbPickupAddressCollege record);

    TbPickupAddressCollege selectByPrimaryKey(Long pacId);

    int updateByPrimaryKeySelective(TbPickupAddressCollege record);

    int updateByPrimaryKey(TbPickupAddressCollege record);
}
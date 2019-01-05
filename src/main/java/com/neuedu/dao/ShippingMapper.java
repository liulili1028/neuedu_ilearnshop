package com.neuedu.dao;

import com.neuedu.pojo.Shipping;
import java.util.List;

public interface ShippingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_shipping
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_shipping
     *
     * @mbggenerated
     */
    int insert(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_shipping
     *
     * @mbggenerated
     */
    Shipping selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_shipping
     *
     * @mbggenerated
     */
    List<Shipping> selectAll();
    List<Shipping> selectByUserid(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_shipping
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Shipping record);

    int updateByPrimaryKeySelective(Shipping record);
}
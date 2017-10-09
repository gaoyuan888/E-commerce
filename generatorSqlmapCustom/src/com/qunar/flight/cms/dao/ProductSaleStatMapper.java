




package com.qunar.flight.cms.dao;

import com.qunar.flight.cms.model.ProductSaleStat;
import com.qunar.flight.cms.model.ProductSaleStatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSaleStatMapper {
    int countByExample(ProductSaleStatExample example);

    int deleteByExample(ProductSaleStatExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductSaleStat record);

    int insertSelective(ProductSaleStat record);

    List<ProductSaleStat> selectByExample(ProductSaleStatExample example);

    ProductSaleStat selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductSaleStat record, @Param("example") ProductSaleStatExample example);

    int updateByExample(@Param("record") ProductSaleStat record, @Param("example") ProductSaleStatExample example);

    int updateByPrimaryKeySelective(ProductSaleStat record);

    int updateByPrimaryKey(ProductSaleStat record);
}
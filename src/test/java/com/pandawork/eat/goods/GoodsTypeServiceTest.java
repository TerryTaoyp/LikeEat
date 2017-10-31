package com.pandawork.eat.goods;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.AbstractTestCase;
import com.pandawork.eat.common.entity.goods.GoodsType;
import com.pandawork.eat.service.goods.GoodsTypeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Taoyongpan on 2017/10/28.
 */
public class GoodsTypeServiceTest extends AbstractTestCase {
    @Autowired
    GoodsTypeService goodsTypeService;

    /**
     * 新增测试
     * @throws SSException
     */
    @Test
    public void addTest() throws SSException {
        GoodsType goodsType = new GoodsType();
        goodsType.setName("haahha");
        goodsType.setRemark("lululu");
        goodsTypeService.addGoodsType(goodsType);
    }

    /**
     * 编辑测试
     * @throws SSException
     */
    @Test
    public void editTest()throws SSException{
        GoodsType goodsType = new GoodsType();
        goodsType.setId(1);
        goodsType.setName("haahha");
        goodsType.setRemark("lululu");
    }

    /**
     * 删除测试
     * @throws SSException
     */
    @Test
    public void delTest()throws SSException{
        goodsTypeService.delGoodsType(2);
    }

    /**
     * 列出所有测试
     * @throws SSException
     */
    @Test
    public void listAll()throws SSException{
        goodsTypeService.listAll();
    }
}

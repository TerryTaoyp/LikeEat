package com.pandawork.eat.goods;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.eat.AbstractTestCase;
import com.pandawork.eat.common.entity.goods.Goods;
import com.pandawork.eat.service.goods.GoodsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Taoyongpan on 2017/10/25.
 */
public class GoodsServiceTest extends AbstractTestCase{
    @Autowired
    GoodsService goodsService;

    /**
     * 商品新增测试
     * @throws SSException
     */
    @Test
    public void addTest()throws SSException{
        Goods goods = new Goods();
        goods.setGoodsName("山药3");
        goods.setGoodsType(2);
        goods.setGoodsAddress("gshghsgh");
        goods.setSpecification("hahahah");
        goodsService.addGoods(goods);
    }

    /**
     * 编辑测试
     * @throws SSException
     */
    @Test
    public void updateTest()throws SSException{
        Goods goods = new Goods();
        goods.setId(1);
        goods.setGoodsName("山药3");
        goods.setGoodsType(2);
        goods.setGoodsAddress("gshghsgh");
        goods.setSpecification("hahahah");
        goodsService.updateGoods(goods);
    }

    /**
     * 删除测试
     * @throws SSException
     */
    @Test
    public void delTest()throws SSException{
        goodsService.delGoods(1);
    }

    /**
     * 根据ID查找测试
     * @throws SSException
     */
    @Test
    public void queryGoodsByIdTest()throws SSException{
        goodsService.queryGoodsById(2);
    }

    /**
     * 列出所有的商品
     * @throws SSException
     */
    @Test
    public void listAllTest()throws SSException{
        goodsService.listAll();
    }

    /**
     * 根据商品类别查找测试
     * @throws SSException
     */
    @Test
    public void queryGoodsByType()throws SSException{
        goodsService.queryGoodsByType(2);
    }

    /**
     * 根据商品名字查询
     * @throws SSException
     */
    @Test
    public void queryGoodsByNameTest()throws SSException{
        goodsService.queryGoodsByName("山药3");
    }

    @Test
    public void queryGoodsDtoById()throws SSException{
        System.out.println(goodsService.queryGoodsDtoById(2));
    }
}

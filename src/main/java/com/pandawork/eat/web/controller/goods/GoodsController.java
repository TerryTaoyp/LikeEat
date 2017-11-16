package com.pandawork.eat.web.controller.goods;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.goods.Goods;
import com.pandawork.eat.service.goods.GoodsService;
import com.pandawork.eat.web.controller.AbstractController;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/11/14.
 */
@Controller
@RequestMapping("/goods")
public class GoodsController extends AbstractController {
    @Autowired
    GoodsService goodsService;

    /**
     * 获取商品列表
     * @param model
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Model model)throws SSException{
        List<Goods> goodsList = goodsService.listAll();
        model.addAttribute("goodsList",goodsList);
        return "goods/goodsManager";
    }

    /**
     * 跳转到新增商品页面
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/to/add",method = RequestMethod.GET)
    public String toAddGoods()throws SSException{
        return "goods/edit/addManager";
    }

    /**
     * 新增商品
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addGoods(@RequestParam("goodsName") String goodsName,@RequestParam("goodsTypeId") int goodsTypeId,@RequestParam("goodsAddress") String goodsAddress,@RequestParam("specification") String specification)throws SSException{
        Goods goods = new Goods();
        goods.setGoodsName(goodsName);
        goods.setGoodsType(goodsTypeId);
        goods.setGoodsAddress(goodsAddress);
        goods.setSpecification(specification);
        goodsService.addGoods(goods);
        return "redirect:goods/list";
    }

    /**
     * 跳转到编辑页面
     * @return
     */
    @RequestMapping(value = "/to/edit",method = RequestMethod.GET)
    public String toEdit(){
        return "goods/edit/editManager";
    }

    /**
     * 编辑商品信息
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public String edit(@RequestParam("id") int id,@RequestParam("goodsName") String goodsName,@RequestParam("goodsTypeId") int goodsTypeId,@RequestParam("goodsAddress") String goodsAddress,@RequestParam("specification") String specification)throws SSException{
        Goods goods = goodsService.queryGoodsById(id);
        goods.setGoodsName(goodsName);
        goods.setGoodsType(goodsTypeId);
        goods.setGoodsAddress(goodsAddress);
        goods.setSpecification(specification);
        goodsService.updateGoods(goods);
        return "redirect:/goods/list";
    }

    /**
     * 删除商品
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/del",method = RequestMethod.POST)
    public JSONObject del(@RequestParam("id") int id)throws SSException{
        if (Assert.isNull(id)){
            return  sendJsonObject(0);
        }else {
            goodsService.delGoods(id);
            return sendJsonObject(1);
        }
    }


}

package com.pandawork.eat.web.controller.goods;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.goods.Goods;
import com.pandawork.eat.common.entity.goods.GoodsType;
import com.pandawork.eat.service.goods.GoodsService;
import com.pandawork.eat.service.goods.GoodsTypeService;
import com.pandawork.eat.web.controller.AbstractController;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/11/14.
 */
@Controller
@RequestMapping("/goods")
public class GoodsController extends AbstractController {
    @Autowired
    GoodsService goodsService;
    @Autowired
    GoodsTypeService typeService;

    /**
     * 获取商品列表
     * @param model
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Model model)throws SSException{
        List<Goods> goodsList = goodsService.listAll();
        List<GoodsType> goodsTypeList = typeService.listAll();
        model.addAttribute("goodsTypeList",goodsTypeList);
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
    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public JSONObject addGoods(@RequestParam("goodsName") String goodsName,@RequestParam("goodsTypeId") int goodsTypeId,@RequestParam("goodsAddress") String goodsAddress,@RequestParam("specification") String specification)throws SSException{
        Goods goods = new Goods();
        goods.setGoodsName(goodsName);
        goods.setGoodsType(goodsTypeId);
        goods.setGoodsAddress(goodsAddress);
        goods.setSpecification(specification);
        goodsService.addGoods(goods);
        return sendJsonObject(1);
    }

    /**
     * 跳转到编辑页面
     * @return
     */
    @RequestMapping(value = "/to/edit/{id}",method = RequestMethod.GET)
    public String toEdit(@PathVariable("id") int id, Model model) throws SSException {
        Goods goods = goodsService.queryGoodsById(id);
        model.addAttribute("goods",goods);
        return "goods/edit/editManager";
    }

    /**
     * 编辑商品信息
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public  JSONObject edit(@RequestParam("id") int id,@RequestParam("goodsName") String goodsName,@RequestParam("goodsTypeId") int goodsTypeId,@RequestParam("goodsAddress") String goodsAddress,@RequestParam("specification") String specification)throws SSException{
        Goods goods = goodsService.queryGoodsById(id);
        goods.setGoodsName(goodsName);
        goods.setGoodsType(goodsTypeId);
        goods.setGoodsAddress(goodsAddress);
        goods.setSpecification(specification);
        goodsService.updateGoods(goods);
        return sendJsonObject(1);
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

    /**
     * 类型列表
     * @param model
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/type/list",method = RequestMethod.GET)
    public String typeList(Model model)throws SSException{
        List<GoodsType> goodsTypeList = typeService.listAll();
        model.addAttribute("goodsTypeList",goodsTypeList);
        return "goods/goodsType";
    }

    /**
     * 商品类型的新增
     * @param model
     * @param name
     * @param remark
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/type/add",method = RequestMethod.POST)
    public String addType(Model model,@RequestParam("name") String name,@RequestParam("remark") String remark)throws SSException{
        GoodsType goodsType = new GoodsType();
        goodsType.setName(name);
        goodsType.setRemark(remark);
        typeService.addGoodsType(goodsType);
        return "redirect:/goods/type/list";
    }

    /**
     * 跳转到编辑商品类型页面
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/type/to/edit",method = RequestMethod.GET)
    public String toEditType()throws SSException{
        return "goods/edit/editType";
    }

    /**
     * 编辑商品类型
     * @param id
     * @param name
     * @param remark
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/type/edit",method = RequestMethod.POST)
    public JSONObject editType(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("remark") String remark)throws SSException{
        GoodsType goodsType = typeService.queryById(id);
        goodsType.setName(name);
        goodsType.setRemark(remark);
        typeService.editGoodsType(goodsType);
        return sendJsonObject(1);
    }

    /**
     * 删除商品类型
     * @param id
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/type/del",method = RequestMethod.POST)
    public JSONObject delType(int id)throws SSException{
        if (Assert.isNotNull(id)){
            typeService.delGoodsType(id);
            return  sendJsonObject(1);
        }else {
            return sendJsonObject(0);
        }

    }


}

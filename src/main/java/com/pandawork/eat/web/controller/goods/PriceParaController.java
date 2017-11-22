package com.pandawork.eat.web.controller.goods;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.goods.PricePara;
import com.pandawork.eat.common.entity.sales.CustomerType;
import com.pandawork.eat.service.goods.PriceParaService;
import com.pandawork.eat.service.sales.CustomerTypeService;
import com.pandawork.eat.web.controller.AbstractController;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/11/21.
 */
@Controller
@RequestMapping("/price")
public class PriceParaController extends AbstractController {
    @Autowired
    PriceParaService priceParaService;
    @Autowired
    CustomerTypeService customerTypeService;

    /**
     * 客户价格参数
     * @param model
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Model model)throws SSException{
        // TODO: 2017/11/22 priceParaList需要和CustomerType关联起来，展示列表中要有该参数所属客户类别，前端JSTL来判断不方便
        // TODO: 2017/11/22 为啥要把这俩表分开呢……有一个customerType就有一个对应的价格参数。添加客户类型时设置价格参数，之后只能修改，不能删除，要删除连客户类型一起删除
        List<PricePara> priceParaList = priceParaService.listAll();
        List<CustomerType> customerTypeList = customerTypeService.listAll();
        model.addAttribute("priceParaList",priceParaList);
        model.addAttribute("customerTypeList",customerTypeList);
        return "goods/goodsPriceParameter";
    }

    /**
     * 客户价格参数增加
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public JSONObject add(@RequestParam("customerTypeId") int customerTypeId,@RequestParam("pricePara") Double pricePara)throws SSException{
        PricePara pricePara1 = new PricePara();
        pricePara1.setCustomerTypeId(customerTypeId);
        pricePara1.setPricePara(pricePara);
        priceParaService.addPricePara(pricePara1);

        return sendJsonObject(1);
    }

    /**
     * 跳转到编辑页面
     * @param id
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/to/edit/{id}",method = RequestMethod.GET)
    public String toEdit(@PathVariable("id") int id, Model model)throws SSException{
        // TODO: 2017/11/22 需向前端传递customerTypeId所对应的客户类别名称
        PricePara pricePara = priceParaService.queryById(id);
        model.addAttribute("pricePara",pricePara);
        return "goods/edit/editPriceParameter";
    }

    /**
     * 编辑信息
     * @param id
     * @param pricePara
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public JSONObject edit(@RequestParam("id") int id,@RequestParam("pricePara") Double pricePara )throws SSException{
        PricePara pricePara1 = priceParaService.queryById(id);
        pricePara1.setPricePara(pricePara);
        priceParaService.editPricePara(pricePara1);
        return sendJsonObject(1);
    }

    /**
     * 删除
     * @param id
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/del",method = RequestMethod.POST)
    public JSONObject del(@RequestParam("id") int  id)throws SSException{
        if (Assert.isNull(id)){
            return  sendJsonObject(0);
        }else {
            priceParaService.delPricePara(id);
            return  sendJsonObject(1);
        }
    }
}

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
        List<CustomerType> customerTypeList = customerTypeService.listAll();
        model.addAttribute("customerTypeList",customerTypeList);
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

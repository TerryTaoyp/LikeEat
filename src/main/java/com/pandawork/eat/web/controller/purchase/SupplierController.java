package com.pandawork.eat.web.controller.purchase;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.purchase.Supplier;
import com.pandawork.eat.common.entity.purchase.SupplierType;
import com.pandawork.eat.service.purchase.SupplierService;
import com.pandawork.eat.service.purchase.SupplierTypeService;
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
 * Created by Taoyongpan on 2017/11/25.
 */
@Controller
@RequestMapping("/supplier")
public class SupplierController extends AbstractController{
    @Autowired
    SupplierService supplierService;
    @Autowired
    SupplierTypeService supplierTypeService;

    /**
     * 获得供货商列表
     * @param model
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Model model)throws SSException{
        List<Supplier> supplierList = supplierService.listAll();
        List<SupplierType> supplierTypeList =supplierTypeService.listAll();
         model.addAttribute("supplierList",supplierList);
         model.addAttribute("supplierTypeList",supplierTypeList);
        return "purchase/supplier/supplierList";
    }

    /**
     * 新增供货商
     * @param supplierName
     * @param supplierTypeId
     * @param supplierAddress
     * @param telephone
     * @param remark
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public JSONObject add(@RequestParam("supplierName") String supplierName, @RequestParam("supplierTypeId") int supplierTypeId, @RequestParam("supplierAddress") String supplierAddress, @RequestParam("telephone") String telephone, @RequestParam("remark") String remark)throws SSException{
        Supplier supplier = new Supplier();
        supplier.setSupplierName(supplierName);
        supplier.setSupplierTypeId(supplierTypeId);
        supplier.setSupplierAddress(supplierAddress);
        supplier.setTelephone(telephone);
        supplier.setRemark(remark);
        supplierService.addSupplier(supplier);
        return sendJsonObject(1);
    }

    /**
     * 跳转到编辑页面
     * @param id
     * @param model
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/to/eit",method = RequestMethod.POST)
    public String toEdit(@RequestParam("id") int id,Model model)throws SSException{
        Supplier supplier= supplierService.queryById(id);
        List<Supplier> supplierList = supplierService.listAll();
        model.addAttribute("supplier",supplier);
        model.addAttribute("supplierList",supplierList);
        return "purchase/edit/editSupplierList";
    }

    /**
     * 编辑信息
     * @param id
     * @param supplierName
     * @param supplierTypeId
     * @param supplierAddress
     * @param telephone
     * @param remark
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public JSONObject edit(@RequestParam("id") int id,@RequestParam("supplierName") String supplierName, @RequestParam("supplierTypeId") int supplierTypeId, @RequestParam("supplierAddress") String supplierAddress, @RequestParam("telephone") String telephone, @RequestParam("remark") String remark)throws SSException{
        Supplier supplier = supplierService.queryById(id);
        supplier.setSupplierName(supplierName);
        supplier.setSupplierTypeId(supplierTypeId);
        supplier.setSupplierAddress(supplierAddress);
        supplier.setTelephone(telephone);
        supplier.setRemark(remark);
        supplierService.editSupplier(supplier);
        return sendJsonObject(1);
    }

    /**
     * 根据ID删除供货商
     * @param id
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/del",method = RequestMethod.POST)
    public JSONObject del(@RequestParam("id") int id)throws SSException{
        if (Assert.isNull(id)){
            return sendJsonObject(0);
        }else {
            supplierService.delSupplier(id);
            return sendJsonObject(1);
        }
    }

    /**
     * 获取供货商类别列表
     * @param model
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/type/list",method = RequestMethod.GET)
    public String typeList(Model model)throws SSException{
        List<SupplierType> supplierTypeList = supplierTypeService.listAll();
        model.addAttribute("supplierTypeList",supplierTypeList);
        return "purchase/supplier/supplierType";
    }

    /**
     * 新增供货商类别
     * @param name
     * @param remark
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/type/add",method = RequestMethod.POST)
    public JSONObject typeAdd(@RequestParam("name") String name,@RequestParam("remark") String remark)throws SSException{
        SupplierType supplierType = new SupplierType();
        supplierType.setName(name);
        supplierType.setRemark(remark);
        supplierTypeService.addSupplierType(supplierType);
        return sendJsonObject(1);
    }


    /**
     * 跳转到编辑页面
     * @param id
     * @param model
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/type/to/edit",method = RequestMethod.POST)
   public String typeToEdit(@RequestParam("id") int id,Model model)throws SSException{
        SupplierType supplierType = supplierTypeService.queryById(id);
        model.addAttribute("supplierType",supplierType);
        return "purchase/edit/editSupplierType";
   }

    /**
     * 编辑供货商类型
     * @param id
     * @param name
     * @param remark
     * @return
     * @throws SSException
     */
   @ResponseBody
   @RequestMapping(value = "/type/edit",method = RequestMethod.POST)
   public JSONObject typeEdit(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("remark") String remark)throws SSException{
       SupplierType supplierType = supplierTypeService.queryById(id);
       supplierType.setName(name);
       supplierType.setRemark(remark);
       supplierTypeService.editSupplierType(supplierType);
       return sendJsonObject(1);
   }

    /**
     * 删除供货商类类别
     * @param id
     * @return
     * @throws SSException
     */
   @ResponseBody
   @RequestMapping(value = "/type/del",method = RequestMethod.POST)
   public JSONObject typeDel(@RequestParam("id") int id)throws SSException{
        if (Assert.isNull(id)){
            return sendJsonObject(0);
        }else {
            supplierTypeService.delSupplierType(id);
            return sendJsonObject(1);
        }
   }
}

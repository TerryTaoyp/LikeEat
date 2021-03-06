package com.pandawork.eat.web.controller.sales;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.util.Assert;
import com.pandawork.eat.common.entity.sales.Customer;
import com.pandawork.eat.common.entity.sales.CustomerType;
import com.pandawork.eat.service.sales.*;
import com.pandawork.eat.web.controller.AbstractController;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Taoyongpan on 2017/11/28.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController extends AbstractController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerTypeService customerTypeService;
    //2为会员
    @Autowired
    MemberTypeService memberTypeService;
    //3是销售商
    @Autowired
    RetailerTypeService retailerTypeService;
    //4为代理商
    @Autowired
    AgentTypeService agentTypeService;
    /**
     * 获得客户列表页面
     * @param model
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String customerList(Model model)throws SSException{
        List<Customer> customerList = customerService.listAll();
        List<CustomerType> customerTypeList = customerTypeService.listAll();
        model.addAttribute("customerList",customerList);
        model.addAttribute("customerTypeList",customerTypeList);
        return "sales/customer/customerList";
    }

    /**
     * 添加新客户;1是普通客户；2是会员；3是销售商；4是代理商
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public JSONObject addCustomer(@RequestParam("customerName") String customerName,
                                  @RequestParam("unitAddress") String unitAddress,
                                  @RequestParam("deliveryAddress1")String deliveryAddress1,
                                  @RequestParam("deliveryAddress2")String deliveryAddress2,
                                  @RequestParam("deliveryAddress3")String deliveryAddress3,
                                  @RequestParam("telephone1")String telephone1,
                                  @RequestParam("telephone2")String telephone2,
                                  @RequestParam("telephone3")String telephone3,
                                  @RequestParam("qq")String qq,
                                  @RequestParam("wechat")String wechat,
                                  @RequestParam("alipay")String alipay,
                                  @RequestParam("bankName")String bankName,
                                  @RequestParam("bankNum")String bankNum,
                                  @RequestParam("email1")String email1,
                                  @RequestParam("email2")String email2,
                                  @RequestParam("customerTypeId")int customerTypeId,
                                  @RequestParam("customerTypeId2")int customerTypeId2,
                                  @RequestParam("remark")String remark,
                                  @RequestParam("level")int level,//会员等级
                                  @RequestParam("sex")int sex,//会员性别
                                  @RequestParam("cardId")String cardId,//会员卡号
                                  @RequestParam("birth")String birth,//会员生日
                                  @RequestParam("idNumber")String idNumber//身份证号
                                  )throws SSException{
        Customer customer = new Customer();
        customer.setCustomerName(customerName);
        customer.setUnitAddress(unitAddress);
        customer.setDeliveryAddress1(deliveryAddress1);
        customer.setDeliveryAddress2(deliveryAddress2);
        customer.setDeliveryAddress3(deliveryAddress3);
        customer.setTelephone1(telephone1);
        customer.setTelephone2(telephone2);
        customer.setTelephone3(telephone3);
        customer.setQq(qq);
        customer.setWeChat(wechat);
        customer.setAlipay(alipay);
        customer.setBankName(bankName);
        customer.setBankNum(bankNum);
        customer.setEmail1(email1);
        customer.setEmail2(email2);
        customer.setCustomerTypeId(customerTypeId);
        customer.setRemark(remark);
        customerService.addCustomer(customer);
        return sendJsonObject(1);
    }

    /**
     * 跳转到客户编辑页面
     * @param model
     * @param id
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/to/edit/{id}",method = RequestMethod.GET)
    public String toCustomerEdit(Model model,@PathVariable("id") int id)throws SSException{
        Customer customer = customerService.queryById(id);
        model.addAttribute("customer",customer);
        return "sales/edit/editCustomerList";
    }

    /**
     * 编辑客户信息
     * @param id
     * @param customerName
     * @param unitAddress
     * @param deliveryAddress1
     * @param deliveryAddress2
     * @param deliveryAddress3
     * @param telephone1
     * @param telephone2
     * @param telephone3
     * @param qq
     * @param wechat
     * @param alipay
     * @param bankName
     * @param email1
     * @param email2
     * @param customerTypeId
     * @param remark
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public JSONObject customerEdit(@RequestParam("id") int id,
                                   @RequestParam("customerName") String customerName,
                                   @RequestParam("unitAddress") String unitAddress,
                                   @RequestParam("deliveryAddress1")String deliveryAddress1,
                                   @RequestParam("deliveryAddress2")String deliveryAddress2,
                                   @RequestParam("deliveryAddress3")String deliveryAddress3,
                                   @RequestParam("telephone1")String telephone1,
                                   @RequestParam("telephone2")String telephone2,
                                   @RequestParam("telephone3")String telephone3,
                                   @RequestParam("qq")String qq,
                                   @RequestParam("wechat")String wechat,
                                   @RequestParam("alipay")String alipay,
                                   @RequestParam("bankName")String bankName,
                                   @RequestParam("bankNum")String bankNum,
                                   @RequestParam("email1")String email1,
                                   @RequestParam("email2")String email2,
                                   @RequestParam("customerTypeId")int customerTypeId,
                                   @RequestParam("customerTypeId2")int customerTypeId2,
                                   @RequestParam("remark")String remark,
                                   @RequestParam("level")int level,//会员等级
                                   @RequestParam("sex")int sex,//会员性别
                                   @RequestParam("cardId")String cardId,//会员卡号
                                   @RequestParam("birth")String birth,//会员生日
                                   @RequestParam("idNumber")String idNumber//身份证号
                                   )throws SSException{
        Customer customer = customerService.queryById(id);
        customer.setCustomerName(customerName);
        customer.setUnitAddress(unitAddress);
        customer.setDeliveryAddress1(deliveryAddress1);
        customer.setDeliveryAddress2(deliveryAddress2);
        customer.setDeliveryAddress3(deliveryAddress3);
        customer.setTelephone1(telephone1);
        customer.setTelephone2(telephone2);
        customer.setTelephone3(telephone3);
        customer.setQq(qq);
        customer.setWeChat(wechat);
        customer.setAlipay(alipay);
        customer.setBankName(bankName);
        customer.setBankNum(bankNum);
        customer.setEmail1(email1);
        customer.setEmail2(email2);
        customer.setCustomerTypeId(customerTypeId);
        customer.setRemark(remark);
        customerService.editCustomer(customer);
        return sendJsonObject(1);
    }

    /**
     * 根据Id删除
     * @param id
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/del",method = RequestMethod.POST)
    public JSONObject delCustomer(@RequestParam("id") int id)throws SSException{
        if (Assert.isNull(id)){
            return sendJsonObject(0);
        }else {
            customerService.delCustomer(id);
            return sendJsonObject(1);
        }
    }

    /**
     * 客户类型列表
     * @param model
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/type/list",method = RequestMethod.GET)
    public String customerTypeList(Model model)throws SSException{
        List<CustomerType> customerTypeList = customerTypeService.listAll();
        model.addAttribute("customerTypeList",customerTypeList);
        return "sales/customer/customerType";
    }

    /**
     * 客户类型添加
     * @param name
     * @param remark
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/type/add",method = RequestMethod.POST)
    public JSONObject addCustomerTypeId(@RequestParam("name") String name,@RequestParam("generalType")int generalType,@RequestParam("remark") String remark)throws SSException{
        CustomerType customerType = new CustomerType();
        customerType.setName(name);
        customerType.setRemark(remark);
        customerTypeService.addCustomerType(customerType);
        return sendJsonObject(1);
    }

    /**
     * 跳转到编辑客户类别页面
     * @param id
     * @param model
     * @return
     * @throws SSException
     */
    @RequestMapping(value = "/type/to/edit/{id}",method = RequestMethod.GET)
    public String toCustomerTypeEdit(@PathVariable("id") int id, Model model)throws SSException{
        CustomerType customerType = customerTypeService.queryById(id);
        model.addAttribute("customerType",customerType);
        return "sales/edit/editCustomerType";
    }

    /**
     * 编辑客户类别页面
     * @param id
     * @param name
     * @param remark
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/type/edit",method = RequestMethod.POST)
    public JSONObject customerTypeEdit(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("remark") String remark)throws SSException{
        CustomerType customerType = customerTypeService.queryById(id);
        customerType.setName(name);
        customerType.setRemark(remark);
        customerTypeService.editCustomerType(customerType);
        return sendJsonObject(1);
    }

    /**
     * 根据ID删除客户类别
     * @param id
     * @return
     * @throws SSException
     */
    @ResponseBody
    @RequestMapping(value = "/type/del",method = RequestMethod.POST)
    public JSONObject delCustomerType(@RequestParam("id") int id)throws SSException{
        if (Assert.isNull(id)){
            return sendJsonObject(0);
        }else {
            customerTypeService.delCustomerType(id);
            return sendJsonObject(1);
        }
    }
}

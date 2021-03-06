(function(){

    var site = {
        //这是前端本地需要配置的，用来看自己写的页面
        website:'http://localhost:8080/', //站点地址
        //静态资源地址
        staticWebsite: 'http://localhost:8080/resources/'

        // website:'http://39.108.137.243/Home_id/', //站点地址
        // //静态资源地址
        // staticWebsite: 'http://39.108.137.243/Home_id/resources/js'
    }
    // 页面内容
    _ajax = {
        status: 0, //0-前端调试，1-后端调试, 2-后端部署
        website: site.website,
        staticWebsite: site.staticWebsite,
        //统一错误信息入口
        msg: {
            0: '网络加载错误'
        },
        //ajax地址信息
        url: {
            //系统管理
            system: {
                //角色管理
                role: {
                    edit: site.website+'role/to/edit/',//跳转修改角色页面
                    update: site.website+'role/edit',//提交修改角色
                    add: site.website+'role/add',//提交添加角色
                    del: site.website+'role/del'//提交删除角色
                },
                //用户管理
                user:{
                    add: site.website+'user/add',//提交添加用户
                    edit: site.website+'user/to/edit/',//跳转修改用户页面
                    update: site.website+'user/edit',//提交修改用户
                    del: site.website+'user/del',//提交删除用户
                    updatePassword: site.website+'/editPassword'//提交修改密码
                }
            },
            goods: {
                //商品基本信息管理
                manager:{
                    add:site.website+'goods/to/add',//跳转新增商品页面
                    insert:site.website+'goods/add',//提交新增商品
                    edit:site.website+'goods/to/edit/',//跳转编辑商品页面
                    update:site.website+'goods/edit',//提交编辑商品
                    del:site.website+'goods/del'//提交删除商品
                },
                //商品类别管理
                type:{
                    insert:site.website+'goods/type/add',//提交新增商品类型
                    edit:site.website+'goods/type/to/edit/',//跳转编辑商品类型页面
                    update:site.website+'goods/type/edit',//提交编辑商品类型
                    del:site.website+'goods/type/del'//提交删除商品类型
                },
                //价格信息管理
                price:{
                    insert:site.website+'goods/price/add',//提交新增商品价格
                    edit:site.website+'goods/price/to/edit/',//跳转编辑商品价格页面
                    update:site.website+'goods/price/edit',//提交编辑商品价格
                    del:site.website+'goods/price/del'//提交删除商品价格
                },
                //价格参数管理
                para:{
                    insert:site.website+'price/add',//提交新增价格参数
                    edit:site.website+'price/to/edit/',//跳转编辑价格参数页面
                    update:site.website+'price/edit',//提交编辑价格参数
                    del:site.website+'price/del'//提交删除价格参数
                }
            },
            //入库管理
            purchase:{
                //供货商列表
                suppList:{
                    insert:site.website+'supplier/add',//提交新增供货商
                    edit:site.website+'supplier/to/edit/',//跳转编辑供货商页面
                    update:site.website+'supplier/edit',//提交编辑供货商
                    del:site.website+'supplier/del'//提交删除供货商
                },
                //供货商类别
                suppType:{
                    insert:site.website+'supplier/type/add',//提交新增供货商类型
                    edit:site.website+'supplier/type/to/edit/',//跳转编辑供货商类型页面
                    update:site.website+'supplier/type/edit',//提交编辑供货商类型
                    del:site.website+'supplier/type/del',//提交删除供货商类型
                }
            },
            //出库管理
            sale:{
                //客户列表
                customerList:{
                    add:site.website+'customer/add',//提交新增客户
                    edit:site.website+'customer/to/edit/',//跳转编辑客户页面
                    update:site.website+'customer/edit',//提交编辑客户
                    del:site.website+'customer/del'//提交删除客户
                },
                customerType:{
                    add:site.website+'customer/type/add',//提交新增客户类型
                    edit:site.website+'customer/type/to/edit/',//跳转编辑客户类型页面
                    update:site.website+'customer/type/edit',//提交编辑客户类型
                    del:site.website+'customer/type/del'//提交删除客户类型
                }
            }
        },
    }
})();
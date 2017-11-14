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
                    edit: site.website+'role/to/edit/',//跳转修改页面
                    update: site.website+'role/edit',//提交修改数据
                    add: site.website+'role/add',//提交添加数据
                    del: site.website+'role/del'//提交删除数据
                }
            }
        },
    }
})();
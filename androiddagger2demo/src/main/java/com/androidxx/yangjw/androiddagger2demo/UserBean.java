package com.androidxx.yangjw.androiddagger2demo;

import javax.inject.Inject;

/**
 * Created by yangjw on 2016/5/26.
 * url：androidxx.cn
 * desc：TODO
 */
public class UserBean {

    @Inject
    public UserBean() {
    }

    public String getName() {
        return "yangjingwen";
    }
}

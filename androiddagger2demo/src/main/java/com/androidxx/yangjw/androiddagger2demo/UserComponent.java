package com.androidxx.yangjw.androiddagger2demo;

import dagger.Component;

/**
 * Created by yangjw on 2016/5/26.
 * url：androidxx.cn
 * desc：TODO
 */
@Component
public interface UserComponent {

    void inject(MainActivity activity);
}

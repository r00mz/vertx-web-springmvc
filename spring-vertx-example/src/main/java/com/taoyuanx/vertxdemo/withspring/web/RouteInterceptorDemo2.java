package com.taoyuanx.vertxdemo.withspring.web;

import com.taoyuanx.springmvc.vertx.core.core.interceptors.Interceptor;
import com.taoyuanx.springmvc.vertx.core.core.Order;
import com.taoyuanx.springmvc.vertx.core.core.interceptors.IRequestInterceptor;
import io.vertx.ext.web.RoutingContext;
import org.springframework.stereotype.Component;

/**
 * @author dushitaoyuan
 * @date 2020/4/21
 */
@Interceptor
@Component
public class RouteInterceptorDemo2 implements IRequestInterceptor, Order {


    @Override
    public boolean pre(RoutingContext routingContext) {
        System.out.println("pre2");
        return true;
    }

    @Override
    public boolean after(RoutingContext routingContext) {
        /**
         * end 后 不执行
         */
        System.out.println("after2");
        return true;
    }

    @Override
    public int order() {
        return 100;
    }
}

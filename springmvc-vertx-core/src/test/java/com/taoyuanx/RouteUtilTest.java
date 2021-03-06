package com.taoyuanx;

import com.taoyuanx.springmvc.vertx.core.util.RouteUtil;
import com.taoyuanx.springmvc.vertx.core.util.StringUtil;
import com.taoyuanx.springmvc.vertx.core.util.TemplateUtil;
import io.vertx.core.Handler;
import io.vertx.ext.web.RoutingContext;
import org.junit.Test;

/**
 * @author dushitaoyuan
 * @date 2020/4/20
 */
public class RouteUtilTest {
    @Test
    public void routeTest() throws Exception {
        System.out.println(RouteUtil.calcRouteUrl("/api/", "/v1/", null, "/v3", "v2/"));
        System.out.println(RouteUtil.calcRouteUrl("api", "v1","v222"));

    }

    @Test
    public void methodHandleTest() throws Throwable {
       // RouteUtil.getRouteMethodHandler(RouteUtilTest.class.getMethod("methodHandle"), new RouteUtilTest());

    }
    @Test
    public void templateTest() throws Throwable {
        String templateSuffix = TemplateUtil.templateSuffix("template/index.html");
        System.out.println(templateSuffix);
        System.out.println(TemplateUtil.templatePath("template/","index.html"));
    }
    public Handler<RoutingContext> methodHandle() {
        return ctx -> {
            System.err.println("woshi handle！");
            ctx.next();
        };
    }




}

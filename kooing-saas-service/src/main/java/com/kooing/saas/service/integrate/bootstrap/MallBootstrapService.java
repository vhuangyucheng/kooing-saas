package com.kooing.saas.service.integrate.bootstrap;

/**
 * @author : kooing
 * @date : 2017/10/26 - 9:46
 * @desription : 商城应用入口
 * @update by :
 */
public class MallBootstrapService {
    /** spring 配置名 **/
    protected final static String CONFIG_NAME = "classpath:spring/kooing-itgra-service-root.xml";

    /** dubbo项目名 **/
    protected final static String DUBBO_NAME = "itgra";

    public static void main(String[] args) throws Exception {
        DubboService bootstrap = new DubboService(CONFIG_NAME, DUBBO_NAME);
        bootstrap.startDubbo();

    }
}

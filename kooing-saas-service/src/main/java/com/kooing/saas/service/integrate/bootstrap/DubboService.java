package com.kooing.saas.service.integrate.bootstrap;

import com.google.common.util.concurrent.AbstractIdleService;
import com.kooing.framework.exception.ApplicationNameMap;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : kooing
 * @date : 2017/10/26 - 9:51
 * @desription :
 * @update by :
 */
@Slf4j
public class DubboService extends AbstractIdleService{

    /** spring配置名 如 "classpath:spring/tiger-demo-dubbo-service-root.xml**/
    protected String CONFIG_NAME = "";

    /** dubbo项目名 **/
    protected String DUBBO_NAME   = "";

    protected ClassPathXmlApplicationContext context  ;

    public DubboService( String configname , String dubboname){
        this.CONFIG_NAME  = configname;
        this.DUBBO_NAME = dubboname;
    }

    /**
     * @Author      : kooing
     * @Date        : 2017/10/26 10:05
     * @Desription  : 启动dubbo
     * @return      :
     */
    public void startDubbo(){
        context  = new ClassPathXmlApplicationContext(new String[] { CONFIG_NAME });
        this.startAsync();
        try {
            Object lock = new Object();
            synchronized (lock) {
                while (true) {
                    lock.wait();
                }
            }
        } catch (InterruptedException ex) {
            log.error("ignore interruption",ex);
        }
    }
    @Override
    protected void startUp() throws Exception {
        context.start();
        context.registerShutdownHook();
        log.info( "[" + DUBBO_NAME + " dubbo服务启动成功]" );
        ApplicationNameMap.put(DUBBO_NAME);
    }

    @Override
    protected void shutDown() throws Exception {
        context.stop();
        log.info("[" + DUBBO_NAME + " dubbo服务关闭成功]" );
    }
}

package com.example.lifecycles;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static com.example.lifecycles.ListenerBean.log2;

@Component
public class CyclerTester implements InitializingBean, DisposableBean {

    public CyclerTester() {
        log2.info("constructor of cycletester");
    }

    @Override
    public void destroy() throws Exception {
        log2.info("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log2.info("afterPropertiesSet");
    }

    @PostConstruct
    private void connectToIntegratedSystems() {
        log2.info("PostConstruct");
    }

    @PreDestroy
    private void closeConnectionToIntegratedSystems() {
        log2.info("PreDestroy");
    }
}

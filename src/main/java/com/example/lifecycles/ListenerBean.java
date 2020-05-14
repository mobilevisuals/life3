package com.example.lifecycles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class ListenerBean implements ApplicationListener<ContextRefreshedEvent> {

    static final Logger log2= LoggerFactory.getLogger(ListenerBean.class);


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        log2.info("contextRefreshedEvent");
    }
}

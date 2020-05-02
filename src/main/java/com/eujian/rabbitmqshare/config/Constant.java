package com.eujian.rabbitmqshare.config;

import java.util.Date;
import java.util.UUID;

public interface Constant {

    String QUEUE = "queue:"+UUID.randomUUID().toString();
    String ROUTING_KEY = "routingKey:"+new Date().getTime();
    String TOPIC = "topic";

    String REDIS_KEY = "redisKey:";
}

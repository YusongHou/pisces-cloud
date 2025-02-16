package com.besscroft.pisces.amqp.service;

/**
 * @Description
 * @Author Bess Croft
 * @Date 2022/9/4 12:38
 */
public interface PushService {

    /**
     * 推送消息到 bark
     * @param sendKey 发送密钥
     * @param message 消息内容
     * @return
     */
    String pushBark(String sendKey, String message);

    /**
     * 推送消息到 server 酱
     * @param sendKey 发送密钥
     * @param message 消息内容
     * @return
     */
    String pushServerChanSimple(String sendKey, String message);

}

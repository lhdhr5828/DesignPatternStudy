package patterns.observer;


import patterns.observer.observable.LeePullMQ;
import patterns.observer.observable.LeePushMQ;

import patterns.observer.observer.APullListener;
import patterns.observer.observer.BPullListener;
import patterns.observer.observer.CPushListener;
import patterns.observer.observer.DPushListener;
import patterns.observer.producer.MessageProducer;

/**
 * @Description: 由于jdk的observable类中使用的Vector存储的observer对象的，所以在发布消息时是先进后出，
 * 需要注意的是，observable类在jdk1.9中被标记了弃用
 * @author: Lee
 * @Date: 2019/11/19
 */
public class Main {


    public static void main(String[] args) {
        // 推的方式获取消息，有mq将消息推送给listener
        LeePushMQ leePushMQ = new LeePushMQ();
        CPushListener cPushListener = new CPushListener();
        DPushListener dPushListener = new DPushListener();
        MessageProducer messageProducer = new MessageProducer(leePushMQ);
        leePushMQ.addObserver(cPushListener);
        leePushMQ.addObserver(dPushListener);
        messageProducer.sendMessage("lee");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~分割线～～～～～～～～～～～～～～～～～");

        // 观察者拉的方式获取消息，listener获得mq通知后从mq拉取消息
        LeePullMQ leePullMQ = new LeePullMQ();
        APullListener aPullListener = new APullListener();
        BPullListener bPullListener = new BPullListener();
        messageProducer.setleeMQ(leePullMQ);
        leePullMQ.addObserver(aPullListener);
        leePullMQ.addObserver(bPullListener);
        messageProducer.sendMessage("heng ");


    }
}

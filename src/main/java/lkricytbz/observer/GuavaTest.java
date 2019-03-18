package lkricytbz.observer;

import com.google.common.eventbus.EventBus;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author lktbz
 * @Title: GuavaTest
 * @Description: TODO
 * @date 2019/3/18
 */
public class GuavaTest {
    public static void main(String[] args) {
        EventBus bus = new EventBus("lktbz");
        CreateEventer cevent=new Student("lkriss");
        Question question = cevent.create("我想知道mic 老师为啥叫骚麦");
        bus.register(new GPTeacher("TOM"));
        bus.register(new GPTeacher("大白"));
        bus.register(new GPTeacher("mic"));

        bus.post(new GPSocial("咕泡大家庭",question));
    }
}

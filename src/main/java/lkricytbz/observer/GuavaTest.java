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
        Question question = cevent.create("����֪��mic ��ʦΪɶ��ɧ��");
        bus.register(new GPTeacher("TOM"));
        bus.register(new GPTeacher("���"));
        bus.register(new GPTeacher("mic"));

        bus.post(new GPSocial("���ݴ��ͥ",question));
    }
}

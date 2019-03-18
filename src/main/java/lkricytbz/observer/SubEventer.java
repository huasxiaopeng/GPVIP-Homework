package lkricytbz.observer;

import com.google.common.eventbus.Subscribe;

/**
 * @author lktbz
 * @Title: SubEventer
 * @Description: TODO
 * @date 2019/3/18
 */
public interface SubEventer {
    @Subscribe
    void event(GPSocial gpSocial);
}

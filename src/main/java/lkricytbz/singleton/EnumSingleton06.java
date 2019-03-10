package lkricytbz.singleton;

/**
 * @author lktbz
 * @Title: EnumSingleton06
 * @Description:官方推荐写法，使用enum 方式,jdk 底层屏蔽了，通过反射，序列化的方式暴力创建对象方式
 * @date 2019/3/10
 */
public enum EnumSingleton06 {
    INSTANCE;
    public void Method(){};
}

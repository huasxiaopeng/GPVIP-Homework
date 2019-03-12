package lkricytbz.proxy.truework;

/**
 * @author lktbz
 * @Title: PersonBean
 * @Description:
 *        有一个Person类，其中属性字段有：姓名name、性别gender、兴趣interests、
 *        评分值hotOrNotRating，要求：get方法所有字段，对于所有该类实例拥有者或者非该类实例拥有者都有效，
 *        而该类实例拥有者除了不能给自己评分之外，可以修改所有的其他字段，
 *        而非该类实例拥有者只能设置该评分值，而不能修改其他所有的字段
 * @date 2019/3/12
 */
public interface PersonBean {
    String getName(); // 取得人的名字
    String getGender(); // 性别
    String getInterests(); // 兴趣
    int getHotOrNotRating(); // HotOrNot评分（1到10）

    void setName(String name);
    void setGender(String name);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);


}

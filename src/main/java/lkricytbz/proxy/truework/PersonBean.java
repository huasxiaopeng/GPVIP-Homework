package lkricytbz.proxy.truework;

/**
 * @author lktbz
 * @Title: PersonBean
 * @Description:
 *        ��һ��Person�࣬���������ֶ��У�����name���Ա�gender����Ȥinterests��
 *        ����ֵhotOrNotRating��Ҫ��get���������ֶΣ��������и���ʵ��ӵ���߻��߷Ǹ���ʵ��ӵ���߶���Ч��
 *        ������ʵ��ӵ���߳��˲��ܸ��Լ�����֮�⣬�����޸����е������ֶΣ�
 *        ���Ǹ���ʵ��ӵ����ֻ�����ø�����ֵ���������޸��������е��ֶ�
 * @date 2019/3/12
 */
public interface PersonBean {
    String getName(); // ȡ���˵�����
    String getGender(); // �Ա�
    String getInterests(); // ��Ȥ
    int getHotOrNotRating(); // HotOrNot���֣�1��10��

    void setName(String name);
    void setGender(String name);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);


}

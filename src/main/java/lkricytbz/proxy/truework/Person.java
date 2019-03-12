package lkricytbz.proxy.truework;

/**
 * @author lktbz
 * @Title: Person
 * @Description: TODO
 * @date 2019/3/12
 */
public class Person {
    private  String name;
    private String gender;
    private String interests;
    private int hotOrNotRating;//(1-10)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public int getHotOrNotRating() {
        return hotOrNotRating;
    }

    public void setHotOrNotRating(int hotOrNotRating) {
        this.hotOrNotRating = hotOrNotRating;
    }
}

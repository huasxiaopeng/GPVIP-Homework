package lkricytbz.prototype;

import java.util.Date;
import java.util.UUID;

/**
 * @author lktbz
 * @Title: Order
 * @Description: ������
 * @date 2019/3/11
 */
public class Order {
    private String id;
    private Date createTime;
    private String creator;
    private String type;
    public Order(String id, Date createTime, String creator,String type) {
        this.id = id;
        this.createTime = createTime;
        this.creator = creator;
        this.type=type;
    }


    @Override
    public Order clone() throws CloneNotSupportedException {
        return new Order(UUID.randomUUID().toString(),new Date(),this.creator,this.type);
    }

    @Override
    public String toString() {
        return "�������ͣ�"+this.getType()+"\n���ţ�"+this.getId()+"\n������:"+this.getCreator()+"\n����ʱ�䣺"+this.getCreateTime().toString()+"\n";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

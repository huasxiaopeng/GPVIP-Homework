package lkricytbz.adapterandtemplete.atemplate.course;

/**
 * @author lktbz
 * @Title: NetworkCourse
 * @Description: TODO
 * @date 2019/3/17
 */
public abstract class NetworkCourse {
  protected  final  void createCourse(){
      //1������Ԥϰ����
      this.postPreResouce();
      //2������PPT
      this.createPPT();
      //3������ֱ��
      this.liveVideo();
      //4���ύ�μ������ñʼ�
      this.postNote();
      //5���ύԴ��
      this.postSource();
      //6��������ҵ���е�����ҵ���е�û��
      if(needHomework()){
          checkHomework();
      }
    }

    abstract  void checkHomework();
    //���ӷ���
    protected boolean  needHomework() {
        return false;
    }
    final void postSource() {
        System.out.println("�ύԴ����");
    }
    final void postNote() {
        System.out.println("�ύ�μ������ñʼ�");
    }
    final void liveVideo() {
        System.out.println("����ֱ��");
    }
    final void createPPT() {
        System.out.println("�������ε�PPT");
    }
    final  void postPreResouce() {
        System.out.println("�ַ�Ԥϰ����");
    }


}

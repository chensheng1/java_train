package test4;

import java.util.Comparator;
//�Ƚ�����
public class CompareClass implements Comparator<Distance>{

  public int compare(Distance d1, Distance d2) {
      return d1.getDisatance()>d2.getDisatance()?20 : -1;  //d1����d2Ϊ�棬return 20    ��֮ return -1
  }

}

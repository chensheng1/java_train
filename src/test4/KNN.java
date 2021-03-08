package test4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 1������������֪�� 
 2������δ֪�� 
 3������������֪�㵽δ֪���ŷʽ���� 
 4�����ݾ����������֪������ 
 5��ѡ������δ֪�������k���� 
 6������k�������ڷ�����ֵ�Ƶ�� 
 7��ѡ��Ƶ���������Ϊδ֪������
 * 
 * @author fzj
 * 
 */
public class KNN {

    public static void main(String[] args) {
        
        // һ������������֪��
        List<Point> dataList = creatDataSet();
        // ��������δ֪��
        Point x = new Point(5, 1.2, 1.2);
        // ��������������֪�㵽δ֪���ŷʽ���룬�����ݾ����������֪������
        CompareClass compare = new CompareClass();
        Set<Distance> distanceSet = new TreeSet<Distance>(compare);
        for (Point point : dataList) {
            distanceSet.add(new Distance(point.getId(), x.getId(), oudistance(point,
                    x)));
        }
        // �ġ�ѡȡ�����k����
        double k = 5;
        
        /**
         * �塢����k�������ڷ�����ֵ�Ƶ��
         */
        // 1������ÿ�������������ĵ�ĸ���
        List<Distance> distanceList= new ArrayList<Distance>(distanceSet);
        Map<String, Integer> map = getNumberOfType(distanceList, dataList, k);
        
        // 2������Ƶ��
        Map<String, Double> p = computeP(map, k);
        
        x.setType(maxP(p));
        System.out.println("δ֪�������Ϊ��"+x.getType());
    }

    // ŷʽ�������
    public static double oudistance(Point point1, Point point2) {
        double temp = Math.pow(point1.getX() - point2.getX(), 2)
                + Math.pow(point1.getY() - point2.getY(), 2);
        return Math.sqrt(temp);
    }

    // �ҳ����Ƶ��
    public static String maxP(Map<String, Double> map) {
        String key = null;
        double value = 0.0;
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue() > value) {
                key = entry.getKey();
                value = entry.getValue();
            }
        }
        return key;
    }

    // ����Ƶ��
    public static Map<String, Double> computeP(Map<String, Integer> map,
            double k) {
        Map<String, Double> p = new HashMap<String, Double>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            p.put(entry.getKey(), entry.getValue() / k);
        }
        return p;
    }

    // ����ÿ����������ĵ�ĸ���
    public static Map<String, Integer> getNumberOfType(
            List<Distance> listDistance, List<Point> listPoint, double k) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        int i = 0;
        System.out.println("ѡȡ��k���㣬�ɽ���Զ����Ϊ��");
        for (Distance distance : listDistance) {
            System.out.println("idΪ" + distance.getId() + ",����Ϊ��"
                    + distance.getDisatance());
            long id = distance.getId();
            // ͨ��id�ҵ���������,���洢��HashMap��
            for (Point point : listPoint) {
                if (point.getId() == id) {
                    if (map.get(point.getType()) != null)
                        map.put(point.getType(), map.get(point.getType()) + 1);
                    else {
                        map.put(point.getType(), 1);
                    }
                }
            }
            i++;
            if (i >= k)
                break;
        }
        return map;
    }
    
    public static ArrayList<Point> creatDataSet(){
        
        Point point1 = new Point(1, 1.0, 1.1, "A");
        Point point2 = new Point(2, 1.0, 1.0, "A");
        Point point3 = new Point(3, 1.0, 1.2, "A");
        Point point4 = new Point(4, 0, 0, "B");
        Point point5 = new Point(5, 0, 0.1, "B");
        Point point6 = new Point(6, 0, 0.2, "B");
        
        ArrayList<Point> dataList = new ArrayList<Point>();
        dataList.add(point1);
        dataList.add(point2);
        dataList.add(point3);
        dataList.add(point4);
        dataList.add(point5);
        dataList.add(point6);
        
        return dataList;
    }
}

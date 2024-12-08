import java.util.Comparator;

// 实现 Comparator 接口，定义如何比较 Visitor 对象
public class VisitorComparator implements Comparator<Visitor> {

    @Override
    public int compare(Visitor visitor1, Visitor visitor2) {
        // 首先根据积分进行比较
        int pointsComparison = Integer.compare(visitor1.getPoints(), visitor2.getPoints());

        // 如果积分相同，进一步根据年龄进行比较
        if (pointsComparison == 0) {
            int ageComparison = Integer.compare(visitor1.getAge(), visitor2.getAge());
            
            // 如果年龄相同，最后根据是否拥有快速通道进行比较
            if (ageComparison == 0) {
                return Boolean.compare(visitor2.hasFastTrack(), visitor1.hasFastTrack());  // 快速通道优先
            }

            return ageComparison;
        }

        // 返回根据积分比较的结果
        return pointsComparison;
    }
}

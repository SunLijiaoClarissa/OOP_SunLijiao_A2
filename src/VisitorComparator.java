import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {

    @Override
    public int compare(Visitor visitor1, Visitor visitor2) {
        // 首先根据积分（points）进行比较
        int pointsComparison = Integer.compare(visitor1.getPoints(), visitor2.getPoints());

        // 如果积分相同，进一步根据年龄（age）进行比较
        if (pointsComparison == 0) {
            return Integer.compare(visitor1.getAge(), visitor2.getAge());
        }

        // 返回根据积分比较的结果
        return pointsComparison;
    }
}

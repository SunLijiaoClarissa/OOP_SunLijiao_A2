public interface RideInterface {
    void addVisitorToQueue(Visitor visitor);  // 将访客添加到队列中
    void removeVisitorFromQueue(Visitor visitor);  // 从队列中移除访客
    void printQueue();  // 打印队列
    void runOneCycle();  // 执行一次游乐设施操作
    void addVisitorToHistory(Visitor visitor);  // 将访客添加到游乐历史中
    void checkVisitorFromHistory(Visitor visitor);  // 检查访客是否在游乐历史中
    void numberOfVisitors();  // 获取游乐历史中的访客数量
    void printRideHistory();  // 打印游乐历史
}


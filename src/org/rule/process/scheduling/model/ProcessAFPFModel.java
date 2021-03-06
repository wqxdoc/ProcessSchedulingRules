package org.rule.process.scheduling.model;

/**
 * 模拟抢占式优先权算法(绝对优先权)进程对象
 * Created by Naga on 2015/11/20.
 * Blog : http://blog.csdn.net/lemon_tree12138
 */
public class ProcessAFPFModel extends ProcessModel {

    private long comingTime; // 到达时间
    private int priority; // 进程优先级
    private long startRunTime; // 开始执行时间
    private long freeTime; // 剩余时间(针对中间被中断过的进程而言)
    private long finishTime; // 完成时间
    private long turnaroundTime; // 周转时间
    private double turnaroundWeightTime; // 带权周转时间

    public ProcessAFPFModel(String processId, long runTime, long comingTime, int priority) {
        this.processId = processId;
        this.runTime = runTime;
        this.comingTime = comingTime;
        this.freeTime = this.runTime;
        this.priority = priority;
    }

    public long getComingTime() {
        return comingTime;
    }

    public void setComingTime(long comingTime) {
        this.comingTime = comingTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public long getStartRunTime() {
        return startRunTime;
    }

    public void setStartRunTime(long startRunTime) {
        this.startRunTime = startRunTime;
    }

    public long getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(long freeTime) {
        this.freeTime = freeTime;
    }

    public void reduceSelfFreeTime() {
        this.freeTime--;
    }

    public long getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(long finishTime) {
        this.finishTime = finishTime;
    }

    public long getTurnaroundTime() {
        return turnaroundTime;
    }

    public void setTurnaroundTime(long turnaroundTime) {
        this.turnaroundTime = turnaroundTime;
    }

    public double getTurnaroundWeightTime() {
        return turnaroundWeightTime;
    }

    public void setTurnaroundWeightTime(double turnaroundWeightTime) {
        this.turnaroundWeightTime = turnaroundWeightTime;
    }
}

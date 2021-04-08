package zlj.study.juc.blockququea.delay;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author zoulinjun
 * @title: DelayData
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/9 17:23
 */
public class DelayData implements Delayed {

    private int id;
    private String name;
    //数据到期时间
    private long endTime;
    private TimeUnit timeUnit = TimeUnit.MILLISECONDS;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public DelayData(int id, String name, long endTime) {
        this.id = id;
        this.name = name;
        //需要把传入的时间endTime 加上当前系统时间，作为数据的到期时间
        this.endTime = endTime + System.currentTimeMillis();
    }

    public DelayData() {
    }

    public long getDelay(TimeUnit unit) {
        return this.endTime - System.currentTimeMillis();
    }

    @Override
    public int compareTo(Delayed o) {
        return o.getDelay(this.timeUnit) - this.getDelay(this.timeUnit) < 0 ? 1: -1;
    }



}

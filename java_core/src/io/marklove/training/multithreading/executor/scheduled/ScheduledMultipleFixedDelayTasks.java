package io.marklove.training.multithreading.executor.scheduled;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledMultipleFixedDelayTasks {
    public static void main (String[] args) throws InterruptedException {
        // equivalent to Executors.newScheduledThreadPool(2)
        ScheduledExecutorService service = new ScheduledThreadPoolExecutor(2);

        service.scheduleWithFixedDelay(new MyTask("Task 1"), 500, 1000, TimeUnit.MILLISECONDS);
        service.scheduleWithFixedDelay(new MyTask("Task 2"), 500, 1000, TimeUnit.MILLISECONDS);

        PoolUtil.showPoolDetails((ThreadPoolExecutor) service, "For each task" +
                " initial delay: 500 ms," +
                " delay period: 1000 ms," +
                " repeat policy: fixed-delay");

        TimeUnit.SECONDS.sleep(10);
        service.shutdown();
    }
}

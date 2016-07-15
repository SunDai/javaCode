package quartz;

import org.quartz.*;

import java.util.Iterator;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.*;
import static org.quartz.SimpleScheduleBuilder.*;

/**
 * Created by xh on 2016/2/22.
 */
public class Sample {

    SchedulerFactory schedFact = new org.quartz.impl.StdSchedulerFactory();
    Scheduler sched;

    JobDetail job = newJob(HelloJob.class)
            .withIdentity("job1", "group1")
            .build();

    JobDetail job2 = newJob(HelloJob.class)
            .withIdentity("job2", "group6")
            .build();


    Trigger trigger = newTrigger().withIdentity("trigger1","group1").startNow().withSchedule(simpleSchedule().withIntervalInSeconds(5).repeatForever()).build();

    CronTrigger trigger1 = newTrigger().withIdentity("trigger2").withSchedule(cronSchedule("*/25 * * * * ?")).build();

    public Sample() throws SchedulerException {
        sched = schedFact.getScheduler();
        sched.start();
        sched.scheduleJob(job, trigger1);
        sched.scheduleJob(job2,trigger);
    }

    public void stop() throws SchedulerException {
        sched.shutdown();
    }

    public static void main(String[] args) throws SchedulerException, InterruptedException {
        Sample s = new Sample();
        Thread.sleep(50000);
        s.sched.standby();
        Iterator<JobExecutionContext> iterator = s.sched.getCurrentlyExecutingJobs().iterator();
        while (iterator.hasNext()){
            JobExecutionContext context = iterator.next();
            JobKey key = context.getJobDetail().getKey();
            System.out.println(" JobKey is "+key);
        }
        System.out.println("============ shutdown===========");
        s.stop();
//
//        Thread.sleep(50000);
//        s.sched.pauseJob(new JobKey("job2","group6"));
//
//        Iterator<JobExecutionContext> iterator2 = s.sched.getCurrentlyExecutingJobs().iterator();
//        while (iterator2.hasNext()){
//            JobExecutionContext context = iterator2.next();
//            JobKey key = context.getJobDetail().getKey();
//            System.out.println(" JobKey is "+key);
//        }
//        s.sched.standby();
//        System.out.println("lalalalla");
//        Thread.sleep(10000);
//        s.sched.start();
    }

}

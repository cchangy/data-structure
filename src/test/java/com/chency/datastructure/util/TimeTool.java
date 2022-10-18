package com.chency.datastructure.util;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date 2021/06/06 13:37
 */
@Slf4j
public class TimeTool {

    private static final SimpleDateFormat FMT = new SimpleDateFormat("HH:mm:ss.SSS");

    private TimeTool() {
    }

    /**
     * 测试程序执行时长
     *
     * @param title
     * @param task
     */
    public static void run(String title, Task task) {
        if (task == null) {
            return;
        }

        title = title == null ? "" : "【" + title + "】";
        log.info("------------------------------");
        log.info("thread name：{}", title);
        log.info("begin time：{}", FMT.format(new Date()));
        long beginTime = System.currentTimeMillis();
        task.execute();
        long endTime = System.currentTimeMillis();
        log.info("end time：{}", FMT.format(new Date()));
        log.info("spend time：{}", (endTime - beginTime) / 1000 + "s");
        log.info("------------------------------");
    }
}

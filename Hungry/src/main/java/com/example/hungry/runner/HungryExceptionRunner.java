package com.example.hungry.runner;

import com.example.hungry.exception.HungryException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Component
public class HungryExceptionRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) {
        //  获取当前日期
        LocalDate today = LocalDate.now();

        //  判断今天是否为星期四
        if (today.getDayOfWeek() == DayOfWeek.THURSDAY) {
            try {
                // 项目刚启动时触发异常，不会影响项目后续运行
                throw new HungryException(500, "KFC Crazy Thursday need 50RMB.");
            } catch (HungryException e) {
                // 捕获异常并记录日志，确保不影响项目运行
                e.printStackTrace();    //  控制台打印大片堆异常信息
//                System.err.println("KFC HungryException on Thursday:" + e.getMessage());
            }
        }
    }
}

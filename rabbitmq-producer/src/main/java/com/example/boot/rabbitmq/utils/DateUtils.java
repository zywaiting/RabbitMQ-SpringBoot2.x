package com.example.boot.rabbitmq.utils;

import java.util.Date;

public class DateUtils {

    public static Date addMinutes(Date orderTime, int orderTimeout) {
        Date afterDate = new Date(orderTime.getTime() + 60000 * orderTimeout);
        return afterDate;
    }

}

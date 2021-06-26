package com.onemount.onefast.utils;

import com.onemount.onefast.constants.Constants;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtils {

    public static String formatDateTimeToString(String datetime) {
        LocalDateTime localDateTime = LocalDateTime.parse(datetime, DateTimeFormatter.ofPattern(Constants.DATETIME_FORMAT));
        return localDateTime.toString();
    }
}

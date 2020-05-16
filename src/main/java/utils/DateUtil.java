package utils;

import java.time.LocalDateTime;
import java.util.Date;

public class DateUtil {

    public static String getDateAsString(LocalDateTime date) {
        return date.getDayOfMonth() + "_" + date.getMonthValue() + "_" + date.getYear();
    }
}

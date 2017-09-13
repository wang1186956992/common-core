package common.tool;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2017/1/2.
 */
public class DateTool {

    /**
     * 获取年
     * @param dateTime
     * @return
     */
    public static Integer getYearFromDate(Long dateTime){
        Calendar calendar=Calendar.getInstance();
        Date date=new Date(dateTime);
        calendar.setTime(date);
       return  calendar.get(Calendar.YEAR);

    }

    /**
     * 获取月
     * @param dateTime
     * @return
     */
    public static Integer getMonthFromDate(Long dateTime){
        Calendar calendar=Calendar.getInstance();
        Date date=new Date(dateTime);
        calendar.setTime(date);
        return  calendar.get(Calendar.MONTH)+1;
    }

    /**
     * 获取日
     * @param dateTime
     * @return
     */
    public static Integer getDayFromDate(Long dateTime){
        Calendar calendar=Calendar.getInstance();
        Date date=new Date(dateTime);
        calendar.setTime(date);
        return  calendar.get(Calendar.DAY_OF_MONTH);
    }




    /**
     * 是否是指定日期
     *
     * @param date
     * @param day
     * @return
     */
    public static boolean isTheDay(final Date date, final Date day) {
        return date.getTime() >= DateTool.dayBegin(day).getTime()
                && date.getTime() <= DateTool.dayEnd(day).getTime();
    }
    /**
     * 获取指定时间的那天 00:00:00.000 的时间
     *
     * @param date
     * @return
     */
    public static Date dayBegin(final Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }
    /**
     * 获取指定时间的那天 23:59:59.999 的时间
     *
     * @param date
     * @return
     */
    public static Date dayEnd(final Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 59);
        c.set(Calendar.SECOND, 59);
        c.set(Calendar.MILLISECOND, 999);
        return c.getTime();
    }



}

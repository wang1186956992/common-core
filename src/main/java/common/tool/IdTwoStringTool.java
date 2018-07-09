package common.tool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2016/7/30.
 */
public final class IdTwoStringTool {


    /**
     * 传入list集合 获得排序后的ids字符串
     * @param ids
     * @return
     */
    public static String ids2StringSort(List<Long> ids){
        Collections.sort(ids);
        return ids2String(ids);
    }


    /**
     * 传入list集合 获得ids字符串
     * @param ids
     * @return
     */
    public static String ids2String(List<Long> ids) {
        StringBuilder sb=new StringBuilder(",");
        if (ids!=null){
            for (Object id : ids) {
                sb.append(id).append(",");
            }
        }
        return sb.toString();
    }


    /**
     * 传入idsStr 转list排序
     * @param idsStr
     * @return
     */
    public static List<Long> string2IdsSort(String idsStr){
        ArrayList<Long> list = string2Ids(idsStr);
        Collections.sort(list);
        return list;
    }

    /**
     * 传入idsStr 转list
     * @param idsStr
     * @return
     */
    public static ArrayList<Long> string2Ids(String idsStr) {
        ArrayList<Long> list = new ArrayList<>();
        if (idsStr!=null&&!idsStr.isEmpty()){
            String[] split = idsStr.split(",");
            for (String s : split) {
                try {
                    long l = Long.parseLong(s);
                    list.add(l);
                }catch (Exception e){

                }

            }

        }
        return list;
    }


    /**
     * sql like 查询字段排序
     * @param ids
     * @return
     */
    public static String sqlLikeSort(List<Long> ids){
        Collections.sort(ids);
        return sqlLike(ids);
    }


    /**
     * sql like 查询字段拼接
     * @param ids
     * @return
     */
    public static String sqlLike(List<Long> ids) {
        StringBuilder sb=new StringBuilder("%,");
        if (ids!=null){
            for (Object id : ids) {
                sb.append(id).append(",%");
            }
        }
        return sb.toString();
    }


}

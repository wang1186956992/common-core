package common.tool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2016/7/30.
 */
public class IdTwoStringTool {

    public static String ids2StringSort(List<Long> ids){
        Collections.sort(ids);
        return ids2String(ids);
    }

    public static String ids2String(List<Long> ids) {
        StringBuilder sb=new StringBuilder(",");
        if (ids!=null){
            for (Object id : ids) {
                sb.append(id).append(",");
            }
        }
        return sb.toString();
    }

    public static List<Long> string2IdsSort(String idsStr){
        ArrayList<Long> list = string2Ids(idsStr);
        Collections.sort(list);
        return list;
    }

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

    public static String sqlLikeSort(List<Long> ids){
        Collections.sort(ids);
        return sqlLike(ids);
    }

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

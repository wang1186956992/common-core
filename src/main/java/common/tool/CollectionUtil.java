package common.tool;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;

import java.util.Collection;
import java.util.Map;

/**
 * 集合工具类
 * @author 11869
 */
public final class CollectionUtil {


    /**
     * 判断 collection 是否为空
     * @param collection
     * @return
     */
    public static boolean isEmpty(Collection<?> collection){
        return CollectionUtils.isEmpty(collection);
    }

    /**
     * 判断 collection 非空
     * @param collection
     * @return
     */
    public static boolean isNotEmpty(Collection<?> collection){
        return !isEmpty(collection);
    }

    /**
     * 判断 map 是否为空
     * @param map
     * @return
     */
    public static boolean isEmpty(Map<?,?> map){
        return MapUtils.isEmpty(map);
    }

    /**
     * 判断 map 非空
     * @param map
     * @return
     */
    public static boolean isNotEmpty(Map<?,?> map){
        return !isEmpty(map);
    }



}

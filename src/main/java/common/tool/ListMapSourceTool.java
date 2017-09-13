package common.tool;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/28.
 */
public class ListMapSourceTool<T> {

    public Map map = new HashMap<String,T>();

    public List list = new ArrayList<T>();

    public Map getMapData(){
        return map;
    }
    public ListMapSourceTool addMapData(String key, Object value){
        map.put(key,value);
        return this;
    }


    public List getListData(){
        return list;
    }
    public ListMapSourceTool addListData(Object value){
        list.add(value);
        return this;
    }



}

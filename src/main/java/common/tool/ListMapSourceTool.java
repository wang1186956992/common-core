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
        return this.map;
    }


    /**
     * 添加key-value值
     * @param key
     * @param value
     * @return
     */
    public ListMapSourceTool addMapData(String key, Object value){
        this.map.put(key,value);
        return this;
    }


    public List getListData(){
        return this.list;
    }

    /**
     * 添加list对象
     * @param value
     * @return
     */
    public ListMapSourceTool addListData(Object value){
        this.list.add(value);
        return this;
    }



}

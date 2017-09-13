package common.vo;



import common.page.Page;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/3.
 */
public class EntityTool {

    public static List<?> createEntityToVoList(Class<? extends EntityToVo> cs, List list){
        ArrayList<Object> rs = new ArrayList<>();
        for (Object o : list) {
            Object entityToVo = createEntityToVo(cs, o);
            rs.add(entityToVo);
        }
        return rs;

    }
    public static EntityToVo createEntityToVo(Class<? extends EntityToVo> cs,Object ...datas){
        try {
            EntityToVo entityToVo = cs.newInstance();
            entityToVo.loadData(datas);
            return entityToVo;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static Page<EntityToVo> getPageEntityToVo(Class<? extends EntityToVo> cs, Page<?> page){

        Page<EntityToVo> entityToVoPage = new Page<>();
        entityToVoPage.setTotal(page.getTotal());
        entityToVoPage.setPageCurrent(page.getPageCurrent());
        entityToVoPage.setPageSize(page.getPageSize());
        List list = createEntityToVoList(cs,page.getList());
        entityToVoPage.setList(list);
        return entityToVoPage;
    }


}

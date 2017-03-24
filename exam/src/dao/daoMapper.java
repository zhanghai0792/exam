package dao;

import java.util.List;


public interface daoMapper<T>{
	int deleteByPrimaryKey(Integer id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
    
    int deletes(List<Integer> ids);
    
    
    List<T> getBasicInfos();
    List<T> getDetailInfos();
}

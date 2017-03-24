package serviceDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.daoMapper;
import pojo.basicPojo;

public abstract class serviceDaoTemplate<P extends basicPojo,DAO extends daoMapper>{
	@Autowired
	DAO dao;

	public int insert(P pojo) throws Exception {
	 return	dao.insert(pojo);
	}

	public int deleteByPrimaryKey(Integer id) throws Exception {
	 return	dao.deleteByPrimaryKey(id);
	}

	public int insertSelective(P record) throws Exception {
		return dao.insertSelective(record);
	}

	public P selectByPrimaryKey(Integer id) throws Exception {
	 return (P) dao.selectByPrimaryKey(id);
	}

	public  int updateByPrimaryKeySelective(P record)throws Exception{
		return dao.updateByPrimaryKeySelective(record);
	};

	public int updateByPrimaryKey(P record) throws Exception {
		return dao.updateByPrimaryKey(record);
	}

	public List<P> getBasicInfos() throws Exception {
		return dao.getBasicInfos();
	}

	public List<P> getDetailInfos() throws Exception {
		return dao.getDetailInfos();
	}
}

package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import dao.daoMapper;
import json.jsonResult;
import pojo.basicPojo;
import serviceDao.serviceDaoTemplate;
import util.AppConfig;
import util.FileUtil;

public class actionTemplate<P extends basicPojo,S extends serviceDaoTemplate> {
	protected Logger logger;

	public actionTemplate() {
		super();
		if (logger == null) {
			logger = Logger.getLogger(this.getClass());
		}
	}

	@Autowired
	protected S serviceDao;

	/*获得对应所有pojo类的基本信息*/
	@RequestMapping("/get")
	@ResponseBody
	public jsonResult getBasic() throws Exception {
		try {
			List<P> datas = serviceDao.getBasicInfos();
			jsonResult json = new jsonResult("查询成功");
			if (datas != null && datas.size() > 0)
				json.add(datas);
			return json;
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw e;
		}
	}

	/*获得对应所有pojo类的所有信息*/
	@RequestMapping("/getDetails")
	@ResponseBody
	public jsonResult getDetails() throws Exception {
		try {
			List<P> datas = serviceDao.getDetailInfos();
			jsonResult json = new jsonResult("查询成功");
			if (datas != null && datas.size() > 0)
				json.add(datas);
			return json;
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw e;
		}
	}

	/*删除指定pojo实例*/
	@RequestMapping("/delete")
	@ResponseBody
	public jsonResult delete(P p) throws Exception {
		try {
			int size = -1;
			if (p != null && p.getId() != null) {
				size = serviceDao.deleteByPrimaryKey(p.getId());

				if (size > 0)
					return createMessageJsonResult(p, "删除");
			}
			return new jsonResult(false, "删除失败");
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw e;
		}
	}

	/*添加pojo实例*/
	@RequestMapping("/add")
	@ResponseBody
	public jsonResult save(P p) throws Exception {
		return insert(p, 0);
	}
    /*全部更新，如果该对象属性也为null，也更新为null*/
	@RequestMapping("/update")
	@ResponseBody
	public jsonResult update(P p) throws Exception {
		return update(p, 0);
	}
	/*更新pojo对象的非null属性*/
	@RequestMapping("/updateNoNull")
	@ResponseBody
	public jsonResult updateNoNull(P p) throws Exception {
		return update(p, 1);
	}

	//删除相对路径的文件或者目录
	protected boolean deleteFile(String relativeRootPath){
		File file=new File(AppConfig.RootPath+"/"+relativeRootPath);
		return FileUtil.delete(file);
	}
	
	//在指定目录（绝对路径）下以新的文件名保存文件
	protected boolean save(String foldAbsolutePath, String newName, MultipartFile mFile) throws Exception {
		try {
			if ((mFile != null) && (mFile.getInputStream() != null)) {
				FileUtil.saveFile(foldAbsolutePath, newName, mFile.getName(), mFile.getInputStream());
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			throw e;
		}
		return false;
	}

	//把多个pojo对象添加到json中
	jsonResult createMessageJsonResult(List<P> pojos, String msg) {
		jsonResult json;
		if (pojos != null && pojos.size() > 0) {
			json = new jsonResult(msg + "成功");
			json.add(pojos);
		} else {
			json = new jsonResult(false, msg + "失败");
		}
		return json;

	}
    //添加一个pojo对象到json中
	jsonResult createMessageJsonResult(P pojo, String msg) {
		jsonResult json;
		if (pojo != null) {
			json = new jsonResult(msg + "成功");
			json.getDatas().add(pojo);
		} else {
			json = new jsonResult(false, msg + "失败");
		}
		return json;

	}

	// type=0,用全值插入，type=1，用非空值插入
	public jsonResult insert(P p, int type) throws Exception {
		try {
			int size = -1;
			if (type == 0) {
				size = serviceDao.insert(p);
			} else {
				size = serviceDao.insertSelective(p);
			}
			if (size > 0)
				return createMessageJsonResult(p, "添加");
			return new jsonResult(false, "添加失败");
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw e;
		}
	}

	// type=0,用全值插入，type=1，用非空值插入
	public jsonResult update(P p, int type) throws Exception {
		try {
			int size = -1;
			if (type == 0) {
				size = serviceDao.updateByPrimaryKey(p);
			} else {
				size = serviceDao.updateByPrimaryKeySelective(p);
			}
			if (size > 0)
				return createMessageJsonResult(p, "更新");
			return new jsonResult(false, "更新失败");
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw e;
		}
	}
	
	
	
	public S getServiceDao() {
		return serviceDao;
	}

	public void setServiceDao(S serviceDao) {
		this.serviceDao = serviceDao;
	}

}

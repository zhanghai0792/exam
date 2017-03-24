package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.classInfo;
import serviceDao.classInfoServiceDao;

@Controller
@RequestMapping("/classInfo")
public class classInfoController extends actionTemplate<classInfo, classInfoServiceDao>{

}

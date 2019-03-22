package ${targetPackage}.service;

import cn.csatv.common.db.service.BaseService;
import ${targetPackage}.bean.${Entity};
import ${targetPackage}.dao.${Entity}Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ${comment}业务处理
 * @author ${author}
 * @create ${date}
 */

@Service
public class ${Entity}Service extends BaseService<${Entity}> {

    @Resource
    private ${Entity}Dao ${entity}Dao;


}

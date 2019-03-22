package ${targetPackage}.bean;

import cn.csatv.common.db.bean.IDEntity;
${tools.entityImports(${columns})}

public class ${Entity} extends IDEntity {

    ${tools.entityFields(${columns})}

}
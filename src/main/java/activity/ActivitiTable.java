package activity;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.jupiter.api.Test;

/**
 * @ClassName ActivitiTable
 * @Author yue
 * @Date 2018/9/3 : 10:13
 **/
public class ActivitiTable {
    @Test
    public void creatTable(){
        ProcessEngine processEngine = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("static/acitiviti.cfg.xml")
                .buildProcessEngine();
    }

}

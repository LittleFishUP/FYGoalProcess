package com.dxc.activitidemo.performanceprocess.config;

import java.util.ArrayList;
import java.util.List;

import com.dxc.activitidemo.performanceprocess.listener.MyProcessEventListener;
import org.activiti.engine.cfg.ProcessEngineConfigurator;
import org.activiti.engine.delegate.event.ActivitiEventListener;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



/**
 * springboot配置activiti全局监听器ActivitiEventListener
 *     
 * @author tang
 * 
 */
@Component
public class ActivitiEngineConfig implements ProcessEngineConfigurator {

	@Autowired
	protected MyProcessEventListener myActivitiEventListener;

	@Override
	public void configure(ProcessEngineConfigurationImpl processEngineConfiguration) {

	}

	@Override
	public void beforeInit(ProcessEngineConfigurationImpl processEngineConfiguration) {
		List<ActivitiEventListener> activitiEventListeners = new ArrayList<ActivitiEventListener>();
		activitiEventListeners.add(myActivitiEventListener);             // 配置全局监听器
		processEngineConfiguration.setEventListeners(activitiEventListeners);
	}

	@Override
	public int getPriority() {
		return 0;
	}

}

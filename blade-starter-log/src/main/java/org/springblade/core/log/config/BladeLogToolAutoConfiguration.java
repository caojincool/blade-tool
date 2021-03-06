/*
 *      Copyright (c) 2018-2028, Chill Zhuang All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the dreamlu.net developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: Chill 庄骞 (smallchill@163.com)
 */

package org.springblade.core.log.config;

import org.springblade.core.log.aspect.ApiLogAspect;
import org.springblade.core.log.logger.BladeLogger;

/**
 * 日志工具自动配置
 *
 * @author Chill
 */
//@Configuration
//@ConditionalOnWebApplication
public class BladeLogToolAutoConfiguration {

	//@Bean
	public ApiLogAspect apiLogAspect() {
		return new ApiLogAspect();
	}

	//@Bean
	public BladeLogger bladeLogger() {
		return new BladeLogger();
	}

	//	@Bean
//	@ConditionalOnMissingBean(name = "apiLogListener")
//	public ApiLogListener apiLogListener(ILogClient logService, ServerInfo serverInfo, BladeProperties bladeProperties) {
//		return new ApiLogListener(logService, serverInfo, bladeProperties);
//	}

	//	@Bean
//	@ConditionalOnMissingBean(name = "errorEventListener")
//	public ErrorLogListener errorEventListener(ILogClient logService, ServerInfo serverInfo, BladeProperties bladeProperties) {
//		return new ErrorLogListener(logService, serverInfo, bladeProperties);
//	}

	//	@Bean
//	@ConditionalOnMissingBean(name = "usualEventListener")
//	public UsualLogListener usualEventListener(ILogClient logService, ServerInfo serverInfo, BladeProperties bladeProperties) {
//		return new UsualLogListener(logService, serverInfo, bladeProperties);
//	}

}

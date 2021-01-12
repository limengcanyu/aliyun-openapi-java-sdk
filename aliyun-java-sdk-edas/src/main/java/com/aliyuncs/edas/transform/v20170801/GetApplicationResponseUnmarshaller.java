/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.GetApplicationResponse;
import com.aliyuncs.edas.model.v20170801.GetApplicationResponse.Applcation;
import com.aliyuncs.edas.model.v20170801.GetApplicationResponse.Application;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplicationResponseUnmarshaller {

	public static GetApplicationResponse unmarshall(GetApplicationResponse getApplicationResponse, UnmarshallerContext _ctx) {
		
		getApplicationResponse.setRequestId(_ctx.stringValue("GetApplicationResponse.RequestId"));
		getApplicationResponse.setCode(_ctx.integerValue("GetApplicationResponse.Code"));
		getApplicationResponse.setMessage(_ctx.stringValue("GetApplicationResponse.Message"));

		Applcation applcation = new Applcation();
		applcation.setAppId(_ctx.stringValue("GetApplicationResponse.Applcation.AppId"));
		applcation.setName(_ctx.stringValue("GetApplicationResponse.Applcation.Name"));
		applcation.setRegionId(_ctx.stringValue("GetApplicationResponse.Applcation.RegionId"));
		applcation.setDescription(_ctx.stringValue("GetApplicationResponse.Applcation.Description"));
		applcation.setOwner(_ctx.stringValue("GetApplicationResponse.Applcation.Owner"));
		applcation.setInstanceCount(_ctx.integerValue("GetApplicationResponse.Applcation.InstanceCount"));
		applcation.setRunningInstanceCount(_ctx.integerValue("GetApplicationResponse.Applcation.RunningInstanceCount"));
		applcation.setPort(_ctx.integerValue("GetApplicationResponse.Applcation.Port"));
		applcation.setUserId(_ctx.stringValue("GetApplicationResponse.Applcation.UserId"));
		applcation.setSlbId(_ctx.stringValue("GetApplicationResponse.Applcation.SlbId"));
		applcation.setSlbIp(_ctx.stringValue("GetApplicationResponse.Applcation.SlbIp"));
		applcation.setSlbPort(_ctx.integerValue("GetApplicationResponse.Applcation.SlbPort"));
		applcation.setExtSlbId(_ctx.stringValue("GetApplicationResponse.Applcation.ExtSlbId"));
		applcation.setExtSlbIp(_ctx.stringValue("GetApplicationResponse.Applcation.ExtSlbIp"));
		applcation.setSlbName(_ctx.stringValue("GetApplicationResponse.Applcation.SlbName"));
		applcation.setExtSlbName(_ctx.stringValue("GetApplicationResponse.Applcation.ExtSlbName"));
		applcation.setApplicationType(_ctx.stringValue("GetApplicationResponse.Applcation.ApplicationType"));
		applcation.setClusterType(_ctx.integerValue("GetApplicationResponse.Applcation.ClusterType"));
		applcation.setClusterId(_ctx.stringValue("GetApplicationResponse.Applcation.ClusterId"));
		applcation.setDockerize(_ctx.booleanValue("GetApplicationResponse.Applcation.Dockerize"));
		applcation.setCpu(_ctx.integerValue("GetApplicationResponse.Applcation.Cpu"));
		applcation.setMemory(_ctx.integerValue("GetApplicationResponse.Applcation.Memory"));
		applcation.setHealthCheckUrl(_ctx.stringValue("GetApplicationResponse.Applcation.HealthCheckUrl"));
		applcation.setBuildPackageId(_ctx.longValue("GetApplicationResponse.Applcation.BuildPackageId"));
		applcation.setCreateTime(_ctx.longValue("GetApplicationResponse.Applcation.CreateTime"));
		applcation.setNameSpace(_ctx.stringValue("GetApplicationResponse.Applcation.NameSpace"));
		applcation.setSlbInfo(_ctx.stringValue("GetApplicationResponse.Applcation.SlbInfo"));
		applcation.setEmail(_ctx.stringValue("GetApplicationResponse.Applcation.Email"));
		getApplicationResponse.setApplcation(applcation);

		Application application = new Application();
		application.setAppId(_ctx.stringValue("GetApplicationResponse.Application.AppId"));
		application.setName(_ctx.stringValue("GetApplicationResponse.Application.Name"));
		application.setRegionId(_ctx.stringValue("GetApplicationResponse.Application.RegionId"));
		application.setDescription(_ctx.stringValue("GetApplicationResponse.Application.Description"));
		application.setOwner(_ctx.stringValue("GetApplicationResponse.Application.Owner"));
		application.setInstanceCount(_ctx.integerValue("GetApplicationResponse.Application.InstanceCount"));
		application.setRunningInstanceCount(_ctx.integerValue("GetApplicationResponse.Application.RunningInstanceCount"));
		application.setPort(_ctx.integerValue("GetApplicationResponse.Application.Port"));
		application.setUserId(_ctx.stringValue("GetApplicationResponse.Application.UserId"));
		application.setSlbId(_ctx.stringValue("GetApplicationResponse.Application.SlbId"));
		application.setSlbIp(_ctx.stringValue("GetApplicationResponse.Application.SlbIp"));
		application.setSlbPort(_ctx.integerValue("GetApplicationResponse.Application.SlbPort"));
		application.setExtSlbId(_ctx.stringValue("GetApplicationResponse.Application.ExtSlbId"));
		application.setExtSlbIp(_ctx.stringValue("GetApplicationResponse.Application.ExtSlbIp"));
		application.setSlbName(_ctx.stringValue("GetApplicationResponse.Application.SlbName"));
		application.setExtSlbName(_ctx.stringValue("GetApplicationResponse.Application.ExtSlbName"));
		application.setApplicationType(_ctx.stringValue("GetApplicationResponse.Application.ApplicationType"));
		application.setClusterType(_ctx.stringValue("GetApplicationResponse.Application.ClusterType"));
		application.setClusterId(_ctx.stringValue("GetApplicationResponse.Application.ClusterId"));
		application.setDockerize(_ctx.booleanValue("GetApplicationResponse.Application.Dockerize"));
		application.setCpu(_ctx.integerValue("GetApplicationResponse.Application.Cpu"));
		application.setMemory(_ctx.integerValue("GetApplicationResponse.Application.Memory"));
		application.setHealthCheckUrl(_ctx.stringValue("GetApplicationResponse.Application.HealthCheckUrl"));
		application.setBuildPackageId(_ctx.longValue("GetApplicationResponse.Application.BuildPackageId"));
		application.setCreateTime(_ctx.longValue("GetApplicationResponse.Application.CreateTime"));
		application.setNameSpace(_ctx.stringValue("GetApplicationResponse.Application.NameSpace"));
		application.setSlbInfo(_ctx.stringValue("GetApplicationResponse.Application.SlbInfo"));
		application.setEmail(_ctx.stringValue("GetApplicationResponse.Application.Email"));
		getApplicationResponse.setApplication(application);
	 
	 	return getApplicationResponse;
	}
}
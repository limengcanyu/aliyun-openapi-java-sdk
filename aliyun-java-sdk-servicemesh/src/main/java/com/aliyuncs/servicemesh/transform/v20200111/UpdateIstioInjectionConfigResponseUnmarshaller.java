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

package com.aliyuncs.servicemesh.transform.v20200111;

import com.aliyuncs.servicemesh.model.v20200111.UpdateIstioInjectionConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateIstioInjectionConfigResponseUnmarshaller {

	public static UpdateIstioInjectionConfigResponse unmarshall(UpdateIstioInjectionConfigResponse updateIstioInjectionConfigResponse, UnmarshallerContext _ctx) {
		
		updateIstioInjectionConfigResponse.setRequestId(_ctx.stringValue("UpdateIstioInjectionConfigResponse.RequestId"));
	 
	 	return updateIstioInjectionConfigResponse;
	}
}
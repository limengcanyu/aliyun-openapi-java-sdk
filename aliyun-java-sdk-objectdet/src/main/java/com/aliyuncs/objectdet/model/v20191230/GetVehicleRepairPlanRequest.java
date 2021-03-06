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

package com.aliyuncs.objectdet.model.v20191230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.objectdet.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetVehicleRepairPlanRequest extends RpcAcsRequest<GetVehicleRepairPlanResponse> {
	   

	private String vinCodeImage;

	private String carNumberImage;

	private String taskId;
	public GetVehicleRepairPlanRequest() {
		super("objectdet", "2019-12-30", "GetVehicleRepairPlan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVinCodeImage() {
		return this.vinCodeImage;
	}

	public void setVinCodeImage(String vinCodeImage) {
		this.vinCodeImage = vinCodeImage;
		if(vinCodeImage != null){
			putBodyParameter("VinCodeImage", vinCodeImage);
		}
	}

	public String getCarNumberImage() {
		return this.carNumberImage;
	}

	public void setCarNumberImage(String carNumberImage) {
		this.carNumberImage = carNumberImage;
		if(carNumberImage != null){
			putBodyParameter("CarNumberImage", carNumberImage);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putBodyParameter("TaskId", taskId);
		}
	}

	@Override
	public Class<GetVehicleRepairPlanResponse> getResponseClass() {
		return GetVehicleRepairPlanResponse.class;
	}

}

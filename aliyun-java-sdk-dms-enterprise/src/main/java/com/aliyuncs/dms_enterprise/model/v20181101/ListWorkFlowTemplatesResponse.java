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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListWorkFlowTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListWorkFlowTemplatesResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private List<WorkFlowTemplate> workFlowTemplates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<WorkFlowTemplate> getWorkFlowTemplates() {
		return this.workFlowTemplates;
	}

	public void setWorkFlowTemplates(List<WorkFlowTemplate> workFlowTemplates) {
		this.workFlowTemplates = workFlowTemplates;
	}

	public static class WorkFlowTemplate {

		private String comment;

		private Long createUserId;

		private String templateName;

		private String enabled;

		private Integer isSystem;

		private Long templateId;

		private List<WorkflowNode> workflowNodes;

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public Long getCreateUserId() {
			return this.createUserId;
		}

		public void setCreateUserId(Long createUserId) {
			this.createUserId = createUserId;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getEnabled() {
			return this.enabled;
		}

		public void setEnabled(String enabled) {
			this.enabled = enabled;
		}

		public Integer getIsSystem() {
			return this.isSystem;
		}

		public void setIsSystem(Integer isSystem) {
			this.isSystem = isSystem;
		}

		public Long getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(Long templateId) {
			this.templateId = templateId;
		}

		public List<WorkflowNode> getWorkflowNodes() {
			return this.workflowNodes;
		}

		public void setWorkflowNodes(List<WorkflowNode> workflowNodes) {
			this.workflowNodes = workflowNodes;
		}

		public static class WorkflowNode {

			private String comment;

			private Integer position;

			private String nodeName;

			private String nodeType;

			private Long nodeId;

			private Long createUserId;

			private Long templateId;

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public Integer getPosition() {
				return this.position;
			}

			public void setPosition(Integer position) {
				this.position = position;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public String getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(String nodeType) {
				this.nodeType = nodeType;
			}

			public Long getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(Long nodeId) {
				this.nodeId = nodeId;
			}

			public Long getCreateUserId() {
				return this.createUserId;
			}

			public void setCreateUserId(Long createUserId) {
				this.createUserId = createUserId;
			}

			public Long getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(Long templateId) {
				this.templateId = templateId;
			}
		}
	}

	@Override
	public ListWorkFlowTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListWorkFlowTemplatesResponseUnmarshaller.unmarshall(this, context);
	}
}

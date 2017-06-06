package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 审核规则
 *
 * @author auto create
 * @since 1.0, 2015-12-18 10:53:16
 */
public class AlipayItemAuditRule extends AlipayObject {

	private static final long serialVersionUID = 4749168258759141358L;

	/**
	 * 审核类型
	 */
	@ApiField("audit_type")
	private String auditType;

	/**
	 * true：需要审核、false：不需要审核，默认为不需要审核
	 */
	@ApiField("need_audit")
	private Boolean needAudit;

	public String getAuditType() {
		return this.auditType;
	}
	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public Boolean getNeedAudit() {
		return this.needAudit;
	}
	public void setNeedAudit(Boolean needAudit) {
		this.needAudit = needAudit;
	}

}

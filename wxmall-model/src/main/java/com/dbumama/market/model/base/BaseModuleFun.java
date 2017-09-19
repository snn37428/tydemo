package com.dbumama.market.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseModuleFun<M extends BaseModuleFun<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setModuleId(java.lang.Long moduleId) {
		set("module_id", moduleId);
	}

	public java.lang.Long getModuleId() {
		return get("module_id");
	}

	public void setModuleFunId(java.lang.Long moduleFunId) {
		set("module_fun_id", moduleFunId);
	}

	public java.lang.Long getModuleFunId() {
		return get("module_fun_id");
	}

	public void setFunName(java.lang.String funName) {
		set("fun_name", funName);
	}

	public java.lang.String getFunName() {
		return get("fun_name");
	}

	public void setFunUrl(java.lang.String funUrl) {
		set("fun_url", funUrl);
	}

	public java.lang.String getFunUrl() {
		return get("fun_url");
	}

	public void setActive(java.lang.Integer active) {
		set("active", active);
	}

	public java.lang.Integer getActive() {
		return get("active");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}

	public java.util.Date getCreated() {
		return get("created");
	}

	public void setUpdated(java.util.Date updated) {
		set("updated", updated);
	}

	public java.util.Date getUpdated() {
		return get("updated");
	}

}

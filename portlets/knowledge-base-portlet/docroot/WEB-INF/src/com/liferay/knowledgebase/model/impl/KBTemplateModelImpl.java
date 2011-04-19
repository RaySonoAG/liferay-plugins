/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.knowledgebase.model.impl;

import com.liferay.knowledgebase.model.KBTemplate;
import com.liferay.knowledgebase.model.KBTemplateModel;
import com.liferay.knowledgebase.model.KBTemplateSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the KBTemplate service. Represents a row in the &quot;KBTemplate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.knowledgebase.model.KBTemplateModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link KBTemplateImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KBTemplateImpl
 * @see com.liferay.knowledgebase.model.KBTemplate
 * @see com.liferay.knowledgebase.model.KBTemplateModel
 * @generated
 */
public class KBTemplateModelImpl extends BaseModelImpl<KBTemplate>
	implements KBTemplateModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a k b template model instance should use the {@link com.liferay.knowledgebase.model.KBTemplate} interface instead.
	 */
	public static final String TABLE_NAME = "KBTemplate";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "kbTemplateId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "title", Types.VARCHAR },
			{ "content", Types.CLOB },
			{ "engineType", Types.INTEGER },
			{ "cacheable", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table KBTemplate (uuid_ VARCHAR(75) null,kbTemplateId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,title STRING null,content TEXT null,engineType INTEGER,cacheable BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table KBTemplate";
	public static final String ORDER_BY_JPQL = " ORDER BY kbTemplate.modifiedDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY KBTemplate.modifiedDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.knowledgebase.model.KBTemplate"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.knowledgebase.model.KBTemplate"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static KBTemplate toModel(KBTemplateSoap soapModel) {
		KBTemplate model = new KBTemplateImpl();

		model.setUuid(soapModel.getUuid());
		model.setKbTemplateId(soapModel.getKbTemplateId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setTitle(soapModel.getTitle());
		model.setContent(soapModel.getContent());
		model.setEngineType(soapModel.getEngineType());
		model.setCacheable(soapModel.getCacheable());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<KBTemplate> toModels(KBTemplateSoap[] soapModels) {
		List<KBTemplate> models = new ArrayList<KBTemplate>(soapModels.length);

		for (KBTemplateSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public Class<?> getModelClass() {
		return KBTemplate.class;
	}

	public String getModelClassName() {
		return KBTemplate.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.knowledgebase.model.KBTemplate"));

	public KBTemplateModelImpl() {
	}

	public long getPrimaryKey() {
		return _kbTemplateId;
	}

	public void setPrimaryKey(long pk) {
		setKbTemplateId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_kbTemplateId);
	}

	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	public long getKbTemplateId() {
		return _kbTemplateId;
	}

	public void setKbTemplateId(long kbTemplateId) {
		_kbTemplateId = kbTemplateId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getContent() {
		if (_content == null) {
			return StringPool.BLANK;
		}
		else {
			return _content;
		}
	}

	public void setContent(String content) {
		_content = content;
	}

	public int getEngineType() {
		return _engineType;
	}

	public void setEngineType(int engineType) {
		_engineType = engineType;
	}

	public boolean getCacheable() {
		return _cacheable;
	}

	public boolean isCacheable() {
		return _cacheable;
	}

	public void setCacheable(boolean cacheable) {
		_cacheable = cacheable;
	}

	public KBTemplate toEscapedModel() {
		if (isEscapedModel()) {
			return (KBTemplate)this;
		}
		else {
			return (KBTemplate)Proxy.newProxyInstance(KBTemplate.class.getClassLoader(),
				new Class[] { KBTemplate.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					KBTemplate.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		KBTemplateImpl kbTemplateImpl = new KBTemplateImpl();

		kbTemplateImpl.setUuid(getUuid());
		kbTemplateImpl.setKbTemplateId(getKbTemplateId());
		kbTemplateImpl.setGroupId(getGroupId());
		kbTemplateImpl.setCompanyId(getCompanyId());
		kbTemplateImpl.setUserId(getUserId());
		kbTemplateImpl.setUserName(getUserName());
		kbTemplateImpl.setCreateDate(getCreateDate());
		kbTemplateImpl.setModifiedDate(getModifiedDate());
		kbTemplateImpl.setTitle(getTitle());
		kbTemplateImpl.setContent(getContent());
		kbTemplateImpl.setEngineType(getEngineType());
		kbTemplateImpl.setCacheable(getCacheable());

		kbTemplateImpl.resetOriginalValues();

		return kbTemplateImpl;
	}

	public int compareTo(KBTemplate kbTemplate) {
		int value = 0;

		value = DateUtil.compareTo(getModifiedDate(),
				kbTemplate.getModifiedDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		KBTemplate kbTemplate = null;

		try {
			kbTemplate = (KBTemplate)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = kbTemplate.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public void resetOriginalValues() {
		KBTemplateModelImpl kbTemplateModelImpl = this;

		kbTemplateModelImpl._originalUuid = kbTemplateModelImpl._uuid;

		kbTemplateModelImpl._originalGroupId = kbTemplateModelImpl._groupId;

		kbTemplateModelImpl._setOriginalGroupId = false;
	}

	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", kbTemplateId=");
		sb.append(getKbTemplateId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", engineType=");
		sb.append(getEngineType());
		sb.append(", cacheable=");
		sb.append(getCacheable());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.liferay.knowledgebase.model.KBTemplate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kbTemplateId</column-name><column-value><![CDATA[");
		sb.append(getKbTemplateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>engineType</column-name><column-value><![CDATA[");
		sb.append(getEngineType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cacheable</column-name><column-value><![CDATA[");
		sb.append(getCacheable());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private String _originalUuid;
	private long _kbTemplateId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _title;
	private String _content;
	private int _engineType;
	private boolean _cacheable;
	private transient ExpandoBridge _expandoBridge;
}
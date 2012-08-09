package org.smbarbour.mcu.util;

import java.util.ArrayList;
import java.util.List;

public class Module {
	private String name;
	private String url;
	private Boolean required;
	private Boolean inJar;
	private Boolean extract;
	private Boolean inRoot;
	private Boolean isDefault;
	private String md5;
	private String author;
	private String infoUrl;
	private List<ConfigFile> configs;
	
	public Module(String name, String url, Boolean required, Boolean inJar, Boolean extract, Boolean inRoot, Boolean isDefault, String md5, String author, String infoUrl, List<ConfigFile> configs)
	{
		this.name=name;
		this.url=url;
		this.required=required;
		this.inJar=inJar;
		this.isDefault=isDefault;
		this.setExtract(extract);
		this.setInRoot(inRoot);
		this.setMD5(md5);
		this.setAuthor(author);
		this.setInfoUrl(infoUrl);
		if(configs != null)
		{
			this.configs = configs;
		} else {
			this.configs = new ArrayList<ConfigFile>();
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getUrl()
	{
		return url;
	}
	
	public void setUrl(String url)
	{
		this.url=url;
	}
	
	public Boolean getRequired()
	{
		return required;
	}
	
	public void setRequired(Boolean required)
	{
		this.required=required;
	}
	
	public Boolean getInJar()
	{
		return inJar;
	}
	
	public void setInJar(Boolean inJar)
	{
		this.inJar=inJar;
	}

	public Boolean getExtract() {
		return extract;
	}

	public void setExtract(Boolean extract) {
		this.extract = extract;
	}

	public Boolean getInRoot() {
		return inRoot;
	}

	public void setInRoot(Boolean inRoot) {
		this.inRoot = inRoot;
	}
	
	public String getMD5() {
		return md5;
	}
	
	public void setMD5(String md5) {
		this.md5 = md5;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setInfoUrl(String infoUrl) {
		this.infoUrl = infoUrl;
	}
	
	public String getInfoUrl() {
		return infoUrl;
	}

	public List<ConfigFile> getConfigs()
	{
		return configs;
	}
	
	public void setConfigs(List<ConfigFile> configs)
	{
		this.configs = configs;
	}
}


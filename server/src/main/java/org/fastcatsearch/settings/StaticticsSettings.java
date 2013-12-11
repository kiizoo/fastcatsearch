package org.fastcatsearch.settings;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="statictics")
public class StaticticsSettings {
	private RealTimePopularKeywordConfig realTimePopularKeywordConfig;
	private PopularKeywordConfig popularKeywordConfig;
	private RelateKeywordConfig relateKeywordConfig;
	private String stopwords;
	
	private List<Category> categoryList;
	
	@XmlElement(name="realtime-popular-keyword")
	public RealTimePopularKeywordConfig getRealTimePopularKeywordConfig() {
		return realTimePopularKeywordConfig;
	}

	public void setRealTimePopularKeywordConfig(RealTimePopularKeywordConfig realTimePopularKeywordConfig) {
		this.realTimePopularKeywordConfig = realTimePopularKeywordConfig;
	}
	@XmlElement(name="popular-keyword")
	public PopularKeywordConfig getPopularKeywordConfig() {
		return popularKeywordConfig;
	}

	public void setPopularKeywordConfig(PopularKeywordConfig popularKeywordConfig) {
		this.popularKeywordConfig = popularKeywordConfig;
	}
	@XmlElement(name="relate-keyword")
	public RelateKeywordConfig getRelateKeywordConfig() {
		return relateKeywordConfig;
	}

	public void setRelateKeywordConfig(RelateKeywordConfig relateKeywordConfig) {
		this.relateKeywordConfig = relateKeywordConfig;
	}
	@XmlElement
	public String getStopwords() {
		return stopwords;
	}

	public void setStopwords(String stopwords) {
		this.stopwords = stopwords;
	}

	@XmlElementWrapper(name="category-list")
	@XmlElement(name="category")
	public List<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}

	@XmlType(propOrder = { "useRelateKeyword", "usePopularKeyword", "useRealTimePopularKeyword", "name", "id" })
	public static class Category {
		private String id;
		private String name;
		private Boolean useRealTimePopularKeyword;
		private Boolean usePopularKeyword;
		private Boolean useRelateKeyword;
		
		public Category(){
		}
		
		public Category(String id, String name, Boolean useRealTimePopularKeyword, Boolean usePopularKeyword, Boolean useRelateKeyword){
			this.id = id;
			this.name = name;
			this.useRealTimePopularKeyword = useRealTimePopularKeyword;
			this.usePopularKeyword = usePopularKeyword;
			this.useRelateKeyword = useRelateKeyword;
		}
		
		@XmlAttribute
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		@XmlAttribute
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@XmlAttribute
		public Boolean isUsePopularKeyword() {
			return usePopularKeyword;
		}
		public void setUsePopularKeyword(Boolean usePopularKeyword) {
			this.usePopularKeyword = usePopularKeyword;
		}
		@XmlAttribute
		public Boolean isUseRelateKeyword() {
			return useRelateKeyword;
		}
		public void setUseRelateKeyword(Boolean useRelateKeyword) {
			this.useRelateKeyword = useRelateKeyword;
		}
		@XmlAttribute
		public Boolean isUseRealTimePopularKeyword() {
			return useRealTimePopularKeyword;
		}
		public void setUseRealTimePopularKeyword(Boolean useRealTimePopularKeyword) {
			this.useRealTimePopularKeyword = useRealTimePopularKeyword;
		}
		
		@Override
		public String toString(){
			return "Category] " + id + " : " + name + " :  rt=" +useRealTimePopularKeyword + ", popular=" + usePopularKeyword + ", relate=" + useRelateKeyword;
		}
	}
	
	public static class RealTimePopularKeywordConfig {
		private int minimumHitCount;

		@XmlElement
		public Integer getMinimumHitCount() {
			return minimumHitCount;
		}

		public void setMinimumHitCount(int minimumHitCount) {
			this.minimumHitCount = minimumHitCount;
		}
	}
	public static class PopularKeywordConfig {
		private int minimumHitCount;

		@XmlElement
		public Integer getMinimumHitCount() {
			return minimumHitCount;
		}

		public void setMinimumHitCount(int minimumHitCount) {
			this.minimumHitCount = minimumHitCount;
		}
	}
	public static class RelateKeywordConfig {
		private int minimumHitCount;

		@XmlElement
		public Integer getMinimumHitCount() {
			return minimumHitCount;
		}

		public void setMinimumHitCount(int minimumHitCount) {
			this.minimumHitCount = minimumHitCount;
		}
	}
	
	
}

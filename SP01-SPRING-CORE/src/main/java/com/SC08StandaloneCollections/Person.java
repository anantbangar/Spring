package com.SC08StandaloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private List<String> friendsList;
	private Map<String,Integer> courseFeesMap;
	private Properties properties;
				
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Integer> getCourseFeesMap() {
		return courseFeesMap;
	}

	public void setCourseFeesMap(Map<String, Integer> courseFeesMap) {
		this.courseFeesMap = courseFeesMap;
	}

	public List<String> getFriendsList() {
		return friendsList;
	}

	public void setFriendsList(List<String> friendsList) {
		this.friendsList = friendsList;
	}

	@Override
	public String toString() {
		return "Person [friendsList=" + friendsList + ", courseFeesMap=" + courseFeesMap + ", properties=" + properties
				+ "]";
	}

}

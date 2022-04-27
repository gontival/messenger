package org.jlt12.ws.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.jlt12.ws.messenger.model.Message;
import org.jlt12.ws.messenger.model.Profile;

public class DatabaseClass {
	
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
	
	public static Map<String, Profile> getProfiles(){
		return profiles;
	}
}

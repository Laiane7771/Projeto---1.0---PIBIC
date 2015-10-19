package edu.ifg.formosa.main.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.RootPanel;


public class Eventif implements EntryPoint {
	
	public void onModuleLoad() {
		HandlerManager eventBus = new HandlerManager(null);
		AppController ac = new AppController(eventBus);
		ac.go(RootPanel.get("inicio"));
	
	}
}

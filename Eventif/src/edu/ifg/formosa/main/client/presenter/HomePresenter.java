package edu.ifg.formosa.main.client.presenter;


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.main.client.event.EntrarEvent;
import edu.ifg.formosa.main.client.view.HomeView;


public class HomePresenter implements Presenter{
	private HomeView homeView;
	 private final HandlerManager eventBus;

	public HomePresenter(HomeView homeView, HandlerManager eventBus ){
		this.homeView = homeView;
		this.eventBus = eventBus;	
	}

	public void bind(){
		
		homeView.getEntrar().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new EntrarEvent());
				
			}
		});
	
		
		homeView.getCertificado().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
	
		homeView.getPesquisarEvento().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
		
		homeView.getAreaData().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
		
		homeView.getBtnPesquisar().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
		homeView.getTabelaEvento().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				
				
			}
		});
	}

	public void go(HasWidgets container) {
		container.add(homeView.asWidget());
		bind();
	}



}

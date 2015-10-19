package edu.ifg.formosa.main.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.main.client.view.EscolhaModuloView;
import edu.ifg.formosa.main.client.view.LoginView;

public class EscolhaModuloPresenter implements Presenter{
	
	private EscolhaModuloView escModView;
	
	public EscolhaModuloPresenter(EscolhaModuloView escModView){
		this.escModView = escModView;
		
	}
	
	public void bind(){
		escModView.getlGerente().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				LoginView login = new LoginView();
				LoginPresenter lp = new LoginPresenter(login);
				
			}
		});
			
		
		escModView.getlCoordenador().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				LoginView login = new LoginView();
				LoginPresenter lp = new LoginPresenter(login);
				
			}
		});
		
		escModView.getlParticipante().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				LoginView login = new LoginView();
				LoginPresenter lp = new LoginPresenter(login);
				
			}
		});
		
		escModView.getBtnFechar().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				escModView.hide();
			}
		});
	}

	public void go(HasWidgets container) {
		bind();
	}
	
	
}

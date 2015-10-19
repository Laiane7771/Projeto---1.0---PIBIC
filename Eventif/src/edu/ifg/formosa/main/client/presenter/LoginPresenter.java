package edu.ifg.formosa.main.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.main.client.view.EscolhaModuloView;
import edu.ifg.formosa.main.client.view.LoginView;

public class LoginPresenter implements Presenter{
	
	private LoginView loginView;
	
	public LoginPresenter(LoginView loginView){
		this.loginView = loginView;
	}
	
	public void bind(){
		
		
		loginView.getbtnVoltar().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				loginView.hide();
				EscolhaModuloView emv = new EscolhaModuloView();
				EscolhaModuloPresenter emp = new EscolhaModuloPresenter(emv);				
				
			}
		});
		
		loginView.getBtnlogin().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				
				
			}
		});
		
		loginView.getBtnFechar().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				loginView.hide();
			}
		});
		
	}

	public void go(HasWidgets container) {
		bind();
	}
}

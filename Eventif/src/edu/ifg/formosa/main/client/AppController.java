package edu.ifg.formosa.main.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;
import edu.ifg.formosa.main.client.event.EntrarEvent;
import edu.ifg.formosa.main.client.event.EntrarEventHandler;
import edu.ifg.formosa.main.client.presenter.EscolhaModuloPresenter;
import edu.ifg.formosa.main.client.presenter.HomePresenter;
import edu.ifg.formosa.main.client.presenter.Presenter;
import edu.ifg.formosa.main.client.view.EscolhaModuloView;
import edu.ifg.formosa.main.client.view.HomeView;

public class AppController  implements Presenter, ValueChangeHandler<String>{

	private HasWidgets container;
	private final HandlerManager eventBus;

	public AppController(HandlerManager eventBus){ //construtor;
		this.eventBus = eventBus;
		bind();
	}

	private void bind(){ //métodos que executa eventos.
		History.addValueChangeHandler(this);


		eventBus.addHandler(EntrarEvent.TYPE,
				new EntrarEventHandler() {

			public void entrar(EntrarEvent event) {


				if ("home".equals(History.getToken())) {
					History.newItem("entrar");
				}
				else {
					History.fireCurrentHistoryState();
				}
			}
		});
	}

	public void onValueChange(ValueChangeEvent<String> event) {

		String token = event.getValue();
		if (token != null) {
			Presenter presenter = null;

			if(token.equals("entrar")){
				presenter = new EscolhaModuloPresenter(new EscolhaModuloView());
			}

			if (presenter != null) {
				presenter.go(container);
			}
		}
	}

	public void go(HasWidgets container) {

		GWT.log("go");

		this.container = container;

		Presenter presenter = new HomePresenter(new HomeView(), eventBus );
		presenter.go(container);
		
		//History.fireCurrentHistoryState();

		if ("".equals(History.getToken())) {
			History.newItem("home");
		}
		else {
			History.fireCurrentHistoryState();
		}
	}
}

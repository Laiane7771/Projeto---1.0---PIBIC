package edu.ifg.formosa.main.client.view;


import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class EscolhaModuloView extends DialogBox{
	
	private Label lGerente;
	private Label lCoordenador;
	private Label lParticipante;
	private Button btnFechar;
	private Label labePedro;
	
	public EscolhaModuloView(){
		
		
		this.setStyleName("dialogEscolheMod");
		HTML labelEscolha = new HTML("<h1>Escolha seu Módulo:</h1>");
		labelEscolha.addStyleName("labelEsc");
		

		VerticalPanel vpe = new VerticalPanel();
		vpe.setSize("627px", "354px");
		lGerente = new Label("Gerente");
		lGerente.addStyleName("labelGer");
		
		lCoordenador = new Label("Coordenador");
		lCoordenador.addStyleName("labelCoor");
		
		lParticipante = new Label("Participante");
		lParticipante.addStyleName("labelPar");
		
		btnFechar = new Button("x");
		btnFechar.setSize("30px","30px");
		btnFechar.setStyleName("botaoFechar");
		
		vpe.add(labelEscolha);
		vpe.add(lGerente);
		vpe.add(lCoordenador);
		vpe.add(lParticipante);
		vpe.add(btnFechar);
	
		this.setPopupPosition(300, 100);
		this.setAnimationEnabled(isGlassEnabled());
		this.add(vpe);
		this.setModal(true);
		this.show();
		
		
		
	}

	public Label getlGerente() {
		return lGerente;
	}

	public void setlGerente(Label lGerente) {
		this.lGerente = lGerente;
	}

	public Label getlCoordenador() {
		return lCoordenador;
	}

	public void setlCoordenador(Label lCoordenador) {
		this.lCoordenador = lCoordenador;
	}

	public Label getlParticipante() {
		return lParticipante;
	}

	public void setlParticipante(Label lParticipante) {
		this.lParticipante = lParticipante;
	}

	public Button getBtnFechar() {
		return btnFechar;
	}

	public void setBtnFechar(Button btnFechar) {
		this.btnFechar = btnFechar;
	}
	
	

}

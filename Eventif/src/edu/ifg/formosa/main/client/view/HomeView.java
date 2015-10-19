package edu.ifg.formosa.main.client.view;


import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HomeView extends Composite  {
	
	
	private Label comoFunciona;
	private Label certificado;
	private Label entrar;
	private Image logo;
	private FlexTable tabelaEvento;
	private Label pesquisarEvento;
	private TextBox areaData;
	private TextBox areaNomeEvento;
	private Label nome;
	private Label data;
	private Button btnPesquisar;
	private Button btnInscrever;


	
	public HomeView(){
		
		
		//Cabeçalho//
		HorizontalPanel hp = new HorizontalPanel();
		hp.setSize("729px", "463px");
		hp.setHeight("463px");
		hp.setStyleName("painel-header");
	
		//-------menu------------------------
		//-----------------------------------
		logo = new Image();
		logo.setUrl("../Images/Logo.png");
		logo.setStyleName("logoHome");
		comoFunciona = new Label("Como Funciona");
		comoFunciona.setStyleName("comoFunciona");
		comoFunciona.setSize("149px", "48px");
		
		certificado = new Label("Certificado");
		certificado.setStyleName("certificado");
		certificado.setSize("110px", "47px");
		entrar = new Label("Entrar");
		entrar.setStyleName("entrar");
		entrar.setSize("93px", "48px");
		
		Hyperlink como = new Hyperlink();
		como.setText("Como Funciona");
		como.setStyleName("linkComoFunciona");
		
		
		hp.add(logo);
		hp.add(comoFunciona);
		hp.add(certificado);
		hp.add(entrar);
		
		//---------------------------------------------
		//painel rotativo - corpo
		
		HorizontalPanel Hpc =  new HorizontalPanel();
		Hpc.setSize("1345px","461px");
		Hpc.setHeight("450px");
		Hpc.setStyleName("painelRotativo");
	   
		
		//---------------------------------------------
		//Como Funciona - corpo
		
		HorizontalPanel Hpf = new HorizontalPanel();
		Hpf.setSize("1345px", "600px");
		Hpf.setHeight("546px");
		Hpf.setStyleName("comoFuncionaSite");
		
		//tabela pesquisar eventos
		HorizontalPanel ht = new HorizontalPanel();
		ht.setSize("100%", "498px");
		ht.setStyleName("painel-tabela");
		
		pesquisarEvento = new Label("Pesquisar Evento");
		pesquisarEvento.setStyleName("labelPesquisarEvento");
		pesquisarEvento.setSize("500px", "39px");
		ht.add(pesquisarEvento);
		
		nome  = new Label("Nome");
		nome.setSize("100px", "39px");
		nome.setStyleName("labelNome");
		ht.add(nome);
		
		data = new Label("Data");
		data.setSize("100px", "39px");
		data.setStyleName("labelData");
		ht.add(data);
		
		areaData = new TextBox();
		areaData.setSize("230px", "30px");
		areaData.setStyleName("textfieldData");
		areaData.setText("dd/MM/AAAA");
		ht.add(areaData);
		
		areaNomeEvento = new TextBox();
		areaNomeEvento.setSize("463px","30px");
		areaNomeEvento.setStyleName("textfieldNomeEvento");
		ht.add(areaNomeEvento);
	   
		btnPesquisar = new Button("Pesquisar");
		btnPesquisar.setSize("100px", "31px");
		btnPesquisar.setStyleName("botao-pesquisar");
		ht.add(btnPesquisar);
		
		
		tabelaEvento = new FlexTable();
		tabelaEvento.setWidth("100%");
		tabelaEvento.getColumnFormatter().setWidth(0, "15px");
		tabelaEvento.getCellFormatter().addStyleName(0, 0, "listaEventos");
		tabelaEvento.getCellFormatter().setWidth(0, 0, "70%");
		tabelaEvento.getCellFormatter().setHeight(0, 0, "202px");
		tabelaEvento.getFlexCellFormatter().setVerticalAlignment(0, 0, DockPanel.ALIGN_TOP);
		
		btnInscrever = new Button("Inscrever-se");
		btnInscrever.setSize("100px", "31px");
		
		Hpf.add(como);
		ht.add(tabelaEvento);
		//-------------------------------------------------
		//---------------------Footer---------------------
		//-------------------------------------------------
		HorizontalPanel hop = new HorizontalPanel();
		hop.setSize("100%", "120px");
		hop.setStyleName("footer");
		
		//painel mae ------------------------------
		
		VerticalPanel vp = new VerticalPanel();
		initWidget(vp);
		vp.add(hp);
		vp.add(Hpc);
		vp.add(Hpf);
		vp.add(ht);
		vp.add(hop);
	
	}

	//getters e setters

	public Label getComoFunciona() {
		return comoFunciona;
	}

	public void setComoFunciona(Label comoFunciona) {
		this.comoFunciona = comoFunciona;
	}

	public Label getCertificado() {
		return certificado;
	}

	public void setCertificado(Label certificado) {
		this.certificado = certificado;
	}

	public Label getEntrar() {
		return entrar;
	}

	public void setEntrar(Label entrar) {
		this.entrar = entrar;
	}

	public Image getLogo() {
		return logo;
	}

	public void setLogo(Image logo) {
		this.logo = logo;
	}

	public FlexTable getTabelaEvento() {
		return tabelaEvento;
	}

	public void setTabelaEvento(FlexTable tabelaEvento) {
		this.tabelaEvento = tabelaEvento;
	}

	public Label getPesquisarEvento() {
		return pesquisarEvento;
	}

	public void setPesquisarEvento(Label pesquisarEvento) {
		this.pesquisarEvento = pesquisarEvento;
	}

	public TextBox getAreaData() {
		return areaData;
	}

	public void setAreaData(TextBox areaData) {
		this.areaData = areaData;
	}

	public TextBox getAreaNomeEvento() {
		return areaNomeEvento;
	}

	public void setAreaNomeEvento(TextBox areaNomeEvento) {
		this.areaNomeEvento = areaNomeEvento;
	}

	public Label getNome() {
		return nome;
	}

	public void setNome(Label nome) {
		this.nome = nome;
	}

	public Label getData() {
		return data;
	}

	public void setData(Label data) {
		this.data = data;
	}

	public Button getBtnPesquisar() {
		return btnPesquisar;
	}

	public void setBtnPesquisar(Button btnPesquisar) {
		this.btnPesquisar = btnPesquisar;
	}

	public Button getBtnInscrever() {
		return btnInscrever;
	}

	public void setBtnInscrever(Button btnInscrever) {
		this.btnInscrever = btnInscrever;
	}

	
	
	
	
}

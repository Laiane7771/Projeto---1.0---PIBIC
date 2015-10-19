package edu.ifg.formosa.main.client.view;


import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;


public class LoginView  extends DialogBox{
	
	private HTML html;
	private TextBox areaCpf;
	private PasswordTextBox areaSenha;
	private Button btnlogin;
	private Button btnVoltar;
	private Button btnFechar;
	
	public LoginView(){
		
		this.setStyleName("dialogLogin");
		VerticalPanel vp = new VerticalPanel();
		vp.setSize("800px", "483px");
		vp.setStyleName("dialogEscolheMod");
		
		html = new HTML("<h1>Login</h1>");
		html.setStyleName("labelLogin");
		
		areaCpf = new TextBox();
		areaCpf.setSize("289px", "39px");
		areaCpf.setStyleName("areaCpfEstilo");
		areaCpf.setText("CPF/MATRICULA");
		
		areaSenha = new PasswordTextBox();
		areaSenha.setSize("290px", "39px");
		areaSenha.setStyleName("areaSenhaEstilo");
		areaSenha.setText("Senha");
		
		btnlogin = new Button("Login");
		btnlogin.setSize("79px", "39px");
		btnlogin.setStyleName("botaoEntrar");
		
		btnVoltar = new Button("Voltar");
		btnVoltar.setSize("80px", "39px");
		btnVoltar.setStyleName("botaoVoltar");
		
		btnFechar = new Button("x");
		btnFechar.setSize("30px","30px");
		btnFechar.setStyleName("botaoFechar");
		
		vp.add(btnFechar);
		vp.add(html);
		vp.add(areaCpf);
		vp.add(areaSenha);
		vp.add(btnlogin);
		vp.add(btnVoltar);
		
		
		this.add(vp);
		this.show();
		this.setPopupPosition(300, 100);
		
		
	}

	public TextBox getAreaCpf() {
		return areaCpf;
	}

	public void setAreaCpf(TextBox areaCpf) {
		this.areaCpf = areaCpf;
	}

	public PasswordTextBox getAreaSenha() {
		return areaSenha;
	}

	public void setAreaSenha(PasswordTextBox areaSenha) {
		this.areaSenha = areaSenha;
	}

	public Button getBtnlogin() {
		return btnlogin;
	}

	public void setBtnlogin(Button btnlogin) {
		this.btnlogin = btnlogin;
	}

	public Button getbtnVoltar() {
		return btnVoltar;
	}

	public void setbtnVoltar(Button btnVoltar) {
		this.btnVoltar = btnVoltar;
	}

	public HTML getHtml() {
		return html;
	}

	public void setHtml(HTML html) {
		this.html = html;
	}

	public Button getBtnVoltar() {
		return btnVoltar;
	}

	public void setBtnVoltar(Button btnVoltar) {
		this.btnVoltar = btnVoltar;
	}

	public Button getBtnFechar() {
		return btnFechar;
	}

	public void setBtnFechar(Button btnFechar) {
		this.btnFechar = btnFechar;
	}

	


	

}

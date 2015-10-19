package edu.ifg.formosa.main.client.event;

import com.google.gwt.event.shared.GwtEvent.Type;

public class FazerLoginEvent {
	public static Type<FazerLoginEventHandler> TYPE = new Type<FazerLoginEventHandler>();

	public Type<FazerLoginEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(FazerLoginEventHandler handler){
		handler.onFazerLogin(this);
	}
}
	
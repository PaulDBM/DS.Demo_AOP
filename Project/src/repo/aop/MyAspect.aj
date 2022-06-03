package repo.aop;

import repo.classes.Messages;

public aspect MyAspect {
	
	public pointcut readMessagesCall() : call(public static void Messages.init());
	public pointcut readCall(): call(* Messages.read*());
	public pointcut execCall(int op): call(* Messages.exec*(int)) && args(op);
	
	before(): readMessagesCall() {
		Messages.initMessage();
	}
	after(): readMessagesCall() {
		Messages.finalMessage();
	}
		
	after(): readCall() {
		System.out.println("Procesando entrada de texto...");
	}
	
	before(int op): execCall(op) {
		if(op == 1) {
			System.out.print("Ingrese un mensaje: ");
		} else if (op == 2) {
			System.out.println("A continuación leerá un mensaje del desarrollador.");
		}
		return;
	}
	
}

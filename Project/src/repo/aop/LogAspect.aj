package repo.aop;

import repo.classes.Messages;

public aspect LogAspect {

	public pointcut showMessageCall(): call(boolean init());
	
	before(): showMessageCall() {
		Messages.writeMessage("Bienvenido al inicio de sesi�n.");
	}
	
	after(): showMessageCall() {
		Messages.writeMessage("Sesi�n iniciada correctamente.");
	}
}

package repo.aop;

import repo.classes.Messages;

public aspect LogAspect {

	public pointcut showMessageCall(): call(boolean init());
	
	before(): showMessageCall() {
		Messages.writeMessage("Bienvenido al inicio de sesión.");
	}
	
	after(): showMessageCall() {
		Messages.writeMessage("Sesión iniciada correctamente.");
	}
}

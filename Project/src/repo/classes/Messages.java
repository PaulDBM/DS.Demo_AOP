package repo.classes;

import java.util.Scanner;

public class Messages {
	
	private static final int EXIT = 0;
	private static Scanner input = new Scanner(System.in);
	
	public static void initMessage() {
		System.out.println("Bienvenido usuario");
	}
	
	public static void finalMessage() {
		System.out.println("Fin del programa");
	}
	
	public static void writeMessage(String msg) {
		System.out.println("***" + msg + "***");
	}
	
	public static String readNext() {
		String text = input.nextLine();
		return text;
	}
	
	public static void showMessagesFromDeveloper() {
		System.out.println("En este programa podrás observar de manera práctica cómo se implementan los aspectos");
	}
	
	public static void executeOption(int op) {
		if (op > 0) {
			switch (op) {
			case 1: {
				String msg = readNext();
				writeMessage(msg);
				break;
			}
			case 2: {
				showMessagesFromDeveloper();
				break;
			}
			default:
				System.out.println("¡Opción no implemetada!");
			}
		}
	}
	
	public static void init() {
		int selectedOption = EXIT;
		do {
			System.out.print("Ingrese una opción: ");
			String tmp = readNext();
			selectedOption = Integer.valueOf(tmp);
			executeOption(selectedOption);
		} while (selectedOption > EXIT);
		input.close();
	}
}

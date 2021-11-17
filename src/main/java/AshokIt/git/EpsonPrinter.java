package AshokIt.git;

public class EpsonPrinter implements IPrinter {
	public EpsonPrinter() {
		System.out.println("EpsonPrinter.EpsonPrinter()");
	}
	@Override
	public void print() {
		System.out.println("print the respit by using Epson Printer");

	}

}

package AshokIt.git;

public class Atm {
	private IPrinter print;
	public void setPrint(IPrinter print) {
		this.print=print;
	}
	public Atm() {
		System.out.println("Atm.Atm()");
	}
	public Atm(IPrinter print) {
		System.out.println("Atm.Atm()");
		this.print=print;
	}
	public String withdraw() {
		print.print();
		return "withdraw succssfull";
	}

}

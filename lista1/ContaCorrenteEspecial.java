package br.ufma.ecp.paradigmas.lista1;

public class ContaCorrenteEspecial extends ContaCorrente {
	
	private double taxa = 0.001;
	
	public ContaCorrenteEspecial(double saldo) {
		super(saldo);
	}
	
	@Override
	public void sacar(double s) {
		double desconto = 0;
		if (s > this.getSaldo()) {
			System.out.println("A conta não tem saldo suficiente!");
		}else if(s <= this.getSaldo()) {
			desconto = s + s*taxa;
			this.setSaldo(this.getSaldo() - desconto);
			System.out.println("Saque realizado!");
		}
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	

	

	
}

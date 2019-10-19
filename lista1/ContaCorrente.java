package br.ufma.ecp.paradigmas.lista1;

public class ContaCorrente {
	private double saldo;
	private double taxa = 0.005;
	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double v) {
		this.setSaldo(this.getSaldo() + v);
		System.out.println("Depósito realizado!");
	}
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
	public void saldo() {
		System.out.println("O saldo é: " + this.getSaldo());
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}

package poo3;

public class Cuenta {

	float saldo;
	int agencia;
	int numero;
	String titular;

	public void deposita(float valor) {
		this.saldo = this.saldo + valor;
	}


	public boolean saca(float valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}


	public boolean transfiere(float valor, Cuenta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

}
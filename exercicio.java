class Conta{

	protected double saldo;
	double limite;
	String titular;
	List<String> afiliados;

	public double getSaldo(){
		return this.saldo;	
	}
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa;
	}

	public void adicionarContaConjunta(String nome) {
		if (this.afiliados == null) {
			this.afiliados = new ArrayList<String>();
		}

		this.afiliados.add(nome);
	}
}

class ContaCorrente extends Conta{
	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa * 2;
	}
	
	public void deposita(double valor){
		this.saldo += valor - 0.10;
	}
}

class ContaPoupanca extends Conta{
	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa * 3;
	}
}

class exercicio{
	public static void main(String[] args){
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		c.atualiza(0.02);
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}
}
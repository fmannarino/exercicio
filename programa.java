class cliente {

	String nome;
	String sobrenome;
	String cpf;
	
	public void mudaCPF(String cpf){
	
		validaCPF(cpf);
		this.cpf = cpf;	
	}
	
	private void validaCPF(String cpf){
	
		
	}
}

class conta {
	
	double salario;
	int numero;
	//String dono;
	private double saldo;
	double limite;
	cliente titular;
	
	public double pegaSaldo(){

		return this.saldo;

	}
	
	/*void saca(double quantidade){
	
		//double novoSaldo = this.saldo - quantidade;
		//this.saldo = novoSaldo;
		this.saldo -= quantidade;
	
	}*/
	
	boolean transferePara(conta destino, double valor){
		
		boolean retira = this.saca(valor);
		
		if(retira == false){
		
			return false;
		}else{
			destino.deposito(valor);
			return true;
		//this.saldo = this.saldo - valor;
		//destino.saldo = destino.saldo += valor;
		
		}
	}	
	
	boolean saca(double valor){
	
		if(this.saldo < valor){
		
			return false;
		}else{
		
			this.saldo = this.saldo - valor;
			return true;
		
		}
	}
	
	void deposito(double quantidade){
	
		this.saldo += quantidade;
			
	
	}
	
}


	class programa{

		public static void main(String[] args){
		
			/*conta minhaConta;
			minhaConta = new conta();
			minhaConta.dono = "Duke";
			minhaConta.saldo = 1000.0;
			boolean consegui = minhaConta.saca(1000);
			
			if(consegui){
			
				System.out.println("Consegui sacar");
				
			}else{
			
				System.out.println("Nao consegui");
			
			}*/
			
			//System.out.println("Seu saldo é: " + minhaConta.saldo);
			/*System.out.println("Seu saldo é: " + minhaConta.saldo);
			minhaConta.deposito(200);
			System.out.println("Seu saldo é: " + minhaConta.saldo);*/
			
			//System.out.println("Seu saldo é: " + minhaConta.saldo);
		
		
			/*conta c1;
			c1 = new conta();
			c1.dono = "Duke";
			c1.saldo = 250;
			
			conta c2;
			c2 = new conta();
			c2.dono = "Duke";
			c2.saldo = 250;
			
			if(c1 == c2){
				
				System.out.println("Entrou");
			}else{
				System.out.println("Nao entrou");
			
			}*/
			
			
			//System.out.println(c1.saldo);
			//System.out.println(c2.saldo);
		
		
			/*conta minhaConta = new conta();
			
		
			cliente c = new cliente();
		
			minhaConta.titular = c;*/
		
			conta minhaConta = new conta();
			minhaConta.deposito(1000);
			System.out.println("Saldo: " + minhaConta.pegaSaldo());
		
		}

		
	}
		

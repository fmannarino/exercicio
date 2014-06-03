class Funcionario{

	protected String nome;
	String departamento;
	String local;
	protected double salario;
	String rg;
	String dataEntrada;
	boolean estaNaEmpresa;

	void recebeAumento(double valor){
		double salarioNovo = this.salario + valor;
		this.salario = salarioNovo;
	
	}
	double calculaGanhoAnual(){
		double salarioAnual = this.salario * 12;
	return salarioAnual;	
	}
	
	void mostra(){
	
		System.out.println("Nome: "+ this.nome);
		System.out.println("Departamento: "+ this.departamento);
		System.out.println("Local: "+ this.local);
		System.out.println("Salario Atual: "+ this.salario);
		System.out.println("Salario Anual: "+ this.calculaGanhoAnual());
		System.out.println("Rg: "+ this.rg);
		System.out.println("Data de entrada: "+ this.dataEntrada);
	}	
	
	public double getBonificacao(){
		return this.salario * 0.10;	
	}
}

class Gerente extends Funcionario {

	int senha;
	int numeroDeFuncionariosGerenciados;
	
	public boolean autentica(int senha){
		if(this.senha == senha){
			System.out.println("Acesso Permitido");
			return true;
		}else{
			System.out.println("Acesso Negado");
			return false;
		}
	}
	@Override
	public double getBonificacao(){
		return super.getBonificacao() + 1000;	
	}

}

class Diretor extends Gerente{




}

class Presidente extends Funcionario{


}
class Empresa{

	String nome;
	String cnpj;
	Funcionario[] empregados;
	
	
	void adiciona(Funcionario f){
		int n = 0;
		
		this.empregados[n++] = f;
	
	}
	
	void mostraEmpregados() {
	
		
		for (int i = 0; i < this.empregados.length; i++) {
			System.out.println("Funcionário na posição: " + i );
		}
	}
	
}

class ControleDeBonificacoes{

	private double totalDeBonificacoes = 0;
	
	public void registra(Funcionario funcionario){
		this.totalDeBonificacoes += funcionario.getBonificacao();	
	}
	
	public double getTotalDeBonificacoes(){
		return this.totalDeBonificacoes; 
	}

}

class TestaGerente {

	public static void main(String[] args){
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
	
		Gerente funcionario1 = new Gerente();
		funcionario1.salario = 5000;
		controle.registra(funcionario1);
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.salario = 1000;
		controle.registra(funcionario2);
		System.out.println(controle.getTotalDeBonificacoes());
	}
}
class TestaEmpresa{

	public static void main(String[] args){
	
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];
		for (int i = 0; i < 5; i++) {
			Funcionario f = new Funcionario();
			f.salario = 1000 + i * 100;
			empresa.adiciona(f);
		}
	}
}

class Funcionarioteste{

	public static void main(String[] args){
	
		/*Funcionario f1 = new Funcionario();
		f1.nome = "Felipe";
		f1.departamento = "TI";
		f1.local = "Centro";
		f1.salario = 900;
		f1.rg = "122.259.433.40";
		f1.dataEntrada = "23/05/2014";
		f1.estaNaEmpresa = true;
		
		f1.recebeAumento(100);
		
		f1.mostra();*/
		
		Funcionario f1 = new Funcionario();
		f1.nome = "Felipe";
		f1.departamento = "TI";
		f1.local = "Centro";
		f1.salario = 900;
		f1.rg = "122.259.433.40";
		f1.dataEntrada = "23/05/2014";
		f1.estaNaEmpresa = true;
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Felipe";
		f2.departamento = "TI";
		f2.local = "Centro";
		f2.salario = 900;
		f2.rg = "122.259.433.40";
		f2.dataEntrada = "23/05/2014";
		f2.estaNaEmpresa = true;
		
		if(f1 == f2){
		
			System.out.println("iguais");
		}else{
			System.out.println("diferentes");
		}
	}
}
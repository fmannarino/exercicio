class Motor{

	String tipo;
	int potencia;

}


class carro{

	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMax;
	Motor motor;
	
	//liga o carro
	void liga(){
		System.out.println("O carro esta ligado");
	}
	//desliga o carro
	void desliga(){
		System.out.println("O carro esta desligado");
	}
	//acelera uma certa quantidade
	void acelera(double quantidade){
	
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;	
	}
	
	//devolve marcha ao carro
	int pegaMarcha(){
	
		if(this.velocidadeAtual < 0){
			return -1;		
		}
		if(this.velocidadeAtual >= 0 && this.velocidadeAtual < 40){
			return 1;
		}
		if(this.velocidadeAtual >= 40 && this.velocidadeAtual < 80){
			return 2;		
		}
	return 3;
		
	}
}

class testecarro{

	public static void main(String[] args){

	carro meuCarro;
	meuCarro = new carro();
	meuCarro.cor = "Azul";
	meuCarro.modelo = "Fusca";
	meuCarro.velocidadeAtual = 0;
	meuCarro.velocidadeMax = 80;
	
	meuCarro.liga();
	
	meuCarro.acelera(20);

	System.out.println(meuCarro.velocidadeAtual);
	
	meuCarro.desliga();
	}

}
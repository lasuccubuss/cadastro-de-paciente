import java.util.Calendar;

public class Paciente {
   
   private String nome;
   private int anoDeNascimento;
   private double altura;
   private double peso;
   
   public void setNome(String nome){
	   this.nome = nome;
   }
   public void setAnoDeNascimento(int anoDeNascimento){
	   this.anoDeNascimento = anoDeNascimento;
   }
   public void setAltura(double altura){
	   this.altura = altura;
   }
   public void setPeso(double peso){
	   this.peso = peso;
   }
    
    public String getNome(){
		return nome;
	}
    public int getAnoDeNascimento(){
		return anoDeNascimento;
	}	

    public double getAltura(){
		return altura;
	}	

    public double getPeso(){
		return peso;
	}	
	
	public void imprimirIdade(){
		Calendar agora = Calendar.getInstance();
		
		int anoAtual = agora.get(Calendar.YEAR);
		int idade = anoAtual - getAnoDeNascimento();
		
		System.out.println("Idade do paciente: " + idade);
		
	}
	
	public double calcularIMC(){
		double calculoImc = getPeso() / (getAltura() * getAltura());
		
		return calculoImc;
	}
	
	public void imprimirSituacao(){
		
		double valorImc = calcularIMC();
		
		if(valorImc < 18.5){
			System.out.println("Abaixo do peso!");
		} else if(valorImc >= 18.5 && valorImc <= 24.9 ){
			System.out.println("Peso ideal!");
		}else if(valorImc >= 25.0 && valorImc <= 29.9){
			System.out.println("Sobrepeso!");
		} else if(valorImc >= 30.0 && valorImc <= 34.9){
			System.out.println("Obesidade grau 1!");
		}else if(valorImc >= 35.0 && valorImc <= 39.9){
			System.out.println("Obesidade grau 2!");
		}else if(valorImc >= 40.0){
			System.out.println("Obesidade grau 3!");
		}
	}
	
	public void imprimirDadosDoPaciente(){
		
		System.out.println("Nome do paciente: " +getNome());
        imprimirIdade();
		System.out.println("Altura do paciente: " +getAltura());
		System.out.println("Peso do paciente: " +getPeso());		
		
	}
}
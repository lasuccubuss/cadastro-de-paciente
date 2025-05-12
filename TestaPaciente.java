import java.util.Scanner;

public class TestaPaciente{
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Paciente paciente = new Paciente();
	
	System.out.println("Digite o nome do paciente: ");
	String nome = sc.nextLine();
	paciente.setNome(nome);
	System.out.println("Digite a idade do paciente: ");
	int anoDeNascimento = sc.nextInt();
	paciente.setAnoDeNascimento(anoDeNascimento);
	System.out.println("Digite a altura do paciente: ");
	double altura = sc.nextDouble();
	paciente.setAltura(altura);
	System.out.println("Digite o peso do paciente: ");
	double peso = sc.nextDouble();
	paciente.setPeso(peso);
	
	
	int opcao = -1;
		while(opcao != 0){
		
			System.out.println("1 - Mostrar idade");
			System.out.println("2 - Calcular IMC");
			System.out.println("3 - Mostrar situação");
			System.out.println("4 - Mostrar dados do paciente");
			System.out.println("0 - Sair");
						
			
			System.out.println("Opção digitada: " + opcao);
			
		   opcao = sc.nextInt();
			
			sc.nextLine();
			
			switch (opcao) {
        case 1:
		
		  
		    System.out.print("\nIdade do paciente ");
			paciente.imprimirIdade();
			
            break;
			
		case 2:
	
		System.out.println("\nIMC: " + paciente.calcularIMC());
		
		  break;
		
		case 3:
		
	   System.out.println("\nSituação do paciente: ");
	   paciente.imprimirSituacao();
	   
            break;
			
			
		case 4:
		
		System.out.println("\nDados do paciente: ");
	   paciente.imprimirDadosDoPaciente();
	   
	      break;
		
		}
		
	}
		sc.close();
  }
}
package java_anatomia_de_classes;

public class MinhaClasse {

	public static void main (String [] args) {
		System.out.println("Hello, World!!!");
		String meuNome = "Vitor";
		int anoFabricacao = 2020;
		boolean simNao = false;
		
		System.out.println(meuNome);
		System.out.println(anoFabricacao);
		System.out.println(simNao);
		
		anoFabricacao = 1991;
		System.out.println(anoFabricacao);
		
		String primeiroNome = "Vitor";
		String segundoNome = "Rolisola";
		
		String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
		
		System.out.println(nomeCompleto);
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
	}
}

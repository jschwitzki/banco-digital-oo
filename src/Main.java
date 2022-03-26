public class Main {

	public static void main(String[] args) {
		Cliente teste = new Cliente();
		teste.setNome("Teste");
		
		Conta cc = new ContaCorrente(teste);
		Conta cp = new ContaPoupanca(teste);
		
		cc.depositar(100);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}


public class Questão_8 {
    public static void main(String[] args) {
    	
        Gerente gerente = new Gerente();
        gerente.setNome("João da Silva");
        gerente.setIdade(35);
        gerente.setMatricula("1234");
        gerente.setSalario(5000.0);
        gerente.setNomeGerencia("Vendas");
        
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Maria Souza");
        vendedor.setIdade(25);
        vendedor.setMatricula("5678");
        vendedor.setSalario(2000.0);
        vendedor.setValorVendas(5000.0);
        vendedor.setQntVendas(10);
        
        Cliente cliente = new Cliente();
        cliente.setNome("José Santos");
        cliente.setIdade(40);
        cliente.setSexo("Masculino");
        cliente.setValorDivida(1500.0);
        cliente.setAnoNascim(1983);
        
        // Impressão dos dados dos objetos criados
        System.out.println("Dados do Gerente:");
        System.out.println(gerente.toString());
        System.out.println();
        
        System.out.println("Dados do Vendedor:");
        System.out.println(vendedor.toString());
        System.out.println();
        
        System.out.println("Dados do Cliente:");
        System.out.println(cliente.toString());
        System.out.println();
    }
}

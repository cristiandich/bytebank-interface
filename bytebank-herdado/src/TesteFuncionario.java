
public class TesteFuncionario {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();

		Gerente cristian = new Gerente();
		cristian.setNome("Cristian");
		cristian.setCpf("222.222.222-15");
		cristian.setSalario(2600.00);

		System.out.println(cristian.getNome());
		System.out.println(cristian.getBonificacao());

		// nico.salario = 300.0;

	}

}

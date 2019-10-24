package os.nota;

public class TestaFabrica {

	public static void main(String[] args) {
		
		System.out.println("=========== Resultados =========");

		Modelo modeloEntrada = new FabricaEntrada();
		System.out.println(modeloEntrada.getNotasFiscais());
		System.out.println(modeloEntrada.getOs());
		
		
		System.out.println("================================");
		
		
		Modelo modeloSaida = new FabricaSaida();
		System.out.println(modeloSaida.getNotasFiscais());
		System.out.println(modeloSaida.getOs());
		
	}
	
}

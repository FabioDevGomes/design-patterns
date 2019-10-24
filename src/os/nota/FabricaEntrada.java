package os.nota;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FabricaEntrada  implements Modelo{

	public List<NotaFiscal> getNotasFiscais() {
		List<NotaFiscal> lista = new ArrayList<NotaFiscal>(Arrays.asList(new NotaRecursosHumanos(), new NotaTecnologia()));
		return lista;
	}
	
	public OS getOs() {
		return new OSProducao();
	}

}

package os.nota;

import java.util.List;

public class FabricaSaida implements Modelo{

	public OS getOs() {
		return new OSTecnologia();
	}
	
	public List<NotaFiscal> getNotasFiscais() {
		return null;
	}
	
}

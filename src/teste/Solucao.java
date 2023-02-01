package teste;

public class Solucao {
	
	int qtdecaminhao = 1;
	double caminhaoCubico = 0;
	int qtdePapelHig = 0;
	int qtdeDetergente = 0;
	int qtdeLuva = 0;
	
	
	
	public Solucao() {
		int qtdeTotalpapelHigienico = 741;
		int qtdeTotaldetergente = 890;
		int qtdeTotalluva = 6000;
		boolean encheuCaminhao = true;
		
		while (qtdeTotalpapelHigienico > 0 || qtdeTotaldetergente > 0 || qtdeTotalluva > 0) {
			
		encheuCaminhao = true;
		while (encheuCaminhao && qtdeTotalpapelHigienico != 0) {
				encheuCaminhao = calculaPapelHigienico();
				qtdeTotalpapelHigienico = qtdeTotalpapelHigienico-1;
		}
		
		encheuCaminhao = true;
		while (encheuCaminhao && qtdeTotaldetergente != 0) {
			encheuCaminhao = calculaDetergente();
			qtdeTotaldetergente = qtdeTotaldetergente-1;
		}
		
		encheuCaminhao = true;
		while (encheuCaminhao && qtdeTotalluva != 0) {
			encheuCaminhao = calculaLuva();
			qtdeTotalluva = qtdeTotalluva-1;
		}
		
		System.out.println("Caminhão nº " + qtdecaminhao);
		System.out.println("Quantidade Papel Higiênico " + qtdePapelHig);
		System.out.println("Quantidade Detergente " + qtdeDetergente);
		System.out.println("Quantidade Luva " + qtdeLuva);
		
		//inicializando para começar novo caminhão
		qtdecaminhao++;
		qtdePapelHig = 0;
		qtdeDetergente = 0;
		qtdeLuva = 0;
		caminhaoCubico = 0;

		}

	}
		
private boolean calculaPapelHigienico() {
	if ((caminhaoCubico + 0.1) < 50) {
		caminhaoCubico = caminhaoCubico + 0.1;
		qtdePapelHig +=1;
		
		return true;
	}
	return false;
}

private boolean calculaDetergente() {
	if ((caminhaoCubico + 0.025) < 50) {
		caminhaoCubico = caminhaoCubico + 0.025;
		qtdeDetergente +=1;
		return true;
	}
	return false;
}

private boolean calculaLuva() {
	if ((caminhaoCubico + 0.0125) < 50) {
		caminhaoCubico = caminhaoCubico + 0.0125;
		qtdeLuva+=1;
		return true;
	}
	return false;
}
	
	}



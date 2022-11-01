package novo;

public class Aviao {
	private String modelo;
    private String cor;
    private String motor;
    private String material;
    private String velocidade;
	
    public Aviao(String modelo, String cor, String motor, String material, String velocidade) {
		this.modelo = modelo;
		this.cor = cor;
		this.motor = motor;
		this.material = material;
		this.velocidade = velocidade;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}
    
    
    
}

package novo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Aviao {
	private String modelo;
    private String cor;
    private String motor;
    private String material;
    private String velocidade;
	private String chassis;
    
    public Aviao() {
    	
    }
    
    public Aviao(String modelo, String cor, String motor, String material, String velocidade, String chassis) {
		this.modelo = modelo;
		this.cor = cor;
		this.motor = motor;
		this.material = material;
		this.velocidade = velocidade;
		this.chassis = chassis;
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
	
	public String getChassis() {
		return chassis;
	}

	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	public String salvar() {
        
        try {
            FileWriter fw = new FileWriter("cadastro.csv", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Modelo  " +this.modelo);
            pw.println("Cor  " +this.cor);
            pw.println("Motor  " +this.motor);
            pw.println("Material  " +this.material);
            pw.println("Velocidade  " +this.velocidade);
            pw.flush();
            pw.close();
            fw.close();
            
        
        } catch (IOException ex) {
            
            Logger.getLogger(Aviao.class.getName()).log(Level.SEVERE, null, ex);
        }
	
	return "Avião Cadastrado!" ;

}
    
}

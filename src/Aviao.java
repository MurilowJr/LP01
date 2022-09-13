import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

class Aviao {
    private String modelo;
    private String cor;
    private String motor;
    private String material;
    private String velocidade;

        // METODO PARA GRAVAR NO ARQUIVO
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
                // TODO Auto-generated catch block
                Logger.getLogger(Aviao.class.getName()).log(Level.SEVERE, null, ex);
            }
		
		return "Avião Cadastrado!" ;

    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getMotor() {
        return this.motor;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public String getVelocidade() {
        return this.velocidade;
    }
}

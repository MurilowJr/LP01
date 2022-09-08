class Aviao {
    private String modelo;
    private String cor;
    private String motor;
    private String material;
    private String velocidade;

    public Aviao() {
        this.modelo = "";
        this.cor = "";
        this.motor = "";
        this.material = "";
        this.velocidade = "";

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

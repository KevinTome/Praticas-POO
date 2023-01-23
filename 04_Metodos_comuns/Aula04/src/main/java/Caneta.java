
public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public String getCor() {
        return cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }    
    
    public void status() {
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada? " + this.tampada);
    }
}

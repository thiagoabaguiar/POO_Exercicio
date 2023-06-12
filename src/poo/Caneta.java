package poo;

public class Caneta {

    // atributos
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    // construtor
    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }

    // setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void setTampada(boolean status) {
        this.tampada = status;
    }

    // getters
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public float getPonta() {
        return ponta;
    }

    public int getCarga() {
        return carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    // métodos
    public void rabiscar() {

        if (this.isTampada()) {
            System.out.println("ERRO. Caneta tampada");
        } else {
            System.out.println("Rabiscando");
        }

        if (this.getCarga() <= 0) {
            System.out.println("Sem carga");
        }

    }

    public void tampar() {

        this.tampada = true;

    }

    public void destampar() {

        this.tampada = false;

    }

    public void status() {

        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga() + "%");
        System.out.println("Está Tampada? " + (this.isTampada() ? "Sim" : "Não"));

    }

}

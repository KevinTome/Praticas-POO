public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //métodos especiais
    //construtor vazio
    public ContaBanco() {
        
    }
    //construtor
    public ContaBanco(int numConta, String tipo, String dono, float saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }
    //getters
    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }
    //setters
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    //métodos personalizados
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC") {
            this.setSaldo(50);
        }else if(t == "CP") {
            this.setSaldo(150);
        }
    }
    public void fecharConta() {
        if(this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechado, ainda tem saldo!");
        } else if(this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada, saldo negativo!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechcado com sucesso!");
        }
    }
    public void depositar(float v) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado!");
        } else {
            System.out.println("Conta inválida para depósito.");
        }
    }
    public void sacar(float v) {
        if (this.isStatus()) {
            if(this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado!");
            } else {
                System.out.println("Conta inválida para saque.");
            }
        }
    }
    public void pagarMensal() {
        int v;
        
        if(this.getTipo() == "CC"){
            v = 12;
        } else if(this.getTipo() == "CP"){
            v = 20;
        }
        
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga!");
        } else {
            System.out.println("Conta inválida para depósito de mensalidade");
        }
    }
    public void estadoAtual() {
        System.out.println("----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
}

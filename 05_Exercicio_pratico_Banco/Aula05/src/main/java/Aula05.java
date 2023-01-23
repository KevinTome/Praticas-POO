public class Aula05 {
    public static void main(String[] args) {
       //construtor vazio
       ContaBanco p1 = new ContaBanco();
       p1.setNumConta(1111);
       p1.setDono("Kevin");
       p1.abrirConta("CC");
        
       //construtor
       ContaBanco p2 = new ContaBanco(2222, "CP", "Marcela", 150, true);
       
       //depositar
       p1.depositar(100);
       p2.depositar(500);
        
       //sacar
       p1.sacar(200);
       p2.sacar(200);
       
       //fechar conta
       p1.fecharConta();
       p1.sacar(150);
       p1.fecharConta();
       
       //status
       p1.estadoAtual();
       p2.estadoAtual();
    }
}

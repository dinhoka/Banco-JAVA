
package banco;
public class Banco {

    public static void main(String[] args) {
        
      ContaBanco p1 =new ContaBanco();  
      
      
      p1.setNumConta(1111);
      p1.setDono("Jubileu Soares");
      p1.abrirConta("CC");
      
      ContaBanco p2 = new ContaBanco();
      
      
      p2.setNumConta(22222);
      p2.setDono("Maria Gorete");
      p2.abrirConta("CP");
      
      
      
      p1.estadoAtual();
      p2.estadoAtual();
    
    }
    
}

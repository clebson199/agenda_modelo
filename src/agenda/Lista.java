
package agenda;

public class Lista {

public static void main(String[] args) {
    Agenda agenda = new Agenda();
    
    System.out.println("Minha agenda tem "+ agenda.TemQuantos());
    agenda.ArmazenarPessoa("Joao", 52, 1.81f );
    agenda.ArmazenarPessoa("Lara", 49, 1.72f );
    agenda.ArmazenarPessoa("Nani", 27, 1.76f );
    agenda.ArmazenarPessoa("Rayssa", 26, 1.45f );
    agenda.ArmazenarPessoa("Tais", 26, 1.72f );
    agenda.ArmazenarPessoa("Enrico", 24, 1.76f );
    agenda.ArmazenarPessoa("Gabriel", 23, 1.76f );
    agenda.ArmazenarPessoa("Caio", 25, 1.77f );
    agenda.ArmazenarPessoa("Jane", 35, 1.65f );
    agenda.ArmazenarPessoa("Mauro", 49, 1.81f );
  
    
    System.out.println(agenda.ArmazenarPessoa("Samual", 42, 1.70f ));
    System.out.println("Minha agenda tem "+agenda.TemQuantos());
    agenda.ImprimirAgenda();
    System.out.println("Achou Rayssa ? "+agenda.BuscarPessoa("Rayssa"));
    System.out.println("Achou Fulana ? "+agenda.BuscarPessoa("Fulana"));
    if (agenda.RemovePessoa("Rayssa")) {
        System.out.println("Conseguiu remover Rayssa");
        System.out.println("Minha agenda tem "+agenda.TemQuantos());

    }
    System.out.println("*");
    agenda.ImprimirAgenda();
    if (agenda.RemovePessoa("Mauricio")) {
        System.out.println("Conseguiu remover Mauricio");
    }else{
         System.out.println("Nao Conseguiu remover Mauricio");
    }
    System.out.println("*");
    agenda.ImprimirAgenda();
    if (agenda.RemovePessoa("Mauro")) {
        System.out.println("Conseguiu remover Mauro");
    }else{
         System.out.println("Nao Conseguiu remover Mauro");
    }
    System.out.println("*");
    agenda.ImprimirAgenda();
      
    
  }
}
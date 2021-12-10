class Main {
  public static void main(String[] args) {
    Professor ale = new Professor(123456, "Ale", "Tecnologia da Informação");
        
        System.out.println(ale.getNome());
        System.out.println(ale.getMatricula());
        System.out.println(ale.getDepartamento());

    Porta porta = new Porta("Vermelha", 2.0, 0.9, true);

        System.out.println(porta);

    Televisor televisor = new Televisor(5, 20, false);

        System.out.println(televisor);

    ControleRemoto controleRemoto = new controleRemoto(6, 50, true);


    //não entendi muito bem como fazer os prints da classe controle, interligando com a tv!!
    System.out.println(controleRemoto);



        
  } 
  
  

   
}
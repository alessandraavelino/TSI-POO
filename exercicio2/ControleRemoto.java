public class ControleRemoto{

    private Televisor televisao;
  
public ControleRemoto(Televisor televisao){
    this.televisao = televisao;
}
  
    public void ligar(){
        televisao.ligar();
    }
              
    public void desligar(){
        televisao.desligar();
    }
    public void trocarCanal(int canal){
        televisao.trocarCanal(canal);
    }
    
    public void aumentarVolume(){
    televisao.aumentarVolume(); 
    }
    
    
    public void diminuirVolume(){
    televisao.diminuirVolume(); 
    }

   
   //public String toString(){
    //    return "Canal: " + trocarCanal + " , Volume: " + volume + " , Está ligado? " + ligado;
    
}
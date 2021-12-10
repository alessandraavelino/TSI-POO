public class Televisor {
    private int canal;
    private int volume;
    private boolean ligado;

    public Televisor(int canal, int volume, boolean ligado){
        this.canal = canal;
        this.volume = volume;
        this.ligado = ligado;
    }

    public void trocarCanal(int canal){
        this.canal = canal;

    }

    public void botaoUp(){
        this.canal = + 1; 
    }

    public void botaoDown(){
        this.canal = - 1;
    }

    public void aumentarVolume(){
        if (volume < 100){
            volume = volume + 1;
        }
    }

    public void diminuirVolume(){
        if(volume > 0){
            volume = volume - 1;
        }
    }

    public void ligar(){
        if(ligado == false){
            ligado = true;
        }
    }

    public void desligar(){
        if(ligado == true){
            ligado = false;
        }
    }
    


    public String toString(){
        return "Canal: " + canal + " , Volume: " + volume + " , Está ligado? " + ligado;
    }



}
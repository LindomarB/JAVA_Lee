package torneio_king_of_rua;

public class Torneio_King_of_Rua {

    public static void main(String[] args) {
        Lutador vetor[] = new Lutador[6];
        vetor[0] = new Lutador("Gordon Freeman","USA",31,1.67,60.5,11,3,1);
        vetor[1] = new Lutador("Kreiton","SPARTA",35,1.70,70.3,3,3,3);
        vetor[2] = new Lutador("Leon ","USA",36,1.84,59.9,7,4,1);
        vetor[3] = new Lutador("DragonBorn","SKYRIM",32,1.65,85.4,9,6,5);
        vetor[4] = new Lutador("Parthunaxx","SKYRIM",5000,9.5,110.2,9,3,1);
        vetor[5] = new Lutador("Nihilant","XEN-HL1",1000,12.3,120.1,5,5,5);
        
        
        
         Luta uec01 = new Luta();
         uec01.marcarLuta(vetor[1],vetor[0]);
         uec01.Lutar();
        
        
        
    }
    
}

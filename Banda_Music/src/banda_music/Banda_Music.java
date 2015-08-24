
package banda_music;


public class Banda_Music 
{
    public static void main(String[] args) 
    {
        Instrumento[] i = new Instrumento[15];
        i[0] = new Flauta();
        i[1] = new Trompeta();
        i[2] = new Clarinete();
        i[3] = new Trombol();
        i[4] = new Bansuri();
        i[0].tocar('C');
        i[1].tocar('D');
        i[2].tocar('E');
        i[3].tocar('I');
        i[4].tocar('U');
        System.out.println();
        i[5] = new Guitarra();
        i[6] = new Bajo();
        i[7] = new Arpa();
        i[8] = new Violin();
        i[9] = new Piano();
        i[5].tocar('O');
        i[6].tocar('R');
        i[7].tocar('D');
        i[8].tocar('A');
        i[9].tocar('N');
        System.out.println();
        i[10] = new Bongos();
        i[11] = new Tumbadoras();
        i[12] = new Bateria();
        i[13] = new Bombo();
        i[14] = new Timbales();
        i[10].tocar('P');
        i[11].tocar('T');
        i[12].tocar('M');
        i[13].tocar('L');
        i[14].tocar('Q');
    }
    
}

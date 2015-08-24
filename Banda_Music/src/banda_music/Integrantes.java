
package banda_music;

public class Integrantes extends Instrumento
{
    Instrumento mi_instrumento;
    public Integrantes(Instrumento ins)
    {
        mi_instrumento = ins;
    }
    
    public void TocarInstrumento()
    {
        mi_instrumento.tocar('c');
    }
    
     public void CambiarInstrumento(Instrumento ins)
    {
        mi_instrumento = ins;
    }
    
}

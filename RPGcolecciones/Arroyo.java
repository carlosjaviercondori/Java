package RPGcolecciones;

public class Arroyo extends Elemento {

    public Arroyo() {
        setNombre("Arroyo de agua fresca");
        setPeso(1000);
        setTipo(TipoElemento.FIJO);
    }
    
    public Elemento getElemento () {
        return new Agua();
    }
}

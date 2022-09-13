import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class main {

    public static void main( String [] args)
    {
        Receta receta = new Receta("voladora");
    receta.addIngrediente("Pluma");
    System.out.println(receta.toString());
    receta.addIngrediente("Sangre");
    receta.addIngrediente("Hueso");
    System.out.println(receta.toString());
    receta.cerrarReceta();
    System.out.println(receta.toString());

    }
    
}

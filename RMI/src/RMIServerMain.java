


public class RMIServerMain {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try 
        {
            RMIService ws = new RMIService();
           
            int suma = ws.getSuma(2, 3);
            System.out.println("suma: " + suma); 
            int resta = ws.getResta(2, 3);
            System.out.println("resta: " + resta); 
            int multi = ws.getMulti(2, 3);
            System.out.println("Multiplicacion: " + multi);
            int potencia = ws.getPotencia(2, 3);
            System.out.println("Potencia: " + potencia);
            int divi = ws.getDivi(2, 3);
            System.out.println("Division: " + divi);
            int modu = ws.getModulo(2, 3);
            System.out.println("Modulo: "+modu);
        } 
        catch (Exception ex)
        {
            ex.printStackTrace();
            System.out.println("ERROR: " + ex);
        }
    }
}


public class Estacionamiento
{
    int max=150, costo=15, vehiest=0, total=0;
    String Arr[];
    boolean Registrar(String placa,int Horaentrada,int Minutosentrada)
    {
        if(vehiest<=max)
        {
            Arr[vehiest]=placa;
            vehiest+=1;
            return(true);
        }
        else
        {
            System. out. println(" No hay espacio");
            return(false);
        } 
        
    
    }
    
    boolean Salida(int Horasalida, int Minutossalida, String placa)
    {
    
    }
}

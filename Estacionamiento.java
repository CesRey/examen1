
public class Estacionamiento
{
    int max=150, costo=15, vehiest=0, total, i,horaentradas[],minutosentrada[];
    String Arr[];
    boolean Registrar(String placa,int Horaentrada,int Minutosentrada)
    {
        if(vehiest<=max)
        {
            Arr[vehiest]=placa;
            horaentradas[vehiest]=Horaentrada;
            minutosentrada[vehiest]=Minutosentrada;
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
        for(i=0;i<vehiest;i+=1)
        {
            if(Arr[i] == placa)
            {
                Arr[i]=null;
                return true;
            }
            else 
            {
                System. out. println(" No se encuentra el vehiculo en el sistema");   
                return false;
            }
        }
        return false;
    }
}

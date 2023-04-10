
import consumo.consumoAgua;
import impl.GerarConsumoimpl;


public class app {
    

    /**
     * @param args
     */
    public static void main(String[] args) {

        
        for(int i = 0; i< 10; i++){
        GerarConsumoimpl residencia = new GerarConsumoimpl();
       //GerarConsumoimpl residencia = new GerarConsumoimpl();
       consumoAgua[] consumos = residencia.gerarConsumo(2);
        
        for(consumoAgua consumo : consumos){
            System.out.println("data : " + consumo.getData() + ", quantidade : " + consumo.getQuantidade() + " Litros");
        }
        double valorConta = residencia.calcularValor(consumos);
        System.out.println("Valor total da conta de agua é : R$ " + valorConta);
        System.out.print("\n");

    }

    }
}

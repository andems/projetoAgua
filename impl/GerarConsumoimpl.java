package impl;


import java.util.Date;
import java.util.Random;

import consumo.GerarConsumo;
import consumo.consumoAgua;

public class GerarConsumoimpl implements GerarConsumo{


    @Override
    public consumoAgua[] gerarConsumo(int quantidade) {
        consumoAgua[] consumos = new consumoAgua[quantidade];
        Random rand = new Random();
        for(int i = 0; i < quantidade; i++){

            Date data = new Date(System.currentTimeMillis() - rand.nextInt(12)* 30 *24 *60*60*1000);


            int quantidadeAgua = rand.nextInt(10000) + 1;

            final consumoAgua consumo = new ConsumoAguaimpl(data, quantidadeAgua);
            consumos[i] = consumo;
        }
        return consumos;
    }


    @Override
    public double calcularValor(consumoAgua[] consumos) {
        int totalLitros = 0;
        for(consumoAgua consumo : consumos){
            totalLitros += consumo.getQuantidade();
        }

        double valorTotal = 0;
        if(totalLitros <= 10000){
            valorTotal = totalLitros / 1000.0 * 2.5;
        }else if(totalLitros <=20000){
            valorTotal = 10000 / 1000.0 *2.5 + (totalLitros - 10000) /1000.0 *3.5;
        }else {
            valorTotal = 10000 / 1000.0 * 2.5 * 10000 /1000.0 * 3.5 + (totalLitros - 20000) / 1000.0 * 4.5;
        }
        return valorTotal;
    }


   
    
    
}

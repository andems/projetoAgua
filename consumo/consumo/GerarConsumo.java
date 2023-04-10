package consumo;

public interface GerarConsumo {

    public consumoAgua[] gerarConsumo(int quantidade);

    public double calcularValor(consumoAgua[] consumos);

}

package consumo;

import java.util.Date;


public abstract class consumoAgua {

    private Date data;
    private int quantidade;

    public consumoAgua(Date data, int quantidade) {
        this.data = data;
        this.quantidade = quantidade;
    }

    public Date getData() {
        return data;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
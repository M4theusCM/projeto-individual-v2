package school.sptech.back;

public class TiposVeiculos {
    private Integer id;
    private String tipoVeiculo;


    public TiposVeiculos() {
    }

    public TiposVeiculos(Integer id, String tipoVeiculo) {
        this.id = id;
        this.tipoVeiculo = tipoVeiculo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
}
package school.sptech.back;

import java.time.LocalDate;
import java.util.Date;

public class Veiculo {
    private Integer id;

    private String marca;
    private String modelo;
    private LocalDate ano;
    private String cor;
    private Integer quilometragem;

    private String tipoVeiculo;
    private String tipoCombustivel;
    private String tipoCambio;
    private Integer qtdPorta;

    private Double preco;
    private String estadoVeiculo;
    private Boolean impulsionarAnuncio;
    private String emailContato;
    private String numeroContato;

    private String infosAdd;


    public Veiculo() {
    }

    public Veiculo(Integer id, String marca, String modelo, LocalDate ano, String cor, Integer quilometragem, String tipoVeiculo, String tipoCombustivel, String tipoCambio, Integer qtdPorta, Double preco, String estadoVeiculo, Boolean impulsionarAnuncio, String emailContato, String numeroContato, String infosAdd) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.quilometragem = quilometragem;
        this.tipoVeiculo = tipoVeiculo;
        this.tipoCombustivel = tipoCombustivel;
        this.tipoCambio = tipoCambio;
        this.qtdPorta = qtdPorta;
        this.preco = preco;
        this.estadoVeiculo = estadoVeiculo;
        this.impulsionarAnuncio = impulsionarAnuncio;
        this.emailContato = emailContato;
        this.numeroContato = numeroContato;
        this.infosAdd = infosAdd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public Integer getQtdPorta() {
        return qtdPorta;
    }

    public void setQtdPorta(Integer qtdPorta) {
        this.qtdPorta = qtdPorta;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getEstadoVeiculo() {
        return estadoVeiculo;
    }

    public void setEstadoVeiculo(String estadoVeiculo) {
        this.estadoVeiculo = estadoVeiculo;
    }

    public Boolean getImpulsionarAnuncio() {
        return impulsionarAnuncio;
    }

    public void setImpulsionarAnuncio(Boolean impulsionarAnuncio) {
        this.impulsionarAnuncio = impulsionarAnuncio;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public String getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(String numeroContato) {
        this.numeroContato = numeroContato;
    }

    public String getInfosAdd() {
        return infosAdd;
    }

    public void setInfosAdd(String infosAdd) {
        this.infosAdd = infosAdd;
    }
}

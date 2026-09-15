package school.sptech.back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private List<Veiculo> veiculos = new ArrayList<>();


    @GetMapping
    public ResponseEntity<List<Veiculo>> listar() {
        String sql = "SELECT * FROM VEICULOS  ORDER BY  IMPULSIONARANUNCIO DESC, ID DESC;";
        List<Veiculo> veiculosDoBanco = jdbcTemplate
                .query(sql, new BeanPropertyRowMapper<>(Veiculo.class));
        return ResponseEntity.status(200).body(veiculosDoBanco);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> verVeiculo(@PathVariable Integer id) {
        String sql = "SELECT * FROM VEICULOS WHERE id = ?;";
        try{
        Veiculo veiculosDoBanco = jdbcTemplate
                .queryForObject(sql, new BeanPropertyRowMapper<>(Veiculo.class), id);
        return ResponseEntity.status(200).body(veiculosDoBanco);
        } catch (ResponseStatusException e) {
            return ResponseEntity.status(404).build();
        }
    }

    @GetMapping("/tiposVeiculos")
    public ResponseEntity<List<TiposVeiculos>> listarTipoVeiculo(){
        String sql = "SELECT * FROM tiposCarros;";
        List<TiposVeiculos> tipoCarros = jdbcTemplate
                .query(sql, new BeanPropertyRowMapper<>(TiposVeiculos.class));
        return ResponseEntity.status(200).body(tipoCarros);
    }

    @PostMapping
    public ResponseEntity<Veiculo> criar(@RequestBody Veiculo veiculo) {
        String sql = """
                INSERT INTO veiculos ( marca,
                 modelo,
                 ano,
                 cor,
                 quilometragem,
                 tipoVeiculo,
                 tipoCombustivel,
                 tipoCambio,
                 qtdPorta,
                 preco,
                 estadoVeiculo,
                 impulsionarAnuncio,
                 emailContato,
                 numeroContato,
                 infosAdd)
                 VALUES 
                 (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);
                """;
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,  veiculo.getMarca());
            ps.setString(2,  veiculo.getModelo());
            ps.setObject(3,  veiculo.getAno());
            ps.setString(4,  veiculo.getCor());
            ps.setInt   (5,  veiculo.getQuilometragem());
            ps.setString(6,  veiculo.getTipoVeiculo());
            ps.setString(7,  veiculo.getTipoCombustivel());
            ps.setString(8,  veiculo.getTipoCambio());
            ps.setInt   (9,  veiculo.getQtdPorta());
            ps.setDouble(10, veiculo.getPreco());
            ps.setString(11, veiculo.getEstadoVeiculo());
            ps.setBoolean(12, veiculo.getImpulsionarAnuncio());
            ps.setString(13, veiculo.getEmailContato());
            ps.setString(14, veiculo.getNumeroContato());
            ps.setString(15, veiculo.getInfosAdd());
            return ps;
        }, keyHolder);
        veiculo.setId(keyHolder.getKeyAs(Integer.class));
        return ResponseEntity.status(201).body(veiculo);
    }
}

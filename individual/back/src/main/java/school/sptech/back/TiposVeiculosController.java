package school.sptech.back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("/tiposVeiculos")
public class TiposVeiculosController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping()
    public ResponseEntity<List<TiposVeiculos>> listarTipoVeiculo(){
        String sql = "SELECT * FROM tiposCarros;";
        List<TiposVeiculos> tipoCarros = jdbcTemplate
                .query(sql, new BeanPropertyRowMapper<>(TiposVeiculos.class));
        return ResponseEntity.status(200).body(tipoCarros);
    }
}

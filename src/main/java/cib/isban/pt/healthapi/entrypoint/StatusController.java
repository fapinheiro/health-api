package cib.isban.pt.healthapi.entrypoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class StatusController {
	
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @GetMapping(path = "/status")
    public ResponseEntity<Void> getStatus() throws Throwable {
        jdbcTemplate.execute("call sleep(10)");// TODO Auto-generated method stub
        return ResponseEntity.ok().build();
    }

}

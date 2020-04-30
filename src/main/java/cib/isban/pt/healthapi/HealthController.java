package cib.isban.pt.healthapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class HealthController {
	
    @GetMapping(path = "/status")
    public ResponseEntity<String> getStatus() throws Throwable {
        return ResponseEntity.ok().body("Running");
    }

}

package cib.isban.pt.healthapi.entrypoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cib.isban.pt.healthapi.dataprovider.h2.model.User;
import cib.isban.pt.healthapi.usecase.user.ListarUsuarios;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private ListarUsuarios listarUsuarios;

    @GetMapping(path = "/users")
    public ResponseEntity<List<User>> getStatus() throws Throwable {
        long t1 = System.currentTimeMillis();
        long t2 = System.currentTimeMillis();
        while (t2 - t1 < (1000 * 2)) {
            t2 = System.currentTimeMillis();
        }
        return ResponseEntity.ok(listarUsuarios.getUsers());
    }

}

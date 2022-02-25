// package cib.isban.pt.healthapi;

// import javax.servlet.http.HttpServletRequest;

// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;


// @RestController
// @RequestMapping("/api/v1")
// @CrossOrigin
// public class HealthController {
	
//     @GetMapping(path = "/status")
//     public ResponseEntity<String> getStatus(HttpServletRequest request) throws Throwable {
//         final String ip = request.getRemoteAddr();
//         System.out.println("Remote IP is " + ip);
//         return ResponseEntity.ok().body("Your IP is: " + ip);
//     }

// }

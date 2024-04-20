package jsh.http.controller.statuscodetest;

import jsh.http.domain.MyResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/api/statuscodes")
public class StatusCodePageApiController {

    @GetMapping("/200")
    public MyResponse getRequest_200() {
        return MyResponse.of("200");
    }

    @GetMapping("/201")
    public ResponseEntity<?> getRequest_201() {
        URI location = URI.create("location");
        return ResponseEntity.created(location)
                             .body(MyResponse.of("201"));
    }

    @GetMapping("/202")
    public ResponseEntity<?> getRequest_202() {
        return ResponseEntity.accepted()
                             .body(MyResponse.of("202"));
    }
}

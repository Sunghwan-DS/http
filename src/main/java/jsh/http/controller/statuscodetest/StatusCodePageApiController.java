package jsh.http.controller.statuscodetest;

import jsh.http.domain.MyResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/statuscodes")
public class StatusCodePageApiController {

    @GetMapping("/200")
    public MyResponse getRequest_200() {
        return MyResponse.of("성공");
    }
}

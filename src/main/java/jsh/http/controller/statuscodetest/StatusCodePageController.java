package jsh.http.controller.statuscodetest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/statuscodes")
public class StatusCodePageController {

    @GetMapping("/{statusCode}")
    public String page(@PathVariable("statusCode") String statusCode) {
        return "/statuscodepages/page_" + statusCode;
    }
}

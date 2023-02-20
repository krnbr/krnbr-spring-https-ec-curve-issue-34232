package in.neuw.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class PingController {

    @GetMapping("/ping")
    public PongResponse ping() {
        return new PongResponse(true, "pong", new Date().getTime());
    }

}

record PongResponse(boolean status, String message, Long timestamp) {}

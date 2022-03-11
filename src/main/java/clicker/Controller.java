package clicker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private ServiceClick serv;

    @GetMapping
    int getScore(){
        return serv.getScore();
    }

    @PostMapping("/click")
    void clickerModel(@RequestBody int clickCount) {
        serv.click(clickCount);
    }

}
package at.fhtw.markingsys;

import at.fhtw.markingsys.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/complementary")
public class Controller {


    public Controller(Service s) {
        this.Service = Service;
    }


    @GetMapping
    public String getComplementary(
            @RequestParam(defaultValue = "85", required = false) String number) {
        return Service.getComplementary();
    }
}


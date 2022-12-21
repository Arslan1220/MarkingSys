package at.fhtw.markingsys;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RestController
@RequestMapping("api/complementary")

public class Controller {

    private final MarkService markService;
    public Controller(MarkService s) {
        this.markService = s;
    }


    @GetMapping
    public String getComplementary(
            @RequestParam(defaultValue = "85") String number) {
        return markService.getComplementary(number);
    }
}


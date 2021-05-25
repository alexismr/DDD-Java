package amr.Application.Controllers;

import amr.Domain.Interfaces.IThingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Thing")
public class ThingController {


    private IThingService _basketService;

    public ThingController(IThingService _basketService) {
        this._basketService = _basketService;

    }

    @GetMapping
    public String ReturnHello() {
        return this._basketService.AddThing("hola","alexis");
    }


}

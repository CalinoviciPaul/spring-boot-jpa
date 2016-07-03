package org.irian.springCloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IrianLaptop on 7/3/2016.
 */
@Controller
public class HelloController {

    @RequestMapping("/hi")
    public @ResponseBody String hi(){
        return "Hello World!";
    }
}

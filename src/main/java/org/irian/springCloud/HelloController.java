package org.irian.springCloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by IrianLaptop on 7/3/2016.
 */
@Controller
public class HelloController {

    /**
     * Controller returns a view name
     * The ViewResolver finds a matching template
     * The renderer renders the template
     */
    @RequestMapping("/hi/{name}")
    public  String hi(Map model, @PathVariable String name){
        model.put("name",name);
        return "hello";
    }
}

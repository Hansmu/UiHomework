package ee.ttu.ui.api;

import ee.ttu.ui.core.ExampleService;
import ee.ttu.ui.domain.ExampleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Hans on 11.02.2017.
 */
@RestController
@RequestMapping("example")
public class ExampleController {

    @Autowired
    private ExampleService exampleService;

    @RequestMapping(value="endpoint", method = RequestMethod.GET)
    public String getHelloWorld() {
        return exampleService.getHelloWorld();
    }

    @RequestMapping(value="all", method = RequestMethod.GET)
    public List<ExampleEntity> getAllExampleEntities() {
        return exampleService.getAllExampleEntities();
    }
}

package net.ambientia.osaw.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DemoController {

@RequestMapping("/")
  public String index() {
    //return "<html><head><title>OSAW demo</title></head><body><h1>Good morning Kista!</h1></body></html>";
    return "<html><head><title>Car Configurator</title></head><body><h1>Welcome to Car Configurator!</h1><h2>Please see our latest model:</h2><br/><img src=\"http://mirror.raatti.net/v70-malmo.jpg\"></img></body></html>";
  }
}

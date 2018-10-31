package net.ambientia.osaw.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DemoController {

@RequestMapping("/")
  public String index() {
    //return "<html><head><title>OSAW demo</title></head><body><h1>Good morning Kista!</h1></body></html>";
    return "<html><head><title>OSAW demo</title></head><body><img src=\"http://jussiha.staff.ambientia.fi/images/cat.gif\"></img></body></html>";
  }
}

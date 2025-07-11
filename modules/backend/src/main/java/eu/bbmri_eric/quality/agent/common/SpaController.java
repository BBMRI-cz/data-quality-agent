package eu.bbmri_eric.quality.agent.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpaController {
  @RequestMapping(value = "/{path:[^.]*}", method = RequestMethod.GET)
  public String redirect() {
    // Forward to index.html for SPA routes
    return "forward:/index.html";
  }
}

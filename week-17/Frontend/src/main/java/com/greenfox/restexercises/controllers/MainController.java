package com.greenfox.restexercises.controllers;

import com.greenfox.restexercises.models.Appenda;
import com.greenfox.restexercises.models.Error;
import com.greenfox.restexercises.models.Greeting;
import com.greenfox.restexercises.models.Number;
import com.greenfox.restexercises.models.Result;
import com.greenfox.restexercises.models.Until;
import com.greenfox.restexercises.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.ResponseEntity;

@Controller
public class MainController {

  public ResultService resultservice;

  @Autowired
  public MainController(ResultService resultService) {
    this.resultservice = resultService;
  }

  @GetMapping ("/")
  public String intro(){
    return "index";
  }

  @GetMapping ("/doubling")
  @ResponseBody
  public Object doubling(@RequestParam(required = false)Long input){
    if (input == null){
      return new Error("Please provide an input!");
    } else {
      return new Number(input);
    }
  }

  @GetMapping ("/greeter")
  @ResponseBody
  public Object greeting(@RequestParam(required = false) String name, @RequestParam(required = false) String title){
    if ((name == null)&&(title==null)){
      return ResponseEntity.badRequest().body(new Error("Please provide a name and a title!"));
    } else if (name==null){
       return ResponseEntity.badRequest().body(new Error("Please provide a name!"));
    } else if (title==null){
      return ResponseEntity.badRequest().body(new Error("Please provide a title!"));
    } else {
      return new Greeting(name, title);
    }
  }

  @GetMapping("/appenda/{appendable}")
  @ResponseBody
  public Object append(@PathVariable(required = false) String appendable) {
    if (appendable == null) {
      return ResponseEntity.notFound();
    } else {
      return new Appenda(appendable);
    }
  }

  @GetMapping("/appenda/")
  public ResponseEntity<HttpStatus> noAppendaError(){
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }

  @PostMapping("/dountil/{action}")
  @ResponseBody
  public Object dountil(@PathVariable String action, @RequestBody(required=false)
      Until until) {
    if (until == null) {
      return ResponseEntity.badRequest().body(new Error("Please provide a number!"));
    } else {
      return this.resultservice.countUntil(until.getUntil(), action);
    }
  }

}

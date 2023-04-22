package com.assignment.URLHitCounter.controller;

import com.assignment.URLHitCounter.service.UrlHitService;
import com.assignment.URLHitCounter.user.UserClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UrlHitController {
@Autowired
UrlHitService obj;

@RequestMapping(value = "/user/{userName}" , method = RequestMethod.GET)
public UserClass UrlHit(@PathVariable String userName){
return obj.CountHit(userName);
}
}

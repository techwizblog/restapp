package com.techwizblog.thumbnailer.controller;

import com.techwizblog.thumbnailer.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SIB on 4/21/2016.
 */
@RestController
public class ImageController {


    @RequestMapping(value = "/image", method = RequestMethod.POST)
    public Image createImage(@RequestBody String body)
    {
        System.out.println(body);

        return new Image();

    }

}

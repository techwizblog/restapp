package com.techwizblog.thumbnailer.controller;

import com.techwizblog.thumbnailer.service.ToneAnalyzerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * Created by SIB on 4/24/2016.
 */
@RestController
public class WatsonController {

    @Autowired
    ToneAnalyzerService toneAnalyzerService;


    @CrossOrigin
    @RequestMapping(value = "/watson", method = RequestMethod.POST)
    public String postAnalyzeTone(@RequestBody String text) {
        /*text =
                "I know the times are difficult! Our sales have been "
                        + "disappointing for the past three quarters for our data analytics "
                        + "product suite. We have a competitive data analytics product "
                        + "suite in the industry. But we need to do our job selling it! "
                        + "We need to acknowledge and fix our sales challenges. "
                        + "We can’t blame the economy for our lack of execution! "
                        + "We are missing critical sales opportunities. "
                        + "Our product is in no way inferior to the competitor products. "
                        + "Our clients are hungry for analytical tools to improve their "
                        + "business outcomes. Economy has nothing to do with it.";
        */
        // Call the service and get the tone

        System.out.println(text);
        String result = toneAnalyzerService.analyzeTone(text);
        System.out.println(result);

        return result;
    }

}

package com.techwizblog.thumbnailer.service;

import com.ibm.watson.developer_cloud.tone_analyzer.v3_beta.ToneAnalyzer;
import org.springframework.stereotype.Component;

/**
 * Created by SIB on 4/24/2016.
 */
@Component
public class ToneAnalyzerService {
    ToneAnalyzer service = new ToneAnalyzer(ToneAnalyzer.VERSION_DATE_2016_02_11);

    public ToneAnalyzerService()
    {
        init();
    }


    private void init()
    {
        service.setUsernameAndPassword("661f628a-2615-4764-b415-3e97244e9804", "6AjZXDIcrO7K");
    }

    public String analyzeTone(String text)
    {
        return service.getTone(text).execute().getDocumentTone().getTones().toString();
    }

}

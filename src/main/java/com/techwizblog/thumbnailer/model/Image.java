package com.techwizblog.thumbnailer.model;

//import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by SIB on 4/21/2016.
 */
//@Entity
public class Image implements Serializable{

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String file;

    private List<String> resolutions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public List<String> getResolutions() {
        return resolutions;
    }

    public void setResolutions(List<String> resolutions) {
        this.resolutions = resolutions;
    }
}

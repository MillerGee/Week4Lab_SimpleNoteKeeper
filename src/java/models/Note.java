/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.beans.*;
import java.io.*;
import java.io.Serializable;

/**
 *
 * @author Miller Gee
 */
public class Note implements Serializable {
    
    private String title;
    private String contents;

    
    private PropertyChangeSupport propertySupport;
    
    public Note() {
        title = "";
        contents = "";
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String value) {
      this.title = value;
    }
    public String getContents() {
        return contents;
    }
    
    public void setContents(String value) {
      this.contents = value;
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}

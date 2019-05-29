package model;

import java.util.Date;


public class Publication {
    private String title;
    private Date editionDate;
    private String editorial;
    private String[] autores;
    
    public Publication(String title, Date editionDate, String editorial){
    super();
    this.title=title;
    this.editionDate = editionDate;
    this.editorial = editorial;
    }
    

    public String getTitle() {
        return title;
    }
    
    @Override
    public String toString(){
        return "\n ::MAGAZINE::"+
                "\n Title: "+getTitle()+
                "\n Editorial" + getEditorial()+
                "\n Edition Date" + getEditionDate();
                        
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(Date editionDate) {
        this.editionDate = editionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    
    
    
    
    
}

package model;

import java.util.Date;

public class Movie extends Film implements IVisualizable {
    private int id;
    private int timeViewed;

    public Movie(String title, String genre, String creator, int duration, short year) {
        super(title, genre, creator, duration);
        setYear(year);
    }
    
     
     public void showData(){
         //System.out.println("Titulo: " + this.title);
         //System.out.println("Genre: " + this.genre);
         //System.out.println("Year: "+ this.year);
     }
     
     public int getId(){
         return id;
     }
     
     
     
     
      public int getTimeViewed(){
         return timeViewed;
     }
     
     public void setTimeViewed(int timeViewed){
         this.timeViewed=timeViewed;
     }
     
     
      @Override
    public String toString(){
        return "Title: " + getTitle() + "\n Genero: " + getGenre() + "\n Year: " +getYear()+ "\n Creator: "+ getCreator()
                + "\n Duration: " + getDuration();
        
    }

    @Override
    public Date startToSee(Date dateI) {
        
        return dateI;
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {
        if (dateF.getSeconds() > dateI.getSeconds()) {
            setTimeViewed(timeViewed);
        }else{
            setTimeViewed(0);
        }
    }
     
     
     
     
}
package model;

public class Serie extends Film{
    private int id;
    private int sessionQuatity;
    private Chapter[] chapters;

    public Serie(String title, String genre, String creator, int duration, int sessionQuantity) {
        super(title, genre, creator, duration);
        this.sessionQuatity = sessionQuatity;
        
    }
    
    
    @Override
    public String toString(){
        return "\n Title: " +getTitle()+
                "\n Genre: "+ getGenre()+
                "\n Creator: " +getCreator()+
                "\n Duration: " + getDuration()+
                "\n SessionQuantity" + getSessionQuatity();
                
    }
    
    

    public int getId() {
        return id;
    }

    public int getSessionQuatity() {
        return sessionQuatity;
    }

    public void setSessionQuatity(int sessionQuatity) {
        this.sessionQuatity = sessionQuatity;
    }

    public Chapter[] getChapters() {
        return chapters;
    }

    public void setChapters(Chapter[] chapters) {
        this.chapters = chapters;
    }
    
    
   

    
    
    
}

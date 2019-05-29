package model;

import java.util.ArrayList;

public class Serie extends Film{
    private int id;
    private int sessionQuantity;
    private ArrayList<Chapter> chapters;

   public Serie(String title, String genre, String creator, int duration, int sessionQuantity, ArrayList<Chapter> chapters) {
		super(title, genre, creator, duration);
		// TODO Auto-generated constructor stub
		this.sessionQuantity = sessionQuantity;
		this.chapters = chapters;
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
        return sessionQuantity;
    }

    public void setSessionQuatity(int sessionQuatity) {
        this.sessionQuantity = sessionQuatity;
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }
    
    
   public static ArrayList<Serie> makeSeriesList() {
		ArrayList<Serie> series = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			series.add(new Serie("Serie "+i, "genero "+i, "creador "+i, 1200, 5, Chapter.makeChaptersList()));
			
		}
		
		return series;
	}
    
   

    
    
    
}

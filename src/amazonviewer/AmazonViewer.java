
package amazonviewer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import model.Chapter;
import model.Movie;
import model.Serie;


public class AmazonViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        showMenu();   
    }
    
    
    public static void showMenu(){
        Scanner sc=new Scanner(System.in);
        int exit = 0;
        do {
            
            System.out.println("Selecciona el número de la opción deaseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Chapters");
            System.out.println("4. Books");
            System.out.println("5. Magazines");
            System.out.println("6. Report");
            System.out.println("7. Report Today");
            System.out.println("0. exit");
            
            
            
              int enter=sc.nextInt();
        
        switch(enter){
            case 0:
                exit=0;
                break;
            case 1:
                showMovies();
                break;
            case 2:
                showSeries();
                break;
          
            case 3:
                showBooks();
                break;
            case 4:
                showMagazines();
                break;
            case 5:
                //Date date=new Date();
                makeReport(new Date());
                break;
                
            case 6:
                makeReport();
                break;
        }
            
        } while (exit != 0);
        
      
    }
    
    
    public static void showMovies(){
        int exit = 0;
        ArrayList<Movie>movies = Movie.makeMoviesList();

        do {
            System.out.println("");
            System.out.println(":: MOVIES ::");
            System.out.println("");
            for (int i = 0; i < movies.size(); i++) {
                System.out.println(i+1 + "." + movies.get(i).getTitle() + "Visto: " + movies.get(i).isViewed() );
            }
            
            System.out.println("0. Regresar el menú");
            System.out.println("");
            
            Scanner sc = new Scanner(System.in);
            int respose = sc.nextInt();
            
            if (respose == 0) {
                showMenu();
            }
            
            Movie movieSelected = movies.get(respose-1);
            movieSelected.setTimeViewed(1);
            Date dateI = movieSelected.startToSee(new Date());
            for (int i = 0; i < 10000; i++) {
                System.out.println(".......");
            }
            //Termine de verla
            movieSelected.stopToSee(dateI, new Date());
            System.out.println("");
            System.out.println("Viste: " + movieSelected);
            System.out.println("Por: " + movieSelected.getTimeViewed()+ "milisegundos");
            
            
        } while (exit!=0);
        
    }
    
    public static void showSeries(){
        int exit = 0;
        ArrayList<Serie> series = Serie.makeSeriesList();
        do {
            System.out.println("");
            System.out.println("::SERIES::");
            System.out.println("");
            
            for (int i = 0; i < series.size(); i++) {
                System.out.println(i+1 + "." + series.get(i).getTitle()+ "Visto: " + series.get(i).isViewed());
                
            }
            
            System.out.println("0. Regresar al menu");
            System.out.println("");
            
           Scanner sc = new Scanner(System.in);
           int respose = sc.nextInt();
           
            if (respose==0) {
                showMenu();
                
            }
            
            showChapters(series.get(respose-1).getChapters());
           
           
        } while (exit!=0);
        
    }
    
    public static void showChapters(ArrayList<Chapter> chaptersOfSerieSelected){
        int exit = 0;
        do {
            System.out.println("");
            System.out.println("::CHAPTERS::");
            System.out.println("");
            
            for (int i = 0; i < chaptersOfSerieSelected.size(); i++) { //1. Chapter 1
				System.out.println(i+1 + ". " + chaptersOfSerieSelected.get(i).getTitle() + " Visto: " + chaptersOfSerieSelected.get(i).isViewed());
			}
            
            System.out.println("0. Regresar al menú");
            System.out.println("");
            
            Scanner sc = new Scanner(System.in);
            int respose = sc.nextInt();
            
            if (respose==0) {
                showSeries();
            }
            
            Chapter chapterSelected = chaptersOfSerieSelected.get(respose-1);
            chapterSelected.setViewed(true);
            Date dateI=chapterSelected.startToSee(new Date());
            
            for (int i = 0; i < 10000; i++) {
                System.out.println("........");
            }
            
            
            //Terminar de ver:
            chapterSelected.stopToSee(dateI, new Date());
            System.out.println("");
            System.out.println("Viste: " + chapterSelected);
            System.out.println("Por: " + chapterSelected.getTimeViewed() + "milisegundos");
            
        } while (exit!=0);
    }
    
    public static void showBooks(){
        int exit = 0;
        do {
            System.out.println("");
            System.out.println("::BOOKS::");
        } while (exit!=0);
    }
    
    public static void showMagazines(){
        int exit = 0;
        do {
            System.out.println("");
            System.out.println("::MAGAZINES::");
        } while (exit!=0);
    }
    
    public static void makeReport(){
       
    }
    
    public static void makeReport(Date date){
    
    }
}

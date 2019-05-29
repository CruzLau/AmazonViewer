
package amazonviewer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import model.Movie;


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
            case 1:
                showMovies();
                break;
            case 2:
                showSeries();
                break;
                
            case 3:
                showChapters();
                break;
            case 4:
                showBooks();
                break;
            case 5:
                showMagazines();
                break;
            case 6:
                //Date date=new Date();
                makeReport(new Date());
                break;
                
            case 7:
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
        } while (exit!=0);
        
    }
    
    public static void showSeries(){
        int exit = 0;
        do {
            System.out.println("");
            System.out.println("::SERIES::");
        } while (exit!=0);
        
    }
    
    public static void showChapters(){
        int exit = 0;
        do {
            System.out.println("");
            System.out.println("::CHAPTERS::");
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

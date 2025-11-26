import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello: Welcome to the quiz app: ");
        System.out.println("Enter the genre of question: ");
        Scanner sc = new Scanner(System.in);
       String value =  sc.nextLine();
            QuestionService service = new QuestionService(value);
            service.Displayquestions();
               
        
    }
   
}
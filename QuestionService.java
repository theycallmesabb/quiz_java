import java.util.Scanner;
public class QuestionService {
    private String value;
    Questions[] question = new Questions[5];
    Questions[] hhques = new Questions[5];
    Scanner sc = new Scanner(System.in);
    int count = 0;
     
   public QuestionService(String value){
    this.value =value;

    if(value.equalsIgnoreCase("Space")){
   question[0] = new Questions(1,"Which planet is known as the Red Planet?", 
"Mars","Earth","Jupiter","Saturn","Mars");

question[1] = new Questions(2,"Which planet has the most moons?", 
"Saturn","Earth","Venus","Mercury","Saturn");

question[2] = new Questions(3,"What is the name of the galaxy where Earth is located?", 
"Milky Way","Andromeda","Sombrero Galaxy","Whirlpool Galaxy","Milky Way");

question[3] = new Questions(4,"Which planet is the largest in our solar system?", 
"Jupiter","Neptune","Saturn","Uranus","Jupiter");

question[4] = new Questions(5,"What is the name of the first human-made object to land on the Moon?", 
"Luna 2","Apollo 11","Voyager 1","Sputnik 1","Luna 2");

    }
    if(value.equalsIgnoreCase("Hiphop")){
        hhques[0] = new Questions(1,"Which rapper released the album 'Illmatic' in 1994?", 
"Nas","Jay-Z","Biggie","Rakim","Nas");

hhques[1] = new Questions(2,"Which group released the iconic song 'California Love'?", 
"2Pac ft. Dr. Dre","Bone Thugs-N-Harmony","N.W.A","Run DMC","2Pac ft. Dr. Dre");

hhques[2] = new Questions(3,"Which rapper was known as 'The Notorious B.I.G.'?", 
"Biggie Smalls","Ice Cube","Snoop Dogg","DMX","Biggie Smalls");

hhques[3] = new Questions(4,"Which hip-hop duo released the song 'Ms. Jackson'?", 
"Outkast","Mobb Deep","Gang Starr","Public Enemy","Outkast");

hhques[4] = new Questions(5,"Which group is known for the classic track 'C.R.E.A.M.'?", 
"Wu-Tang Clan","A Tribe Called Quest","Beastie Boys","Cypress Hill","Wu-Tang Clan");

    }

   }
    public void Displayquestions(){
        if(value.equalsIgnoreCase("Space")){
        for(int i=0;i<question.length;i++){
            System.out.println(question[i].getQuestion());
            System.out.println(question[i].getOpt1());
            System.out.println(question[i].getOpt2());
            System.out.println(question[i].getOpt3());
            System.out.println(question[i].getOpt4());
            String ans = sc.nextLine(); 
            
            if(ans.equalsIgnoreCase(question[i].getAnswer())){
                System.out.println("You are correct");
                count++;
            }
            else{
                 System.out.println("Wrong! The correct answer is: " + question[i].getAnswer());
            }
            System.out.println();

        }
       
    }
    if(value.equalsIgnoreCase("Hiphop")){
        for(int i=0;i<hhques.length;i++){
            System.out.println(hhques[i].getQuestion());
            System.out.println(hhques[i].getOpt1());
            System.out.println(hhques[i].getOpt2());
            System.out.println(hhques[i].getOpt3());
            System.out.println(hhques[i].getOpt4());
            String ans = sc.nextLine();
            if(ans.equalsIgnoreCase(hhques[i].getAnswer())){
                System.out.println("Correct");
                count++;
            }
           
            
            else{
                 System.out.println("Wrong! The correct answer is: " + hhques[i].getAnswer());
            }
            System.out.println();
        }
    }
        System.out.println("Your Score is: "+count);
    }
}

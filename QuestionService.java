import java.util.Scanner;

public class QuestionService {
    static int questionLength = 5;

    Question[] questions = new Question[questionLength];
    String[] answers = new String[questionLength];

    public QuestionService(){
        questions[0] = new Question(1, "What is the capital of India?", "Delhi", "Mumbai", "Kolkata", "Chennai", "Delhi");
        questions[1] = new Question(2, "What is the capital of Australia?", "Canberra", "Sydney", "Melbourne", "Perth", "Canberra");
        questions[2] = new Question(3, "What is the capital of USA?", "Washington DC", "New York", "Los Angeles", "Chicago", "Washington DC");
        questions[3] = new Question(4, "What is the capital of UK?", "London", "Manchester", "Liverpool", "Birmingham", "London");
        questions[4] = new Question(5, "What is the capital of Canada?", "Ottawa", "Toronto", "Vancouver", "Montreal", "Ottawa");
    }

    public void playQuiz(){

        int it = 0;
        
        for(Question q : questions){
            System.out.println("Question no: " + q.getId());
            System.out.println("Question: " + q.getQuestion());

            System.out.println("Options: " + q.getOpt1() + ", " + q.getOpt2() + ", " + q.getOpt3() + ", " + q.getOpt4());

            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            answers[it++] = answer;

            System.out.println("-------------------");
        }
    }

    public void calculateResult(){
        int quizResult = 0;

        for(int i=0; i<questionLength; i++){

            String actualAnswer = questions[i].getAnswer().toLowerCase();
            String userAnswer = answers[i].toLowerCase();

            if(actualAnswer.equals(userAnswer)){
                quizResult++;
            }
        }

        System.out.println("Your quiz result is: " + quizResult + "/" + questionLength);
    }
};

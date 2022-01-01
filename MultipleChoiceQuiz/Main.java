import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // making the question strings
        String q1 = "What color is the sun?\n"
        + "(a)green\n(b)yellow\n(c)brown";

        String q2 = "What shape is an iphone?\n"
        + "(a)square\n(b)oval\n(c)rectangle";

        // putting the questions & answers in an array
        Question[] questions = {
            new Question(q1, "b"),
            new Question(q2, "c")
        };
        // calling our method with the array
        takeTest(questions);
    }

        // method to take the test
    public static void takeTest(Question[] questions){
        int score = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i].promt);
            String answer = input.nextLine();
            if(answer.equals(questions[i].answer)){
                score++;
            }
        }
        System.out.println("You got " + score + "/" + questions.length);
    }
}

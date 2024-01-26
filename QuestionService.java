import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is the size of the int data type in Java? ", "4 bytes", "8 bytes",
                "2 bytes", "Depends on the system", "1");
        questions[1] = new Question(2, "What does HTML stand for? ", "Hyper Text Markup Language",
                "Highly Typed Machine Learning", "Hyperlink and Text Management Language", "Home Tool Markup Language",
                "1");
        questions[2] = new Question(3, "In CSS, what does the 'C' stand for? ", "Cascading", "Colorful",
                "Computational", "Creative", "1");
        questions[3] = new Question(4, "What does PHP stand for? ", "Personal Home Page", "Hypertext Preprocessor",
                "Private Hypertext Processor", "PHP: Hypertext Programming", "2");
        questions[4] = new Question(5,
                "Which programming language is known for its portability and can be used for both web and mobile development? ",
                "Java", "Python", "C#", "Swift", "1");
    }

    public void displayQuestions() {
        int i = 0;
        for (Question b : questions) {
            System.out.println("Question no :" + b.getId());
            System.out.println(b.getQuestions());
            System.out.println(b.getOpt1());
            System.out.println(b.getOpt2());
            System.out.println(b.getOpt3());
            System.out.println(b.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
            // sc.close();2
        }
        System.out.println();
        System.out.println("User answer is :1");
        for (String s : selection) {
            System.out.println(s);
        }
    }

    public void printScore() {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String answer = que.getAnswer();
            String actualAnswer = selection[i];
            if (actualAnswer.equals(answer)) {
                score = score + 10;
            }
        }
        System.out.println("Score is :" + score + "/50");
        if (score < 50 / 2) {
            System.out.println("So bad Performance, Plz do work hard ");
        } else {
            System.out.println("!Congratulation, You passed the test 🤌");
        }
    }

}

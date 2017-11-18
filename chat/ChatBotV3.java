package chat;

import java.util.Scanner;
import lib.StringArray;

public class ChatBotV3 {


  /**
  carry on a conversation with the user about their personal issues
  @param args an array of Strings which we ignore
  */
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);


    System.out.println("Welcome to the ChatBot Counseling Center!");
    System.out.println("How can I help you?");
    boolean done=false;

    while (!done){
      String userResponse = scanner.nextLine();
      String[] words = userResponse.split("\\s+");
      String myResponse = generateResponse(words);
      System.out.printf("%s%n%n",myResponse);
      done = userResponse.equals("bye");
    }
  }

  /**
    generates a String in response to a user response
    passed in as an array of words
    @param words the user's response
    @return a string responding to the user's words
  */
  public static String generateResponse(String[] words){
    if (words.length <=3) {
      // respond to a short response
      return StringArray.pickRandom(shortResponses);
    } else if (StringArray.intersects(words,familyWords)){
      // respond to a user response mentioning a family member
      return StringArray.pickRandom(familyResponses);
    } else if (Math.random() > 0.5) {
      // 50% of the time pick a random question
      return StringArray.pickRandom(generalQuestions);
    } else {
      // the rest of the time pick a general response
      return StringArray.pickRandom(generalResponses);
    }

  }



  /**
    an array of generic responses to a user comment
  */
  public static String[] generalResponses =
     {
       "Interesting. Please go on ...",
       "I see. Can you tell me more?",
       "Why don't you tell me about your mother.",
       "Have you spoken to your father about this?",
       "Is that right?"
     };

   /**
     an array of responses to a short user comment
   */
   public static String[] shortResponses =
   {
     "Please go on.",
     "I can tell you have more to say about this.",
     "Are you getting annoyed or angry?",
     "And....",
     "I can't help you unless you open up.",
     "You need to trust me if we are going to make any progress."
   };

   /**
     an array of general questions used to change the subject
   */
   public static String[] generalQuestions =
      {
        "If you could fix one thing in your life, what would it be?",
        "Tell me about the happiest time in your life.",
        "Tell me about your first memory.",
        "If you could go anywhere next week, where would you go?",
        "How do you deal with frustration, when things aren't going as you want?"
      };

  /**
    an array of words related to family, that lead to a "familyReponse"
  */
  public static String[] familyWords = {"mom","dad","mother","father",
    "brother","sister"};

  /**
    an array of responses to sentences that contain a family reference
  */
  public static String[] familyResponses =
     {"Tell me about your mom.",
      "What do you like doing with your Dad?",
      "What do your parents do for work?"
    };







}

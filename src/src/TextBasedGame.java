import java.util.Scanner;
import java.util.Random;
import static java.lang.Math.abs;

public class TextBasedGame {
    public static void main(String[] args) {
        System.out.println("In a state of hazy consciousness, you find yourself led into a heavenly wonderland. You attempt to recall the purpose behind your presence here, but your mind remains blank, plagued only by a worsening ache. You decide to walk around. Which direction are you heading to?" + "\n1. north" + "\n2. south" + "\n3. east" + "\n4. west" + "\nPlease indicate the direction you are heading to by entering the corresponding number: ");
        int direction = choice();
        String Direction = "north";
        if ((direction!=1)&&(direction!=2)&&(direction!=3)&&(direction!=4)) {
            System.out.println("This is not a valid option, please choose a direction to go (ō.ō)");
            direction = choice();
        }
        if (direction == 1) {
            Direction = "north";
        }
        if (direction == 2) {
            Direction = "south";
        }
        if (direction == 3) {
            Direction = "east";
        }
        if (direction == 4) {
            Direction = "west";
        }
            System.out.println("You chose to go " + Direction + "! After wandering for a while, you meet a singing octopus on the tree🦑, what do you want to do?" + "\n1. say hi to the wierd octopus" + "\n2. pretend you didn't see him and try to by pass him" + "\n3. praise his voice");
        int octopus = choice();
        int mushroom = 0;
        if ((octopus!=1)&&(octopus!=2)&&(octopus!=3)) {
            System.out.println("Please enter a valid option (ō.Ó) ");
            octopus = choice();
        }
        if (octopus == 2) {
            System.out.println ("The octopus notices and becomes very angry at your impolite behavior. Before his tentacles reach and smash you, time has miraculously reversed backwards to the point when you first meet him, you are givin a second chance. What do you want to do?" + "\n1. say hi to the wierd octopus" + "\n3. praise his voice");
            octopus = choice();
        }if (octopus == 1) {
            System.out.println ("The octopus stops singing and gazes at you with inquisitive eyes, then says: [Hey there, strange creature with four limbs and those not-so-pleasant clothes. You don't seem to belong here. But anyways, as I'm feeling rather benevolent, let me kindly remind you that this is the realm of wonder crafted by Jesus, WHERE EVERYTHING MAY DEFY YOUR USUAL REASONING. Enjoy yourself!] After his last words, his body slowly becomes transparent and dispersal no matter what else you ask him.");
        }if (octopus == 3){
            System.out.println ("The octopus looks at you and says: [Oh hi strange creature with four limbs. Though I don't like your clothes, you have great tastes of sound! I benevolently advise you that this is the realm of wonder crafted by Jesus, WHERE EVERYTHING MAY DEFY YOUR USUAL REASONING. In addition, this world trades in mushrooms. I'll give you 5 mushrooms as a reward for your kind compliments that made my day! Good luck and have fun!] After his last words, his body slowly becomes transparent and dispersal no matter what else you ask him." + "\nCongrats! you now have 5 mushrooms:>");
            mushroom = 5;
        }
        if (mushroom>0){
            System.out.println("What do you want to do?" + "\n1. climb the tree that the octopus was singing on" + "\n2. take a nap" + "\n3. try to eat one currency mushroom" );
        } else{
            System.out.println("What do you want to do?" + "\n1. climb the tree that the octopus was singing on" + "\n2. take a nap" );
        }
        int actionOne = choice();
        boolean Fly = false;
        if (actionOne == 1){
            String reply = "";
            if (mushroom>0){
                reply = "Your body is fine but unfortunately you lose all your mushrooms on the way of falling :(";
            }
            System.out.println("Oops! You accidentally miss your footing when you are climbing and fall into a burrow." + reply );
            mushroom = 0;
        }if (actionOne == 3){
            System.out.println("The mushroom tastes not bad. It is a flavor you never experienced before. Nothing special happens to your body, do you want to eat one more?" + "\n1. yes" + "\n2. no");
            mushroom -= 1;
            int eatingMushroomOne = eatingMushroom();
            if (eatingMushroomOne == 1){
                System.out.println("The second one becomes more tasty. But still, nothing special happens to your body, do you want to eat another one?"+"\n 1. yes"+"\n 2. no");
                mushroom -=1;
                int eatingMushroomTwo = eatingMushroom();
                if (eatingMushroomTwo == 1){
                    System.out.println("Congratulations! You have eaten three mushrooms and you are endowed with the ability to fly!" + "\nDo you want to eat another mushroom?"+"\n 1. yes"+"\n 2. no");
                    mushroom -=1;
                    Fly = true;
                } int eatingMushroomThree = eatingMushroom();
                if (eatingMushroomThree == 1){
                    System.out.println("Nothing else happens to your body. You now have 1 left in your pocket, do you also want to eat that mushroom?"+"\n 1. yes"+"\n 2. no");
                    mushroom -=1;
                }int eatingMushroomFour = eatingMushroom();
                if (eatingMushroomFour == 1){
                    System.out.println("Unfortunately, nothing else happens to your body ;-;");
                    mushroom -=1;
                }
            }
        }if (actionOne == 2){
            if (mushroom>0){
                System.out.println("Oops, all your mushrooms have been stolen when you were sleeping :-(");
            }else System.out.println("You had a great nap, good luck in your future adventure! :)");
        }
        System.out.println("You meet a toad 🐸, try to say something to him. You may get some unexpected surprises. Please enter your words:");
        int toadTimes = 0;
        String toad = toad();
        String toadResponse = toadResponse(toad);
        System.out.println("You: "+toad+"\nToad: "+toadResponse);
        System.out.println("Do you want to say something more to the toad?"+"\n1. yes"+"\n2. no");
        toadTimes++;
        int toadchoice = choice();
        for (toadchoice = 1; 2 != toadchoice; toadchoice-= 0) {
            System.out.println("Please enter your words:");
            toad = toad();
            toadResponse = toadResponse(toad);
            System.out.println("You: "+toad+"\nToad: "+toadResponse);
            System.out.println("Do you want to say something more to the toad?"+"\n1. yes"+"\n2. no");
            toadchoice = choice();
            toadTimes++;
            if (toadTimes == 3){
                System.out.println("Toad: Aww thank you kind traveller, you helped me break the curse! Can't even remember the last time I was able to speak freely. To show my gratitude, I've doubled the number of mushrooms in your pocket🍄 In case you don't know or forgot, mushroom is the currency in this world :)");
                mushroom *= 2;
                toadTimes++;
                System.out.println("You now have "+mushroom+" mushrooms in your pocket, good luck in your future adventure:>");
                toadchoice=3;
            }
        }
        System.out.println("You wander for a while and get a little bit exhausted. There is a nice and safe cave in front of you, do you want to have a rest inside?" + "\n1. yes"+ "\n2. no");
        int cave = choice();
        if (cave == 1){
            System.out.println("Unfortunately, it is the mouth of a giant hippopotamus and you have been eaten by it. But fortunately, you have been given to an revival opportunity. Do you want to spend 3 mushrooms to buy a revival potion, you now have "+ mushroom +" mushrooms."+"\n1. yes"+"\n2. no");
            int potionChoice = choice();
            if (potionChoice==2){
                System.out.println("You died from being eaten by a hippopotamus🦛. Nice game and hope you enjoy it!");
                System.exit(0);
            }if ((potionChoice==1)&&(mushroom<3)){
                System.out.println("Unfortunately, you do not have enough mushrooms to buy the rivival potion. You died from being eaten by a hippopotamus🦛. Nice game and hope you enjoy it!");
                System.exit(0);
            }
            if ((potionChoice==1)&&(mushroom>=3)){
                System.out.println("Yay you have successfully revived!");
                mushroom -= 3;
            }
        }
        int[] choices = new int[]{1, 2, 3};
        Random Sheepchoice = new Random();
        int sheepChoice = Sheepchoice.nextInt(choices.length);
        String SheepChoice = gesture (sheepChoice);
        int sheepTimes = 0;
        System.out.println("You meet a blackhead sheep. She invites you to play rock, paper, scissor with her. Her choice is " + SheepChoice + ", which one are you going to choose?"+"\n1. rock"+"\n2. paper"+"\n3. scissor");
        int yourChoice = choice();
        String YourChoice = gesture (yourChoice);
        boolean win = win (sheepChoice, yourChoice);
        boolean irritatedSheep = false;
        if (win){
            mushroom += 5;
            System.out.println("Your choice:"+YourChoice+"\nBlackhead sheep choice:"+SheepChoice+"\nCongrats! You've won the game! Feeling confused? Remember that this is the realm of wonder crafted by Jesus, WHERE EVERYTHING MAY DEFY YOUR USUAL REASONING. As a reward, you gained 5 more mushrooms :D");
            sheepTimes ++;
        } else {
            mushroom -= 3;
            System.out.println("Your choice:"+YourChoice+"\nBlackhead sheep choice:"+SheepChoice+"\nOhnooo, You've lost the game... Feeling confused? Remember that this is the realm of wonder crafted by Jesus, WHERE EVERYTHING MAY DEFY YOUR USUAL REASONING. As a cost, you lost 3 mushrooms D:");
        }
        System.out.println("You now have "+mushroom+" mushrooms, do you want to play another game with blackhead sheep? More game experience may help you win more mushrooms :> \nPlease enter your choice: \n1. yes \n2. no");
        int gameChoice = choice();
        for (gameChoice = 1; 2 != gameChoice; gameChoice -= 0) {
            int[] Choice = new int[]{1, 2, 3};
            Random Shchoice = new Random();
            int shchoice = Shchoice.nextInt(Choice.length);
            String shpchoice = gesture (shchoice);
            System.out.println("Blackhead sheep's choice is " + shpchoice +", which one do you choose? \n1. rock \n2. paper \n3. scissor");
            yourChoice = choice();
            YourChoice = gesture (yourChoice);
            win = win (shchoice, yourChoice);
            sheepTimes ++;
            if (win){
                mushroom += 5;
                System.out.println("Your choice:"+YourChoice+"\nBlackhead sheep choice:"+shpchoice+"\nCongrats! You've won the game! Feeling confused? Remember that this is the realm of wonder crafted by Jesus, WHERE EVERYTHING MAY DEFY YOUR USUAL REASONING. As a reward, you gained 5 more mushrooms :D");
                sheepTimes ++;
            } else {
                mushroom -= 3;
                System.out.println("Your choice:"+YourChoice+"\nBlackhead sheep choice:"+shpchoice+"\nOhnooo, You've lost the game... Feeling confused? Remember that this is the realm of wonder crafted by Jesus, WHERE EVERYTHING MAY DEFY YOUR USUAL REASONING. As a cost, you lost 3 mushrooms D:");
            }
            System.out.println("You now have "+mushroom+" mushrooms, do you want to play another game with blackhead sheep? More game experience may help you win more mushrooms :> \nPlease enter your choice: \n1. yes \n2. no");
            gameChoice = choice();
            if (sheepTimes == 3){
                irritatedSheep = true;
                gameChoice = 2;
            }
        }
        if (irritatedSheep){
            System.out.println("You've won too many rounds! The irritated blackhead sheep steals all your money and flees away. Do you want to fly to chase her and get your money back? \n1. yes \n2.no");
            int chaseChoice = choice();
            if (chaseChoice == 1){
                if (Fly){
                    System.out.println("Yayyay! Since you previously unlocked the ability to fly, you have successfully chased your money back and get 10 extra mushrooms🍄!");
                    mushroom += 10;
                }else {
                    System.out.println("Sorry but you haven't unlocked the ability to fly, do you want to spend 6 mushrooms to unlock it now? you now have "+ mushroom +" mushrooms.\"Please enter your choice: \n1. yes \n2. no");
                    int flyChoice = choice();
                    if (flyChoice == 1){
                        if (mushroom >= 6){
                            mushroom -= 6;
                            Fly = true;
                            System.out.println ("Yayyay you have successfully unlocked the ability to fly, chased your money back, and get 10 extra mushrooms🍄!");
                            mushroom += 10;
                        } System.out.println("Oops, sorry that you don't have enough mushrooms to unlock the ability to fly D:");
                    }
                }
            }else{
                System.out.println("hmmm, okay, you just calmly watched the blackhead sheep stealing away all your money.");
            }
        }
        int moaiNumber = moai(mushroom);
        System.out.println("You wandered for a while and met a Moai🗿. It opens its eyes when you get close to it and says: 'Give me "+moaiNumber+" mushrooms and I can tell you the truth about why you're here, do you want to trade?'you now have "+ mushroom +" mushrooms. \nPlease enter your choice: \n1.yes \n2.no");
        int moaiChoice = choice();
        if (moaiChoice == 1){
            System.out.println("Oops, Moai🗿 is actually a fraud and you get nothing in return D: \nAfter consuming the mushrooms you gave him, he then opens his mouth and eats you OqO");
            mushroom -= moaiNumber;
        } else System.out.println ("Moai gets angry because you refused to trade with him. He opens his mouth and eats you OqO");
        System.out.println("You get to the inside of Moai where the structure is like a temple with lots of coconuts on the ground. There's a hole in front of you with an indicator written with words that \n'Dear traveler, welcome to the Moai temple. If you pass this challenge, you will return to your world with all the wealth of this wonderland. However, there is no turning back once you're here. Therefore, you can only win the challenge or die. Good luck :D' \n'Please try to input some coconuts inside hole, observe and find the rule of the output coconut numbers🥥.' \nPlease enter the number of coconuts that you would like to put in:");
        int coconutnumber1 = choice();
        int coconutoutput1 = coconut(coconutnumber1);
        String floormovement = "rises";
        if (coconutoutput1>=coconutnumber1){
            floormovement = "loweres";
        }
        int metermovement1 = metermovement(coconutnumber1, coconutoutput1);
        System.out.println("You've put in "+coconutnumber1+" coconuts and it returns you "+coconutoutput1+" coconuts. The floor "+floormovement+" "+metermovement1+" meters. Take a few more attempts to confirm the rule you observed. \nPlease enter the number of coconuts that you would like to put in:");
        int coconutnumber2 = choice();
        int coconutoutput2 = coconut(coconutnumber2);
        floormovement = "rises";
        if (coconutoutput2>=coconutnumber2){
            floormovement = "loweres";
        }
        int metermovement2 = metermovement(coconutnumber2, coconutoutput2);
        System.out.println("You've put in "+coconutnumber2+" coconuts and it returns you "+coconutoutput2+" coconuts. The floor "+floormovement+" "+metermovement2+" meters. Take a few more attempts to confirm the rule you observed. \nPlease enter the number of coconuts that you would like to put in:");
        int coconutnumber3 = choice();
        int coconutoutput3 = coconut(coconutnumber3);
        floormovement = "rises";
        if (coconutoutput3>=coconutnumber3){
            floormovement = "loweres";
        }
        int metermovement3 = metermovement(coconutnumber3, coconutoutput3);
        System.out.println("You've put in "+coconutnumber3+" coconuts and it returns you "+coconutoutput3+" coconuts. The floor "+floormovement+" "+metermovement3+" meters. \nThe floor-level of exit is 8 meters above you. Please put in the correct number of coconuts into the hole to reach it: ");
        int coconutnumber4 = choice();
        int coconutoutput4 = coconut(coconutnumber4);
        int difference = abs(8-coconutoutput4);
        int metermovement4 = metermovement(coconutnumber4, coconutoutput4);
        int awayfromexit = abs(8-metermovement4);
        boolean coconutchallenge = false;
        if ((coconutoutput4<=coconutnumber4)&&(metermovement4==8)){
            coconutchallenge = true;
        }
        if (coconutchallenge){
            System.out.println("Congratulations! You have passed the challenge and returned to your world with all the wealth of this wonderland!!! Hope you enjoy your adventure :D");
            System.exit(0);
        }else{
            boolean pingu = false;
            if ((pingu(mushroom)%3)==0){
                pingu = true;
            }
            if (metermovement4>8){
                System.out.println("Ohnooo, incorrect number of input coconuts. You have risen the floor level for "+metermovement4+" meters and is now " + awayfromexit+ " meters about the exit D:");
            }
            if (metermovement4<8){
                System.out.println("Ohnooo, incorrect number of input coconuts. You have only risen the floor level for "+metermovement4+" meters and is still " + awayfromexit+ " meters away from the exitD:. Fortunately, you can fly to the exit, or else you will stuck till death at this place. \nPlease enter your choice \n1. I would like to fly to the exit \n2. Hmmm, I will just stay here and see if there will be a miracle that saves me");
                int lowerChoice = choice();
                if ((lowerChoice==1)&&(Fly)){
                    System.out.println("Congratulations! You have successfully flied to the exit and returned to your world with all the wealth of this wonderland!!! Nice game and hope you enjoy it! :D");
                    System.exit(0);
                } else if ((lowerChoice==1)&&(!Fly)){
                    System.out.println("Sorry but you haven't unlocked the ability to fly, do you want to spend 6 mushrooms to unlock it now? you now have "+ mushroom +" mushrooms.\"Please enter your choice: \n1. yes \n2. no");
                    int flyChoice = choice();
                    if (flyChoice == 1){
                        if (mushroom >= 6){
                            mushroom -= 6;
                            Fly = true;
                            System.out.println ("Yayyay you have successfully unlocked the ability to fly, flied to the exit and returned to your world with all the wealth of this wonderland!!! Nice game and hope you enjoy it! :D");
                            System.exit(0);
                        } else System.out.println("Oops, sorry that you don't have enough mushrooms to unlock the ability to fly D: ");
                    }
                }
                if (pingu){
                    System.out.println("Luckily, a pingu god occurs above your head and says: ‘Oh poor traveler, you seem to be stuck at here. Do you want to spend 4 mushrooms to get my help to the exit?’ you now have "+ mushroom +" mushrooms.\"\nPlease enter your choice \n1.yes \n2.no");
                    int pinguchoice = choice();
                    if (pinguchoice==1){
                        if (mushroom>=4){
                            System.out.println("Thankfully, you have enough mushrooms to pay pingu god's help. You have successfully arrived at the exit and returned to your world with all the wealth of this wonderland!!! Nice game and hope you enjoy it! :D");
                            System.exit(0);
                        }else System.out.println ("Ohnoo, sorry that you don't have enough mushrooms to pay pingu god's help ;-;");
                    }
                }
            }
        System.out.println("Sadly, you have been stuck in the temple till death💀 Nice game and hope you enjoy it!");
        }
    }

    public static int choice() {
        Scanner actionOne = new Scanner(System.in);
        return actionOne.nextInt();
    }
    public static int eatingMushroom() {
        Scanner eatingMushroom = new Scanner(System.in);
        return eatingMushroom.nextInt();
    }
    public static String toad(){
        Scanner toad = new Scanner(System.in);
        return toad.nextLine();
    }
    public static String toadResponse(String yourWord){
        return yourWord+yourWord+yourWord;
    }
    public static boolean win(int sheepChoice, int yourChoice){
        if (sheepChoice==yourChoice){
            return true;
        } else if (yourChoice==3&&sheepChoice!=1&&sheepChoice!=2){
            return true;
        }
        return false;
    }
    public static String gesture(int choice){
        if (choice==1){
            return "rock";
        }if (choice==2){
            return "paper";
        }return "scissor";
    }
    public static int moai(int mushroom){
        return (mushroom/10)*10;
    }
    public static int coconut(int inputnumber){
        return (inputnumber%10)+2;
    }
    public static int metermovement(int input, int output){
        return abs(output-input);
    }
    public static int pingu(int mushroom){
        return (mushroom%10);
    }
}

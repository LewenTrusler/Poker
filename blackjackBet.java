import java.awt.Font;
import java.util.concurrent.TimeUnit;

public class blackjackBet {
    public static void main(String[] args)throws InterruptedException{
        StdOut.println("Enter the amount of chips you would like to buy: ");
        double balance=StdIn.readDouble();
        StdOut.println("Welcome to my blackjack game.");
        StdOut.println("Due to complexity, there will be no splitting and Ace will always be worth 11.");
        StdOut.println("The dealer wins any ties.");
        StdOut.println("Otherwise, rules stay the same. Good luck!");
        TimeUnit.SECONDS.sleep(3);
        String play="yes";
while(!play.equals("no")){
        double bet=0;
        StdOut.println("Your balance is: "+"$"+balance+"0");
        StdOut.println("Enter the amount you would like to bet (0, 1, 5, 10, 20, 50): ");
        bet=StdIn.readDouble();
        while(bet>balance){
            StdOut.println("Insufficent funds, please enter a new amount to bet: ");
            bet=StdIn.readDouble();
        }
        StdDraw.setPenColor(5, 100, 5);
        StdDraw.filledSquare(0.5, 0.5, 0.5);
        StdDraw.setPenColor(255,255,255);
        StdDraw.filledRectangle(0.42, 0.2, 0.064, 0.1);
        StdDraw.filledRectangle(0.58, 0.2, 0.064, 0.1);
        StdDraw.filledRectangle(0.42, 0.8, 0.064, 0.1);
        StdDraw.filledRectangle(0.58, 0.8, 0.064, 0.1);
        StdDraw.setPenColor(200, 5, 5);
        StdDraw.filledRectangle(0.58, 0.8, 0.05, 0.079);
        StdDraw.setPenColor(0,0,0);
        Font fon = new Font("Arial", Font.BOLD, 15);
        StdDraw.setFont(fon);
        StdDraw.text(0.58, 0.8, "LT");
        StdDraw.setPenColor(255,255,255);
        StdDraw.text(.85, .03, "Balance: "+"$"+balance+"0");
        Font fo = new Font("Arial", Font.BOLD, 10);
        StdDraw.setFont(fo);
        if (bet==1){
    StdDraw.setPenColor(200,200,200);
    StdDraw.filledEllipse(0.5, 0.5, .05, .0475);
    StdDraw.setPenColor(0, 0, 0);
    StdDraw.setPenRadius(0.002);
    StdDraw.ellipse(0.5, 0.5075, .05,.0475);
    StdDraw.ellipse(0.5, 0.5, .05, .0475);
    StdDraw.setPenColor(255,255,255);
    StdDraw.filledEllipse(0.5, 0.5075, .05, .0475);
    StdDraw.setPenColor(5,5,200);
    StdDraw.filledEllipse(0.5, 0.5075, .0425, .040375);
    StdDraw.setPenColor(255,255,255);
    StdDraw.filledEllipse(0.5, 0.5075, .035, .03325);
    StdDraw.setPenColor(0, 0, 0);
    StdDraw.text(0.5, 0.507, "$1.00");
        }
        if (bet==5){
            StdDraw.setPenColor(200,200,200);
            StdDraw.filledEllipse(0.5, 0.5, .05, .0475);
            StdDraw.setPenColor(0, 0, 0);
            StdDraw.setPenRadius(0.002);
            StdDraw.ellipse(0.5, 0.5075, .05,.0475);
            StdDraw.ellipse(0.5, 0.5, .05, .0475);
            StdDraw.setPenColor(255,255,255);
            StdDraw.filledEllipse(0.5, 0.5075, .05, .0475);
            StdDraw.setPenColor(170,0,255);
            StdDraw.filledEllipse(0.5, 0.5075, .0425, .040375);
            StdDraw.setPenColor(255,255,255);
            StdDraw.filledEllipse(0.5, 0.5075, .035, .03325);
            StdDraw.setPenColor(0, 0, 0);
            StdDraw.text(0.5, 0.507, "$5.00");
                }
                if (bet==10){
                    StdDraw.setPenColor(200,200,200);
                    StdDraw.filledEllipse(0.5, 0.5, .05, .0475);
                    StdDraw.setPenColor(0, 0, 0);
                    StdDraw.setPenRadius(0.002);
                    StdDraw.ellipse(0.5, 0.5075, .05,.0475);
                    StdDraw.ellipse(0.5, 0.5, .05, .0475);
                    StdDraw.setPenColor(255,255,255);
                    StdDraw.filledEllipse(0.5, 0.5075, .05, .0475);
                    StdDraw.setPenColor(162,0,37);
                    StdDraw.filledEllipse(0.5, 0.5075, .0425, .040375);
                    StdDraw.setPenColor(255,255,255);
                    StdDraw.filledEllipse(0.5, 0.5075, .035, .03325);
                    StdDraw.setPenColor(0, 0, 0);
                    StdDraw.text(0.5, 0.507, "$10.00");
                        }
                        if (bet==20){
                            StdDraw.setPenColor(200,200,200);
                            StdDraw.filledEllipse(0.5, 0.5, .05, .0475);
                            StdDraw.setPenColor(0, 0, 0);
                            StdDraw.setPenRadius(0.002);
                            StdDraw.ellipse(0.5, 0.5075, .05,.0475);
                            StdDraw.ellipse(0.5, 0.5, .05, .0475);
                            StdDraw.setPenColor(255,255,255);
                            StdDraw.filledEllipse(0.5, 0.5075, .05, .0475);
                            StdDraw.setPenColor(227,200,0);
                            StdDraw.filledEllipse(0.5, 0.5075, .0425, .040375);
                            StdDraw.setPenColor(255,255,255);
                            StdDraw.filledEllipse(0.5, 0.5075, .035, .03325);
                            StdDraw.setPenColor(0, 0, 0);
                            StdDraw.text(0.5, 0.507, "$20.00");
                                }
                                if (bet==50){
                                    StdDraw.setPenColor(200,200,200);
                                    StdDraw.filledEllipse(0.5, 0.5, .05, .0475);
                                    StdDraw.setPenColor(0, 0, 0);
                                    StdDraw.setPenRadius(0.002);
                                    StdDraw.ellipse(0.5, 0.5075, .05,.0475);
                                    StdDraw.ellipse(0.5, 0.5, .05, .0475);
                                    StdDraw.setPenColor(255,255,255);
                                    StdDraw.filledEllipse(0.5, 0.5075, .05, .0475);
                                    StdDraw.setPenColor(255,102,0);
                                    StdDraw.filledEllipse(0.5, 0.5075, .0425, .040375);
                                    StdDraw.setPenColor(255,255,255);
                                    StdDraw.filledEllipse(0.5, 0.5075, .035, .03325);
                                    StdDraw.setPenColor(0, 0, 0);
                                    StdDraw.text(0.5, 0.507, "$50.00");
                                        }
        StdDraw.setPenColor(0,0,0);
        Font font = new Font("Arial", Font.BOLD, 55);
        StdDraw.setFont(font);
        String[] red={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] black={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        double color=Math.random();
        int total=0;
        if (color<0.5){
            double card=(int)(Math.random()*12);
            int value;
            if(card<9){
                value=(int)card+2;
            } else if (card<12){
                value=10;
            } else {
                value=11;
            }
            total+=value;
            StdDraw.setPenColor(200, 5, 5);
            StdDraw.text(0.42,0.19,red[(int)card]);

        } else{
            double card=(int)(Math.random()*12);
            int value;
            if(card<9){
                value=(int)card+2;
            } else if (card<12){
                value=10;
            } else {
                value=11;
            }
            total+=value;
            StdDraw.setPenColor(0, 0, 0);
            StdDraw.text(0.42,0.19,black[(int)card]);
        }
        double c2=Math.random();
        if (c2<0.5){
            double card;
            if (total<11){
            card=(int)(Math.random()*12);}
            else{card=(int)(Math.random()*11);}
            int value;
            if(card<9){
                value=(int)card+2;
            } else if (card<12){
                value=10;
            } else {
                value=11;
            }
            total+=value;
            StdDraw.setPenColor(200, 5, 5);
            StdDraw.text(0.58,0.19,red[(int)card]);

        } else{
            double card;
            if (total<11){
            card=(int)(Math.random()*12);}
            else{card=(int)(Math.random()*11);}
            int value;
            if(card<9){
                value=(int)card+2;
            } else if (card<12){
                value=10;
            } else {
                value=11;
            }
            total+=value;
            StdDraw.setPenColor(0, 0, 0);
            StdDraw.text(0.58,0.19,black[(int)card]);
        }

        int t2=0;
        color=Math.random();
        if (color<0.5){
            double card=(int)(Math.random()*12);
            int value;
            if(card<9){
                value=(int)card+2;
            } else if (card<12){
                value=10;
            } else {
                value=11;
            }
            t2+=value;
            StdDraw.setPenColor(200, 5, 5);
            StdDraw.text(0.42,0.79,red[(int)card]);

        } else{
            double card=(int)(Math.random()*12);
            int value;
            if(card<9){
                value=(int)card+2;
            } else if (card<12){
                value=10;
            } else {
                value=11;
            }
            t2+=value;
            StdDraw.setPenColor(0, 0, 0);
            StdDraw.text(0.42,0.79,black[(int)card]);
        }
        StdOut.println("--------------------------------------------------------");
        StdOut.println("Your total is: "+total);
        StdOut.println("Would you like to hit, stand, or double-down: ");
        String decision=StdIn.readString();
        if (decision.equals("double-down")&&balance>=bet*2){
            Font f = new Font("Arial", Font.BOLD, 10);
        StdDraw.setFont(f);
        if (bet==1){
    StdDraw.setPenColor(200,200,200);
    StdDraw.filledEllipse(0.61, 0.5, .05, .0475);
    StdDraw.setPenColor(0, 0, 0);
    StdDraw.setPenRadius(0.002);
    StdDraw.ellipse(0.61, 0.5075, .05,.0475);
    StdDraw.ellipse(0.61, 0.5, .05, .0475);
    StdDraw.setPenColor(255,255,255);
    StdDraw.filledEllipse(0.61, 0.5075, .05, .0475);
    StdDraw.setPenColor(5,5,200);
    StdDraw.filledEllipse(0.61, 0.5075, .0425, .040375);
    StdDraw.setPenColor(255,255,255);
    StdDraw.filledEllipse(0.61, 0.5075, .035, .03325);
    StdDraw.setPenColor(0, 0, 0);
    StdDraw.text(0.61, 0.507, "$1.00");
        }
        if (bet==5){
            StdDraw.setPenColor(200,200,200);
            StdDraw.filledEllipse(0.61, 0.5, .05, .0475);
            StdDraw.setPenColor(0, 0, 0);
            StdDraw.setPenRadius(0.002);
            StdDraw.ellipse(0.61, 0.5075, .05,.0475);
            StdDraw.ellipse(0.61, 0.5, .05, .0475);
            StdDraw.setPenColor(255,255,255);
            StdDraw.filledEllipse(0.61, 0.5075, .05, .0475);
            StdDraw.setPenColor(170,0,255);
            StdDraw.filledEllipse(0.61, 0.5075, .0425, .040375);
            StdDraw.setPenColor(255,255,255);
            StdDraw.filledEllipse(0.61, 0.5075, .035, .03325);
            StdDraw.setPenColor(0, 0, 0);
            StdDraw.text(0.61, 0.507, "$5.00");
                }
                if (bet==10){
                    StdDraw.setPenColor(200,200,200);
                    StdDraw.filledEllipse(0.61, 0.5, .05, .0475);
                    StdDraw.setPenColor(0, 0, 0);
                    StdDraw.setPenRadius(0.002);
                    StdDraw.ellipse(0.61, 0.5075, .05,.0475);
                    StdDraw.ellipse(0.61, 0.5, .05, .0475);
                    StdDraw.setPenColor(255,255,255);
                    StdDraw.filledEllipse(0.61, 0.5075, .05, .0475);
                    StdDraw.setPenColor(162,0,37);
                    StdDraw.filledEllipse(0.61, 0.5075, .0425, .040375);
                    StdDraw.setPenColor(255,255,255);
                    StdDraw.filledEllipse(0.61, 0.5075, .035, .03325);
                    StdDraw.setPenColor(0, 0, 0);
                    StdDraw.text(0.61, 0.507, "$10.00");
                        }
                        if (bet==20){
                            StdDraw.setPenColor(200,200,200);
                            StdDraw.filledEllipse(0.61, 0.5, .05, .0475);
                            StdDraw.setPenColor(0, 0, 0);
                            StdDraw.setPenRadius(0.002);
                            StdDraw.ellipse(0.61, 0.5075, .05,.0475);
                            StdDraw.ellipse(0.61, 0.5, .05, .0475);
                            StdDraw.setPenColor(255,255,255);
                            StdDraw.filledEllipse(0.61, 0.5075, .05, .0475);
                            StdDraw.setPenColor(227,200,0);
                            StdDraw.filledEllipse(0.61, 0.5075, .0425, .040375);
                            StdDraw.setPenColor(255,255,255);
                            StdDraw.filledEllipse(0.61, 0.5075, .035, .03325);
                            StdDraw.setPenColor(0, 0, 0);
                            StdDraw.text(0.61, 0.507, "$20.00");
                                }
                                if (bet==50){
                                    StdDraw.setPenColor(200,200,200);
                                    StdDraw.filledEllipse(0.61, 0.5, .05, .0475);
                                    StdDraw.setPenColor(0, 0, 0);
                                    StdDraw.setPenRadius(0.002);
                                    StdDraw.ellipse(0.61, 0.5075, .05,.0475);
                                    StdDraw.ellipse(0.61, 0.5, .05, .0475);
                                    StdDraw.setPenColor(255,255,255);
                                    StdDraw.filledEllipse(0.61, 0.5075, .05, .0475);
                                    StdDraw.setPenColor(255,102,0);
                                    StdDraw.filledEllipse(0.61, 0.5075, .0425, .040375);
                                    StdDraw.setPenColor(255,255,255);
                                    StdDraw.filledEllipse(0.61, 0.5075, .035, .03325);
                                    StdDraw.setPenColor(0, 0, 0);
                                    StdDraw.text(0.61, 0.507, "$50.00");
                                        }
            bet=bet+bet;
            StdDraw.setPenColor(255,255,255);
                StdDraw.filledRectangle(0.74, 0.2, 0.064, 0.1);
                StdDraw.setFont(font);
                color=Math.random();
                if (color<0.5){
                    double card=(int)(Math.random()*12);
                    int value;
                    if(card<9){
                        value=(int)card+2;
                    } else if (card<12){
                        value=10;
                    } else {
                        value=11;
                    }
                    total+=value;
                    StdDraw.setPenColor(200, 5, 5);
                    StdDraw.text(0.74,0.19,red[(int)card]);
        
                } else{
                    double card=(int)(Math.random()*12);
                    int value;
                    if(card<9){
                        value=(int)card+2;
                    } else if (card<12){
                        value=10;
                    } else {
                        value=11;
                    }
                    total+=value;
                    StdDraw.setPenColor(0, 0, 0);
                    StdDraw.text(0.74,0.19,black[(int)card]);
                    decision="stand";
        }}else {
            if (decision.equals("double-down")){
            StdOut.println("You do not have enough to double down, choose to hit or stand: ");
            decision=StdIn.readString();
            }
        while (!decision.equals("stand")&&total<=21){
            if(decision.equals("hit")){
                StdDraw.setPenColor(255,255,255);
                StdDraw.filledRectangle(0.74, 0.2, 0.064, 0.1);
                color=Math.random();
                if (color<0.5){
                    double card=(int)(Math.random()*12);
                    int value;
                    if(card<9){
                        value=(int)card+2;
                    } else if (card<12){
                        value=10;
                    } else {
                        value=11;
                    }
                    total+=value;
                    StdDraw.setPenColor(200, 5, 5);
                    StdDraw.text(0.74,0.19,red[(int)card]);
        
                } else{
                    double card=(int)(Math.random()*12);
                    int value;
                    if(card<9){
                        value=(int)card+2;
                    } else if (card<12){
                        value=10;
                    } else {
                        value=11;
                    }
                    total+=value;
                    StdDraw.setPenColor(0, 0, 0);
                    StdDraw.text(0.74,0.19,black[(int)card]);
                } if (total<=21){
                StdOut.println("Your total is: "+total);
                StdOut.println("Would you like to hit or stand: ");
                decision=StdIn.readString();
                } else{
                    decision="stand";
                }


            }
            if(decision.equals("hit")){
                StdDraw.setPenColor(255,255,255);
                StdDraw.filledRectangle(0.26, 0.2, 0.064, 0.1);
                color=Math.random();
                if (color<0.5){
                    double card=(int)(Math.random()*12);
                    int value;
                    if(card<9){
                        value=(int)card+2;
                    } else if (card<12){
                        value=10;
                    } else {
                        value=11;
                    }
                    total+=value;
                    StdDraw.setPenColor(200, 5, 5);
                    StdDraw.text(0.26,0.19,red[(int)card]);
        
                } else{
                    double card=(int)(Math.random()*12);
                    int value;
                    if(card<9){
                        value=(int)card+2;
                    } else if (card<12){
                        value=10;
                    } else {
                        value=11;
                    }
                    total+=value;
                    StdDraw.setPenColor(0, 0, 0);
                    StdDraw.text(0.26,0.19,black[(int)card]);
                } if (total<=21){
                StdOut.println("Your total is: "+total);
                StdOut.println("Would you like to hit or stand: ");
                decision=StdIn.readString();
                } else{
                    decision="stand";
                }


            }
            if(decision.equals("hit")){
                StdDraw.setPenColor(255,255,255);
                StdDraw.filledRectangle(0.9, 0.2, 0.064, 0.1);
                color=Math.random();
                if (color<0.5){
                    double card=(int)(Math.random()*12);
                    int value;
                    if(card<9){
                        value=(int)card+2;
                    } else if (card<12){
                        value=10;
                    } else {
                        value=11;
                    }
                    total+=value;
                    StdDraw.setPenColor(200, 5, 5);
                    StdDraw.text(0.9,0.19,red[(int)card]);
        
                } else{
                    double card=(int)(Math.random()*12);
                    int value;
                    if(card<9){
                        value=(int)card+2;
                    } else if (card<12){
                        value=10;
                    } else {
                        value=11;
                    }
                    total+=value;
                    StdDraw.setPenColor(0, 0, 0);
                    StdDraw.text(0.9,0.19,black[(int)card]);
                } if (total<=21){
                StdOut.println("Your total is: "+total);
                StdOut.println("Would you like to hit or stand: ");
                decision=StdIn.readString();
                } else{
                    decision="stand";
                }


            }
            if(decision.equals("hit")){
                StdDraw.setPenColor(255,255,255);
                StdDraw.filledRectangle(0.1, 0.2, 0.064, 0.1);
                color=Math.random();
                if (color<0.5){
                    double card=(int)(Math.random()*12);
                    int value;
                    if(card<9){
                        value=(int)card+2;
                    } else if (card<12){
                        value=10;
                    } else {
                        value=11;
                    }
                    total+=value;
                    StdDraw.setPenColor(200, 5, 5);
                    StdDraw.text(0.1,0.19,red[(int)card]);
        
                } else{
                    double card=(int)(Math.random()*12);
                    int value;
                    if(card<9){
                        value=(int)card+2;
                    } else if (card<12){
                        value=10;
                    } else {
                        value=11;
                    }
                    total+=value;
                    StdDraw.setPenColor(0, 0, 0);
                    StdDraw.text(0.1,0.19,black[(int)card]);
                } if (total<=21){
                StdOut.println("Your total is: "+total);
                decision="stand";
                } else{
                    decision="stand";
                }


            }
        }
    
            

        }
        if(total>21){
            StdOut.println("You lost!");
            balance=balance-bet;
        } else {
            StdOut.println("It is now the dealers turn");
            TimeUnit.SECONDS.sleep(2);
            StdDraw.setPenColor(255,255,255);
            StdDraw.filledRectangle(0.58, 0.8, 0.064, 0.1);
            color=Math.random();
        if (color<0.5){
            double card;
            if (total<11){
            card=(int)(Math.random()*12);}
            else{card=(int)(Math.random()*11);}
            int value;
            if(card<9){
                value=(int)card+2;
            } else if (card<12){
                value=10;
            } else {
                value=11;
            }
            t2+=value;
            StdDraw.setPenColor(200, 5, 5);
            StdDraw.text(0.58,0.79,red[(int)card]);

        } else{
            double card;
            if (total<11){
            card=(int)(Math.random()*12);}
            else{card=(int)(Math.random()*11);}
            int value;
            if(card<9){
                value=(int)card+2;
            } else if (card<12){
                value=10;
            } else {
                value=11;
            }
            t2+=value;
            StdDraw.setPenColor(0, 0, 0);
            StdDraw.text(0.58,0.79,black[(int)card]);
        }
        if (t2>16){
            TimeUnit.SECONDS.sleep(1);
        StdOut.println("You have: "+total);
        StdOut.println("The dealer has: "+t2);
    if(total>t2){
        StdOut.println("You win!");
        balance=balance+bet;
    } else{
        StdOut.println("You lose!");
        balance=balance-bet;
    }
        } else{
        String deal=" ";
        while (!deal.equals("over")){
        if (t2<17){
            TimeUnit.SECONDS.sleep(2);
            StdDraw.setPenColor(255,255,255);
            StdDraw.filledRectangle(0.74, 0.8, 0.064, 0.1);
            color=Math.random();
        if (color<0.5){
            double card=(int)(Math.random()*12);
            int value;
            if(card<9){
                value=(int)card+2;
            } else if (card<12){
                value=10;
            } else {
                value=11;
            }
            t2+=value;
            StdDraw.setPenColor(200, 5, 5);
            StdDraw.text(0.74,0.79,red[(int)card]);

        } else{
            double card=(int)(Math.random()*12);
            int value;
            if(card<9){
                value=(int)card+2;
            } else if (card<12){
                value=10;
            } else {
                value=11;
            }
            t2+=value;
            StdDraw.setPenColor(0, 0, 0);
            StdDraw.text(0.74,0.79,black[(int)card]);
        }
        if (t2>16){deal="over";}
        }
        if (t2<17){
            TimeUnit.SECONDS.sleep(2);
            StdDraw.setPenColor(255,255,255);
            StdDraw.filledRectangle(0.26, 0.8, 0.064, 0.1);
            color=Math.random();
        if (color<0.5){
            double card=(int)(Math.random()*12);
            int value;
            if(card<9){
                value=(int)card+2;
            } else if (card<12){
                value=10;
            } else {
                value=11;
            }
            t2+=value;
            StdDraw.setPenColor(200, 5, 5);
            StdDraw.text(0.26,0.79,red[(int)card]);

        } else{
            double card=(int)(Math.random()*12);
            int value;
            if(card<9){
                value=(int)card+2;
            } else if (card<12){
                value=10;
            } else {
                value=11;
            }
            t2+=value;
            StdDraw.setPenColor(0, 0, 0);
            StdDraw.text(0.26,0.79,black[(int)card]);
        }
        if (t2>16){deal="over";}
        }
        if (t2<17){
            TimeUnit.SECONDS.sleep(2);
            StdDraw.setPenColor(255,255,255);
            StdDraw.filledRectangle(0.9, 0.8, 0.064, 0.1);
            color=Math.random();
        if (color<0.5){
            double card=(int)(Math.random()*12);
            int value;
            if(card<9){
                value=(int)card+2;
            } else if (card<12){
                value=10;
            } else {
                value=11;
            }
            t2+=value;
            StdDraw.setPenColor(200, 5, 5);
            StdDraw.text(0.9,0.79,red[(int)card]);

        } else{
            double card=(int)(Math.random()*12);
            int value;
            if(card<9){
                value=(int)card+2;
            } else if (card<12){
                value=10;
            } else {
                value=11;
            }
            t2+=value;
            StdDraw.setPenColor(0, 0, 0);
            StdDraw.text(0.9,0.79,black[(int)card]);
        }
        if (t2>16){deal="over";}
        }
    } 
        TimeUnit.SECONDS.sleep(1);
        if (t2>21){StdOut.println("You win!");
        balance=balance+bet;}
        else{
        StdOut.println("You have: "+total);
        StdOut.println("The dealer has: "+t2);
    if(total>t2){
        StdOut.println("You win!");
        balance=balance+bet;
    } else{
        StdOut.println("You lose!");
        balance=balance-bet;
    }}}
        }
    StdDraw.setPenColor(5, 100, 5);
    StdDraw.filledRectangle(0.5, 0.05, 0.5, 0.05);
    StdDraw.setPenColor(255, 255, 255);
    StdDraw.setFont(fon);
    StdDraw.text(.85, .03, "Balance: "+"$"+balance+"0");
    StdOut.println("Would you like to play another hand? (type yes or no): ");
    play=StdIn.readString();
    }
StdOut.println("Close the window to end.");
    }
}

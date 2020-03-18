 import java.util.Scanner;
 
 
 
 class TextRpg{
 
 public static double BowserAttack(double herohealth)
{
herohealth = herohealth - 40 * Math.random();
System.out.println("Bowser furiously attacks with rage!");
return herohealth;
}
 
 public static double MarioAttack(double enemyhealth)
{
enemyhealth = enemyhealth - Math.random()*20;
System.out.println("Mario jumps high up into the air!");
return enemyhealth;
}



public static double MarioDefend(double Marhealth){
Marhealth = Marhealth-(0.2*BowserAttack(Marhealth));
System.out.println("Mario braces against the attack! It barely hurts him!!");
return Marhealth;
}



public static void main(String[] args)
{
double Mariohealth = 100;
double Bowserhealth = 150;

while(Mariohealth > 0 && Bowserhealth > 0)
{

System.out.println("Mario HP: "+Mariohealth);
System.out.println("Bowser HP: "+Bowserhealth);
Scanner input = new Scanner(System.in);
System.out.println("Attack   Defend");
String decision = input.nextLine();
if(decision.equals("Attack"))
{
Bowserhealth = MarioAttack(Bowserhealth);
Mariohealth = BowserAttack(Mariohealth);
}
else if(decision.equals("Defend"))
{
Mariohealth = MarioDefend(Mariohealth);
}
else{ System.out.println("INVALID INPUT!!");}
}
if(Bowserhealth < 0){
Bowserhealth = 0;
}
if(Mariohealth < 0){
Mariohealth = 0;
}
System.out.println("Mario HP: "+Mariohealth);
System.out.println("Bowser HP: "+Bowserhealth);

if(Bowserhealth > Mariohealth){
System.out.print("Bowser kidnapped the princess. YOU LOSE!");
} 
else{
System.out.print("Mario has defeated the Koopa King and you can now save the princess!");
}
}


}
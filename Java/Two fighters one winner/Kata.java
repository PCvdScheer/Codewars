public class Kata {
  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
  
  int t1;
  int t2;
  
  if(fighter2.health % fighter1.damagePerAttack ==0){t1 = fighter2.health / fighter1.damagePerAttack;}else{
  t1 = (fighter2.health / fighter1.damagePerAttack) +1;}
  
  
  if(fighter1.health % fighter2.damagePerAttack ==0){t2 = fighter1.health / fighter2.damagePerAttack;}else{
  t2 = (fighter1.health / fighter2.damagePerAttack) +1;}
  
  if(fighter1.name == firstAttacker){t1 -=1;} 
  else {t2 -=1;}
  
 System.out.println("t1: "+ t1 + " t2: "+ t2);
  
  if(t1<t2){return fighter1.name;}else{return fighter2.name;}
  } 
}
import static java.lang.Math.*;
public class NumberFun {
  public static long findNextSquare(long sq) {

  double temp = Math.sqrt(sq);

  if(temp == (int)temp){
    long nextN = (int) Math.floor(Math.sqrt(sq)) +1;
    return nextN*nextN;
    }else{return -1;}
  } 
}
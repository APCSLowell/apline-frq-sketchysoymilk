public class APLine
{
  private double slope;
  private int a;
  private int b;
  private int c;
  public void APLine (int d, int e, int f){
    a = d;
    b = e;
    c = f;
  }
  public double getSlope(){
    slope = -a/(double)b;
    return slope;
  }
  public boolean isOnLine(int x, int y){
    if((ax)+(by)+c == 0){
      return true;
    }
    return false;
  }
  
}

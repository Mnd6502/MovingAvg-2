public abstract class MinMaxMVA implements MovingAverage{
  
  static int min(){
    return min;
    
    }
  static int max(){
    return max;
    }
  static void setMin(int n){
    min = n;
    }
  static void setMax(int n){
    max = n;
    }

  static void updateMinMax(int x){
    if(min == 0 || min >x){
      setMin(x);}
    if (max < x){
      setMax(x);
    }
  }

  private static int min = 0;
  private static int max = 0;
  
}

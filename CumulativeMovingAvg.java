public class CumulativeMovingAvg extends MinMaxMVA {
  public void add(int x){
    
    sum += x;
    size ++;
    

    super.updateMinMax(x);
  }
  public double avg(){
    if (size == 0)
      return 0.0;
    return sum/size;
  }
  public CumulativeMovingAvg(){
    this.size = 0;
    this.sum = 0;
  }
  private int size;
  private double sum;
}
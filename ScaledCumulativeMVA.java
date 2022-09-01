// NEW Implementation in FINAL EXAM
public class ScaledCumulativeMVA extends MinMaxMVA {
    public void add(int x){
    int X = (int) (x * scale);
    sum += X;
    size ++;
    

    super.updateMinMax(X);
  }
  public double avg(){
    if (size == 0)
      return 0.0;
    return sum/size;
  }
  public ScaledCumulativeMVA(double scale){
    this.size = 0;
    this.sum = 0;
    this.scale = scale;
  }
  private int size;
  private double sum;
  private double scale;
}

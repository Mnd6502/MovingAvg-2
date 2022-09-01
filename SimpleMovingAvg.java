import java.util.ArrayList;


public class SimpleMovingAvg extends MinMaxMVA {
  public void add(int x){
    list.add(x);
    sum += x;

    super.updateMinMax(x);
    size ++;
    if (list.size()> sma_size && sma_size !=0){
      sum -= list.remove(0);
    }
  }
  public double avg(){
    if (size == 0)
      return 0.0;
    if (sma_size > size)
      return sum/size;
    return sum/sma_size;
  }
  public SimpleMovingAvg(int sma_size){
    this.sma_size = sma_size;
    this.size = 0;
    this.sum = 0;
  }
  private int size, sma_size;
  private double sum;
  private final ArrayList<Integer> list = new ArrayList<Integer>();
}
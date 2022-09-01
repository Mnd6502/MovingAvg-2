import java.util.ArrayList;


public class WeightedMovingAvg extends MinMaxMVA {
  public void add(int x){
    
    sum = 0; // reset the sum because the weight of old value is different (decrease) when new value is added
    list.add(x);
    
    super.updateMinMax(x);
    size ++;
    if (list.size()> wma_size && wma_size !=0){
      list.remove(0);
    }
    for (int i=0; i < list.size(); i++){
      sum += list.get(i)*(i+1);
      // Numerator for weighted MA:
      // 1(x1)+ 2(x2) + .... + n(xn) which xn is the most recent value
    }
  }
  
  public double avg(){
    if (size == 0 || wma_size > size)
      return 0.0;
    // If size is zero or the number of values do not reach the wma_size, simply return zero
    int weight = wma_size*(wma_size+1)/2;    
    return sum/weight;
  }
  public WeightedMovingAvg(int wma_size){
    this.wma_size = wma_size;
    this.size = 0;
    this.sum = 0;
  }
  private int size, wma_size;
  private double sum;
  private final ArrayList<Integer> list = new ArrayList<Integer>();
}
/*
Formula WMA = [ 1*(x_1)+2*(x_2)+3*(x_3)+...+n*(n_1) ] / [1 + 2 + 3 + ... + n]
            = [ 1*(x_1)+2*(x_2)+3*(x_3)+...+n*(n_1) ] / [n(n+1)/2]
*/
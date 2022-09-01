public interface MovingAverage{
  void add(int x);
  double avg();

  static MovingAverage makeWeighted(int weight_size){
    return new WeightedMovingAvg(weight_size);
  }
 
  static MovingAverage makeSimple(int n){
    return new SimpleMovingAvg(n);
    
  }
  static MovingAverage makeCumulative(){
    return new CumulativeMovingAvg();
    
  }
  // Change during the final exam
  static MovingAverage makeScaled(double scale){
    return new ScaledCumulativeMVA(scale);
    
  }
  
  static int min()
  {
    return MinMaxMVA.min();
  }
  
  static int max(){
    return MinMaxMVA.max();    
  }
  
  
}
//abstract
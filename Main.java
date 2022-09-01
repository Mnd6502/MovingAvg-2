class Main {
  public static void main(String[] args) {
    MovingAverage cma = MovingAverage.makeCumulative();
    MovingAverage sma10 = MovingAverage.makeSimple(10);
    MovingAverage wma10 = MovingAverage.makeWeighted(10);
    MovingAverage scale_ma = MovingAverage.makeScaled(2.5);
    System.out.println(MovingAverage.min()); // 0
    System.out.println(MovingAverage.max()); // 0
    /*
    for(int i =10;i <= 100; i++){
      cma.add(i);
      sma10.add(i);
      wma10.add(i);
  }
    
    System.out.println(cma.avg()); //55.0
    System.out.println(sma10.avg()); //95.5
    System.out.println(wma10.avg()); // 97.0
    System.out.println(MovingAverage.min()); // 10
    System.out.println(MovingAverage.max()); // 100
    cma.add(200);
    sma10.add(200);
    wma10.add(200);
    System.out.println(cma.avg()); //56.576
    System.out.println(sma10.avg()); //106.4
    System.out.println(wma10.avg()); // 116.0
    System.out.println(MovingAverage.min()); // 10
    System.out.println(MovingAverage.max()); // 200
    cma.add(5);
    sma10.add(5);
    wma10.add(5);
    System.out.println(cma.avg()); //56.021
    System.out.println(sma10.avg()); //97.7
    System.out.println(wma10.avg()); // 97.56
    System.out.println(MovingAverage.min()); // 5
    System.out.println(MovingAverage.max()); // 200

    */
    for (int i = 1; i <= 4; i++){
      scale_ma.add(i);
    }
    System.out.println(scale_ma.avg()); // 
    System.out.println(MovingAverage.min()); 
    System.out.println(MovingAverage.max());
    }
  
  
}
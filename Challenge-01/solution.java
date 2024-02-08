
Public class OddEven {
  public static void main(String args[]){
  int from = 10;
  int Till = 20;

  System.out.print(" Even numbers : ");
    for(int i = from; i < Till; i++){
      if(i % 2 == 0){
        System.out.println(i);
      }
    }
  System.out.println();
  System.out.print(" Odd numbers : ");

  int j = from;
    while( j < Till){
      if(j % 2 != 0){
        System.out.println(j);
      }
    }
  }
}
  

class Main {
  public static void main(String[] args) {
   String znak = "*";
    for (int a=1; a<4; a++)
      {
    for(int x=1; x<5; x++)
       {
         for(int y=1; y<5; y++)
           {
            if (y<(5-x))
            {
              System.out.print(" ");
            }
            else
            {
              System.out.print(znak);
              }
          }
        System.out.println();
      }
    }
}
}
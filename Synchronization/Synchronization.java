class Table
{
  synchronized void PrintTable(int n)
  {
    for(int i=1;i<=10;i++)
    {
      System.out.println(n + " X " + i + " = " +(n*i) );
      try
      {
        Thread.sleep(50);
      }
      catch (Exception e)
      {
        System.out.println(e);
      }
    }
  }
}

class MyThread1 extends Thread
{
  Table table;
  MyThread1(Table table)
  {
    this.table= table;
  }
@Override
public void run()
  {
    System.out.println("Multiplication Table of 5 And 10 : \n");
    table.PrintTable(5);
  }
}

class MyThread2 extends Thread
{
  Table table;
  MyThread2(Table table)
  {
    this.table= table;
  }
  @Override
  public void run()
  {

    table.PrintTable(10);
  }
}

public class Synchronization
{
  public static void main(String[] args)
  {
      Table obj= new Table();
      MyThread1 T1= new MyThread1(obj);
      MyThread2 T2= new MyThread2(obj);
      T1.start();
      T2.start();
  }
}
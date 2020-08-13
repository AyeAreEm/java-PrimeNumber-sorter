# java-PrimeNumber-sorter
Prime number sorter in java

## how it works

it asks user for the low number, then the high number. It takes the range of numbers from the low and the high and prints the prime numbers in it.

## how  it works in code

```java
  //check if it is prime or not
  public static boolean isPrime(int num) {
    // 1 is not a prime number so return false
    if (num == 1) {
      return false;
    }
    
    // a number divisable by 2 or 3 will return false
    if (num % 2 == 0 || num % 3 == 0) {
      return false;
    }
    
    // while i is smaller than itself squared, loop
    for (int i = 3; i < Math.sqrt(num); i += 2) {
      // if num is divisable by i or num is divisable by itself squared, return false
      if (num % i == 0 || num % Math.sqrt(num) == 0) {
        return false;
      }
    }
    
    return true;
  }
  
  @SuppressWarning("resource") // suppressing warning from scanner
  public static void main(String[] args) throws InterruptedException { // interrupted exception is caused by Thread.sleep()
    Scanner input = new Scanner(System.in);
    
    // get low value
    System.out.print("Low: ");
    String low = input.nextLine();
    
    //get high value
    System.out.print("High: ");
    String high = input.nextLine();
    
    System.out.println("Prime numbers between " + low + " and " + high + " are: ");
    Thread.sleep(1000);
    
    // while in range of low to high, if isPrime is true then print i
    for (int i = Integer.parseInt(low); i <= Integer.parseInt(high); i++) {
      if (isPrime(i)) {
        System.out.println(i);
      }
    }
  }

```

package first;

public class first_add {

}


class Solut{

    public int getNext(int n) {
       int totalSum = 0;
       while (n > 0) {
           int d = n % 10;
           n = n / 10;
           totalSum += d * d;
       }
       return totalSum;
   }

   public boolean isHappy(int n) {
       int slowRunner = n;
       int fastRunner = getNext(n);
       while (fastRunner != 1 && slowRunner != fastRunner) {
           slowRunner = getNext(slowRunner);
           fastRunner = getNext(getNext(fastRunner));
       }
       return fastRunner == 1;
   }
}

//这道题的根本在于，一定要知道 不是快乐数的数，会进入几个特定数的循环。是快乐数，会进入1的循环。
//因此，可以用快慢指针，反正都能进入循环，那当快、慢指针相等时，就是循环结束的时候。
//循环 快慢指针思想
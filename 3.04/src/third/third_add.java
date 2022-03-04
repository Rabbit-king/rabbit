package third;

public class third_add {

}

class solu {
    public int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q; 
            q = r; 
            r = p + q;
        }
        return r;
    }
}

//官方解答：斐波那契数列，建立此数学模型的原理是 建立楼层与楼层之间的关系
//比如 走到7楼，只能从5楼走两步，或者从6楼走1步，而且，这两个可能都只有唯一的答案，因此，只需要知道去5楼有多少种，6楼多少种即可。


//我的数学模型就是单纯的目的总楼出发，里面会有多少个2层，然后剩几个1层，然后排序相加。
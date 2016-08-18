package rx;

import io.reactivex.Observable;
import io.reactivex.Observer;

import java.util.Arrays;

/**
 * Created by wangzhijie on 2016/8/17.
 */

public class Test {
    public static void main(String[] args) {
        Observable.fromIterable(Arrays.asList(1,2,3))
                .subscribe(i -> {
                    System.out.println("ccf => " + i);
                });
    }
}

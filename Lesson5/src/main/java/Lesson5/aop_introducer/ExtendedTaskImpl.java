package Lesson5.aop_introducer;

/**
 * Class ExtendedTaskImpl
 *
 * Created by yslabko on 10/30/2017.
 */
public class ExtendedTaskImpl implements DoExtendedTask {
    @Override
    public void doExtraJob() {
        System.out.println("Класс-аспект ExtendedTaskImpl выполняет дополнительную работу.");
    }
}

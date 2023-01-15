import java.util.concurrent.locks.ReentrantLock;

public class Dock {
    private static Dock dock;
    private static ReentrantLock lock = new ReentrantLock();
    private Finder finder;

    private Dock(){}

    public static Dock instance(){
        if(dock == null){
            lock.lock();{
                if (dock == null)
                dock = new Dock();}
        }
        return dock;
    }
    public void clickDock(){
        System.out.println("Panel'e tiklandi");
        finder = new Finder();
        System.out.println("Finder:"+finder.title);
    }
}

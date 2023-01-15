public class Main {
    public static void main(String[] args) {
        Dock dock = Dock.instance();
        Finder finder = new Finder();
        dock.clickDock();
    }
}
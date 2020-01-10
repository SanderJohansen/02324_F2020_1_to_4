import data.DemoData;
import data.IData;
import ui.IUI;
import ui.TUI;

public class Main {
    public static void main(String[]  args) {
        IData data = new DemoData();
        IUI ui = new TUI(data);
        while (true){
            ui.showMenu();
        }
    }
}

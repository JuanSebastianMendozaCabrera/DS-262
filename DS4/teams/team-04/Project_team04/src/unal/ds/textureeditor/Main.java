//package unal.ds.textureeditor;

//import unal.ds.textureeditor.view.MainFrame;

//import javax.swing.SwingUtilities;
//import javax.swing.UIManager;

//public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); }
            catch (Exception ignored) { }
            EditorState state = new EditorState();
            new MainFrame(state).setVisible(true);
        });
    }
}
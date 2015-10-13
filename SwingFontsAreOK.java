
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public final class SwingFontsAreOK {

	private static void init() throws IOException {
		JFrame frame = new JFrame("Works!");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JLabel label = new JLabel(getText(), SwingConstants.CENTER);
		label.setOpaque(true);
		label.setBackground(Color.WHITE);
		label.setFont(new Font("sans-serif", Font.PLAIN, 12));
		frame.getContentPane().add(label);
		frame.setSize(300, 250);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(() -> {
			try {
				init();
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}

	static String getText() throws IOException {
		String plain = JavaFxReallyFontsSuckOnLinux.getText();
		String html = "<html>" + plain.replaceAll("\n", "<br/>") + "</html>";
		return html;
	}
}
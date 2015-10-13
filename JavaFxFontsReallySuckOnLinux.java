import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class JavaFxFontsReallySuckOnLinux extends Application {

	public static void main(String[] args) {
		launch(args);

		// Swing fonts look normal by default.
		//SwingFontsAreOK.main(args);
	}

	@Override
	public void start(Stage stage) throws IOException {
		// Look at this crap.
		// Can't you make it nice by default?
		// Are Linux defaults suppossed to be ugly?
		defaultsMustSuck(stage);

		/*
			Let's try to fix that with well hidden know how.

			System property "prism.text" can be set to "native" or to "t2k".
			System property "prism.lcdtext" can be set to "true" or to "false".
			The -fx-font-smoothing-type setting can be set to "lcd" or to "gray".
			Let's try all 8 combinations of settings.
			The CSS setting will be set via following style declaration:
				* {
					-fx-font-smoothing-type: gray;
				}

		 */
		//try1(stage);
		//try2(stage);
		//try3(stage);
		//try4(stage);
		//try5(stage);
		//try6(stage);
		//try7(stage);
		//try8(stage);
	}

	static void defaultsMustSuck(Stage stage) throws IOException {
		Label lbl = new Label(getText());
		StackPane root = new StackPane();
		root.getChildren().add(lbl);
		Scene scene = new Scene(root, 300, 250);
		stage.setTitle("Defaults must suck");
		stage.setScene(scene);
		stage.show();
	}

	static void try1(Stage stage) throws IOException {
		System.setProperty("prism.text", "native");
		System.setProperty("prism.lcdtext", "true");
		Label lbl = new Label(getText());
		StackPane root = new StackPane();
		root.getChildren().add(lbl);
		Scene scene = new Scene(root, 300, 250);
		scene.getStylesheets().add("style1.css"); // -fx-font-smoothing-type: lcd;
		stage.setTitle("try1");
		stage.setScene(scene);
		stage.show();
	}

	static void try2(Stage stage) throws IOException {
		System.setProperty("prism.text", "native");
		System.setProperty("prism.lcdtext", "true");
		Label lbl = new Label(getText());
		StackPane root = new StackPane();
		root.getChildren().add(lbl);
		Scene scene = new Scene(root, 300, 250);
		scene.getStylesheets().add("style2.css"); // -fx-font-smoothing-type: gray;
		stage.setTitle("try2");
		stage.setScene(scene);
		stage.show();
	}

	static void try3(Stage stage) throws IOException {
		System.setProperty("prism.text", "native");
		System.setProperty("prism.lcdtext", "false");
		Label lbl = new Label(getText());
		StackPane root = new StackPane();
		root.getChildren().add(lbl);
		Scene scene = new Scene(root, 300, 250);
		scene.getStylesheets().add("style1.css"); // -fx-font-smoothing-type: lcd;
		stage.setTitle("try3");
		stage.setScene(scene);
		stage.show();
	}

	static void try4(Stage stage) throws IOException {
		System.setProperty("prism.text", "native");
		System.setProperty("prism.lcdtext", "false");
		Label lbl = new Label(getText());
		StackPane root = new StackPane();
		root.getChildren().add(lbl);
		Scene scene = new Scene(root, 300, 250);
		scene.getStylesheets().add("style2.css"); // -fx-font-smoothing-type: gray;
		stage.setTitle("try4");
		stage.setScene(scene);
		stage.show();
	}

	static void try5(Stage stage) throws IOException {
		System.setProperty("prism.text", "t2k");
		System.setProperty("prism.lcdtext", "true");
		Label lbl = new Label(getText());
		StackPane root = new StackPane();
		root.getChildren().add(lbl);
		Scene scene = new Scene(root, 300, 250);
		scene.getStylesheets().add("style1.css"); // -fx-font-smoothing-type: lcd;
		stage.setTitle("try5");
		stage.setScene(scene);
		stage.show();
	}

	static void try6(Stage stage) throws IOException {
		System.setProperty("prism.text", "t2k");
		System.setProperty("prism.lcdtext", "true");
		Label lbl = new Label(getText());
		StackPane root = new StackPane();
		root.getChildren().add(lbl);
		Scene scene = new Scene(root, 300, 250);
		scene.getStylesheets().add("style2.css"); // -fx-font-smoothing-type: gray;
		stage.setTitle("try6");
		stage.setScene(scene);
		stage.show();
	}


	static void try7(Stage stage) throws IOException {
		System.setProperty("prism.text", "t2k");
		System.setProperty("prism.lcdtext", "false");
		Label lbl = new Label(getText());
		StackPane root = new StackPane();
		root.getChildren().add(lbl);
		Scene scene = new Scene(root, 300, 250);
		scene.getStylesheets().add("style1.css"); // -fx-font-smoothing-type: lcd;
		stage.setTitle("try7");
		stage.setScene(scene);
		stage.show();
	}

	static void try8(Stage stage) throws IOException {
		System.setProperty("prism.text", "t2k");
		System.setProperty("prism.lcdtext", "false");
		Label lbl = new Label(getText());
		StackPane root = new StackPane();
		root.getChildren().add(lbl);
		Scene scene = new Scene(root, 300, 250);
		scene.getStylesheets().add("style2.css"); // -fx-font-smoothing-type: gray;
		stage.setTitle("try8");
		stage.setScene(scene);
		stage.show();
	}

	static String getText() throws IOException {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				JavaFxFontsReallySuckOnLinux.class.getResourceAsStream("text.txt"), "UTF-8"))) {
			return reader.lines().collect(Collectors.joining("\n"));
		}
	}
}

/*
 * Copyright 2019 FormDev Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.formdev.flatlaf;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author Karl Tauber
 */
public class FlatComponentsTest
	extends JPanel
{
	public static void main( String[] args ) {
		try {
			if( args.length > 0 )
				UIManager.setLookAndFeel( args[0] );
			else
				UIManager.setLookAndFeel( new FlatTestLaf() );
		} catch( Exception ex ) {
			ex.printStackTrace();
		}

		JOptionPane.showMessageDialog( null,
			new FlatComponentsTest(),
			"FlatComponentsTest (Java " + System.getProperty( "java.version" ) + ")",
			JOptionPane.PLAIN_MESSAGE );
	}

	public FlatComponentsTest() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		JLabel labelLabel = new JLabel();
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel buttonLabel = new JLabel();
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();
		FlatComponentsTest.TestDefaultButton button5 = new FlatComponentsTest.TestDefaultButton();
		JLabel checkBoxLabel = new JLabel();
		JCheckBox checkBox1 = new JCheckBox();
		JCheckBox checkBox2 = new JCheckBox();
		JCheckBox checkBox3 = new JCheckBox();
		JCheckBox checkBox4 = new JCheckBox();
		JLabel radioButtonLabel = new JLabel();
		JRadioButton radioButton1 = new JRadioButton();
		JRadioButton radioButton2 = new JRadioButton();
		JRadioButton radioButton3 = new JRadioButton();
		JRadioButton radioButton4 = new JRadioButton();
		JLabel textFieldLabel = new JLabel();
		JTextField textField1 = new JTextField();
		JTextField textField2 = new JTextField();
		JTextField textField3 = new JTextField();
		JTextField textField4 = new JTextField();
		JLabel formattedTextFieldLabel = new JLabel();
		JFormattedTextField formattedTextField1 = new JFormattedTextField();
		JFormattedTextField formattedTextField2 = new JFormattedTextField();
		JFormattedTextField formattedTextField3 = new JFormattedTextField();
		JFormattedTextField formattedTextField4 = new JFormattedTextField();
		JLabel passwordFieldLabel = new JLabel();
		JPasswordField passwordField1 = new JPasswordField();
		JPasswordField passwordField2 = new JPasswordField();
		JPasswordField passwordField3 = new JPasswordField();
		JPasswordField passwordField4 = new JPasswordField();

		//======== this ========
		setLayout(new MigLayout(
			"insets 0,hidemode 3,gap 5 5",
			// columns
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- labelLabel ----
		labelLabel.setText("JLabel:");
		add(labelLabel, "cell 0 0");

		//---- label1 ----
		label1.setText("enabled");
		label1.setDisplayedMnemonic('E');
		add(label1, "cell 1 0");

		//---- label2 ----
		label2.setText("disabled");
		label2.setDisplayedMnemonic('D');
		label2.setEnabled(false);
		add(label2, "cell 2 0");

		//---- buttonLabel ----
		buttonLabel.setText("JButton:");
		add(buttonLabel, "cell 0 1");

		//---- button1 ----
		button1.setText("enabled");
		button1.setDisplayedMnemonicIndex(0);
		add(button1, "cell 1 1");

		//---- button2 ----
		button2.setText("disabled");
		button2.setDisplayedMnemonicIndex(0);
		button2.setEnabled(false);
		add(button2, "cell 2 1");

		//---- button3 ----
		button3.setText("selected");
		button3.setSelected(true);
		add(button3, "cell 3 1");

		//---- button4 ----
		button4.setText("selected disabled");
		button4.setSelected(true);
		button4.setEnabled(false);
		add(button4, "cell 4 1");

		//---- button5 ----
		button5.setText("default");
		button5.setDisplayedMnemonicIndex(0);
		add(button5, "cell 5 1");

		//---- checkBoxLabel ----
		checkBoxLabel.setText("JCheckBox");
		add(checkBoxLabel, "cell 0 2");

		//---- checkBox1 ----
		checkBox1.setText("enabled");
		add(checkBox1, "cell 1 2");

		//---- checkBox2 ----
		checkBox2.setText("disabled");
		checkBox2.setEnabled(false);
		add(checkBox2, "cell 2 2");

		//---- checkBox3 ----
		checkBox3.setText("selected");
		checkBox3.setSelected(true);
		add(checkBox3, "cell 3 2");

		//---- checkBox4 ----
		checkBox4.setText("selected disabled");
		checkBox4.setSelected(true);
		checkBox4.setEnabled(false);
		add(checkBox4, "cell 4 2");

		//---- radioButtonLabel ----
		radioButtonLabel.setText("JRadioButton:");
		add(radioButtonLabel, "cell 0 3");

		//---- radioButton1 ----
		radioButton1.setText("enabled");
		add(radioButton1, "cell 1 3");

		//---- radioButton2 ----
		radioButton2.setText("disabled");
		radioButton2.setEnabled(false);
		add(radioButton2, "cell 2 3");

		//---- radioButton3 ----
		radioButton3.setText("selected");
		radioButton3.setSelected(true);
		add(radioButton3, "cell 3 3");

		//---- radioButton4 ----
		radioButton4.setText("selected disabled");
		radioButton4.setSelected(true);
		radioButton4.setEnabled(false);
		add(radioButton4, "cell 4 3");

		//---- textFieldLabel ----
		textFieldLabel.setText("JTextField:");
		add(textFieldLabel, "cell 0 4");

		//---- textField1 ----
		textField1.setText("editable");
		add(textField1, "cell 1 4,growx");

		//---- textField2 ----
		textField2.setText("disabled");
		textField2.setEnabled(false);
		add(textField2, "cell 2 4,growx");

		//---- textField3 ----
		textField3.setText("not editable");
		textField3.setEditable(false);
		add(textField3, "cell 3 4,growx");

		//---- textField4 ----
		textField4.setText("not editable disabled");
		textField4.setEnabled(false);
		textField4.setEditable(false);
		add(textField4, "cell 4 4,growx");

		//---- formattedTextFieldLabel ----
		formattedTextFieldLabel.setText("JFormattedTextField:");
		add(formattedTextFieldLabel, "cell 0 5");

		//---- formattedTextField1 ----
		formattedTextField1.setText("editable");
		add(formattedTextField1, "cell 1 5,growx");

		//---- formattedTextField2 ----
		formattedTextField2.setText("disabled");
		formattedTextField2.setEnabled(false);
		add(formattedTextField2, "cell 2 5,growx");

		//---- formattedTextField3 ----
		formattedTextField3.setText("not editable");
		formattedTextField3.setEditable(false);
		add(formattedTextField3, "cell 3 5,growx");

		//---- formattedTextField4 ----
		formattedTextField4.setText("not editable disabled");
		formattedTextField4.setEnabled(false);
		formattedTextField4.setEditable(false);
		add(formattedTextField4, "cell 4 5,growx");

		//---- passwordFieldLabel ----
		passwordFieldLabel.setText("JPasswordField:");
		add(passwordFieldLabel, "cell 0 6");

		//---- passwordField1 ----
		passwordField1.setText("editable");
		add(passwordField1, "cell 1 6,growx");

		//---- passwordField2 ----
		passwordField2.setText("disabled");
		passwordField2.setEnabled(false);
		add(passwordField2, "cell 2 6,growx");

		//---- passwordField3 ----
		passwordField3.setText("not editable");
		passwordField3.setEditable(false);
		add(passwordField3, "cell 3 6,growx");

		//---- passwordField4 ----
		passwordField4.setText("not editable disabled");
		passwordField4.setEnabled(false);
		passwordField4.setEditable(false);
		add(passwordField4, "cell 4 6,growx");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// JFormDesigner - End of variables declaration  //GEN-END:variables

	//---- class TestDefaultButton --------------------------------------------

	private static class TestDefaultButton
		extends JButton
	{
		@Override
		public boolean isDefaultButton() {
			return true;
		}
	}
}
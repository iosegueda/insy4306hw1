//Iris Osegueda
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.event.*;


public class PropertyGUI2 extends JFrame 
{
	private JLabel selectOwnerLabel;
	private JComboBox<String> ownerListBox;
	
	private JLabel totalMarketValueLabel;
    private JTextField totalMarketValueField;
	
	private JLabel floodZoneLabel;
    private ButtonGroup bg;
    private JRadioButton yesRadioButton;
    private JRadioButton noRadioButton;
    private JPanel buttonPanel;
	
	public PropertyGUI2(String owners[])
	{
		super( "Property Input Screen" );
		setLayout(new GridLayout(6,2));
		
		selectOwnerLabel = new JLabel("    Select an Owner");
        ownerListBox = new JComboBox<String>(owners);
		
		totalMarketValueLabel = new JLabel("    Total Market Value");
        totalMarketValueField = new JTextField(15);
		totalMarketValueField.setEditable(false);
		
		floodZoneLabel = new JLabel( "    Flood Zone");
        bg = new ButtonGroup();
        yesRadioButton = new JRadioButton("YES");
        noRadioButton = new JRadioButton("NO");
        bg.add(yesRadioButton);
        bg.add(noRadioButton);
        buttonPanel = new JPanel();
        buttonPanel.add(yesRadioButton);
        buttonPanel.add(noRadioButton);
		
		add(selectOwnerLabel);
        add(ownerListBox);
		add(totalMarketValueLabel);
		add(totalMarketValueField);
		add(floodZoneLabel);
        add(buttonPanel);
	}
	
	public static void main(String[] args)
    {
		String owners[] = {"NONE", "Jones", "Smith", "Wills"};
		
		PropertyGUI2 demo = new PropertyGUI2(owners);

        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        demo.setSize(500, 300);
        demo.setVisible(true);
        demo.setLocationRelativeTo(null);	

    }
	
}
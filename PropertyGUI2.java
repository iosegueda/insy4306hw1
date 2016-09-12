//Iris Osegueda
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;


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
    
    private JLabel totalExemptionsLabel;    
    private JTextField totalExemptionsField;

    private JLabel totalTaxesLabel;
    private JTextField totalTaxesField;
    
    private JLabel clickWhenDoneLabel;
    private JButton finishButton;
    
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
        //TODO: change button layout, they dont look exactly like in the picture
        
        totalExemptionsLabel = new JLabel("    Total Exemptions");
        totalExemptionsField = new JTextField(15);
        totalExemptionsField.setEditable(false);

        totalTaxesLabel = new JLabel("    Total Taxes");
        totalTaxesField = new JTextField(15);
        totalTaxesField.setEditable(false);
        
        clickWhenDoneLabel = new JLabel("    Click When Done");
        finishButton = new JButton("   FINISH");
        finishButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                System.exit(0);
            }
        }
        );
        
        
        add(selectOwnerLabel);
        add(ownerListBox);
        add(totalMarketValueLabel);
        add(totalMarketValueField);
        add(floodZoneLabel);
        add(buttonPanel);
        add(totalExemptionsLabel);
        add(totalExemptionsField);
        add(totalTaxesLabel);
        add(totalTaxesField);
        add(clickWhenDoneLabel);
        add(finishButton);
    }
    
    public static void main(String[] args)
    {
        /* 
        -initialize owners, done
        -initialize reader 
        -then read 
        */
        String owners[] = {"NONE"};
        String properties [];
        String property[] = {};
        String line;
        
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("properties.txt"));
            
            while((line = reader.readLine()) != null)
            {
                System.out.println(line);
                property = line.split(";");
                System.out.println(property[1]);
            }
        }
        catch ( IOException ioe )
        {
            System.out.println( ioe );
        }
        catch ( Exception e )
        {
            e.printStackTrace();
        }
        
        
        PropertyGUI2 demo = new PropertyGUI2(owners);

        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        demo.setSize(500, 300);
        demo.setVisible(true);
        demo.setLocationRelativeTo(null);
    }
    
}
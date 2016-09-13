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
    
    public PropertyGUI2(String[] owners)
    {
        super( "Property Input Screen" );
        setLayout(new GridLayout(6,2));
        
        selectOwnerLabel = new JLabel("    Select an Owner");
        ownerListBox = new JComboBox<String>(owners);
        ownerListBox.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent event)
            {
                if (event.getStateChange() == ItemEvent.SELECTED)
                {
                    Object item = event.getItem();
                    System.out.println(item.toString());
                    // do something with object
                }
            }
        }
        );
        
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

    public static int getOwnerPos(java.util.List<Owner> owners, String name)
    {
        for(int i = 0; i < owners.size(); i++)
        {
            if(name.equals(owners.get(i).getName()))
            {
                return i;
            }
        }
        return(-1);
    }
    
    public static void main(String[] args)
    {
        java.util.List<Owner> owners = new ArrayList<Owner>();
        java.util.List<String> ownerNames = new ArrayList<String>();
        String properties [];
        String property[] = {};
        String line;
        String name;
        boolean nameIsInList = false;
        int position;
        
        ownerNames.add("NONE");

        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("properties.txt"));
            
            while((line = reader.readLine()) != null)
            {
                System.out.println(line);
                property = line.split(";");

                position = getOwnerPos(owners, property[1]);
                if(position < 0)
                {
                    owners.add(new Owner(property[1]));
                    position = getOwnerPos(owners, property[1]);
                    ownerNames.add(property[1]);
                }
                if(property[0].equals("Residential"))
                {
                    owners.get(position).addProperty(new ResidentialProperty(new Address(property[2], property[3], property[4], Integer.parseInt(property[5])), 
                                                                        Double.parseDouble(property[6]), 
                                                                        Integer.parseInt(property[7]), 
                                                                        Boolean.parseBoolean(property[8]), 
                                                                        ResidentialProperty.Subdivision.valueOf(property[9])));
                }
                else if(property[0].equals("Commercial"))
                {
                    owners.get(position).addProperty(new CommercialProperty(new Address(property[2], property[3], property[4], Integer.parseInt(property[5])), 
                                                                        Double.parseDouble(property[6]), 
                                                                        Integer.parseInt(property[7]), 
                                                                        Boolean.parseBoolean(property[8]), 
                                                                        property[9], 
                                                                        property[10]));
                }
            }

            System.out.println("\n");
            for(int i = 0; i < owners.size(); i++)
            {
                System.out.println(owners.get(i).toString());
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


        String[] simpleArray = new String[ ownerNames.size() ];
        ownerNames.toArray( simpleArray );
        
        PropertyGUI2 demo = new PropertyGUI2(simpleArray);

        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        demo.setLocationRelativeTo(null);
        demo.setSize(500, 300);
        demo.setVisible(true);
    }
}
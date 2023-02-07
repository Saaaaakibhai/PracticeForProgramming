import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.*;
public class JavaProj {

    private JPanel Main;
    private JTextField txtname;
    private JTextField txtidentity;
    private JButton saveButton;
    private JButton deleteButton;
    private JTextField txtid;
    private JButton updateButton;
    private JTextField txtMobile;
    private JButton searchButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaProj");
        frame.setContentPane(new JavaProj().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    Connection con;
    PreparedStatement pst;
    public JavaProj() {
        Connect();

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name,identity,id;

                name = txtname.getText();
                identity = txtidentity.getText();
                id = txtid.getText();

                try {
                    pst = con.prepareStatement("insert into customer(Name,Identity,Id)values(?,?,?)");
                    pst.setString(1, name);
                    pst.setString(2, identity);
                    pst.setString(3, id);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Record Addedddddd!!!!");

                    txtname.setText("");
                    txtidentity.setText("");
                    txtid.setText("");
                    txtname.requestFocus();
                }

                catch (SQLException e1)
                {
                    e1.printStackTrace();
                }
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    String Mobile = txtMobile.getText();
                    pst = con.prepareStatement("select Name,Identity,Id from customer where Mobile = ?");
                    pst.setString(1, Mobile);
                    ResultSet rs = pst.executeQuery();

                    if(rs.next()==true)
                    {
                        String name = rs.getString(1);
                        String identity = rs.getString(2);
                        String id = rs.getString(3);

                        txtname.setText(name);
                        txtidentity.setText(identity);
                        txtid.setText(id);
                    }
                    else
                    {
                        txtname.setText("");
                        txtidentity.setText("");
                        txtid.setText("");
                        JOptionPane.showMessageDialog(null,"Invalid Product ID");

                    }
                }

                catch (SQLException ex)
                {
                    ex.printStackTrace();
                }

            }
        });
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Mobile,Name,Identity,Id;

                Name = txtname.getText();
                Identity = txtidentity.getText();
                Id = txtid.getText();
                Mobile = txtMobile.getText();

                try {

                    pst = con.prepareStatement("update customer set Name = ?,Identity = ?,Id = ? where Mobile = ?");
                    pst.setString(1, Name);
                    pst.setString(2, Identity);
                    pst.setString(3, Id);
                    pst.setString(4, Mobile);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Updateee!!!!!");

                    txtname.setText("");
                    txtidentity.setText("");
                    txtid.setText("");
                    txtname.requestFocus();
                    txtMobile.setText("");
                }

                catch (SQLException e1)
                {

                    e1.printStackTrace();
                }
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bid;

                bid = txtMobile.getText();


                try {
                    pst = con.prepareStatement("delete from customer  where Mobile = ?");
                    pst.setString(1, bid);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleteeeeee!!!!!");

                    txtname.setText("");
                    txtidentity.setText("");
                    txtid.setText("");
                    txtname.requestFocus();
                    txtMobile.setText("");
                }

                catch (SQLException e1)
                {
                    e1.printStackTrace();
                }
            }
        });
    }

    public void Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/javaproj","root","");
            System.out.println("Success");
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}

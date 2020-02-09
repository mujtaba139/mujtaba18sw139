package project;
import java.sql.*; 
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import java.util.Scanner;

public class StudentInformation extends JFrame implements ActionListener 
{

	JPanel panel;
	JLabel user_label, password_label, message;
	JTextField userName_text;
	JPasswordField password_text;
	JButton submit, cancel;

	StudentInformation() 
	{


		user_label = new JLabel();
		user_label.setText("User_Name");
		userName_text = new JTextField();


		password_label = new JLabel();
		password_label.setText("User_Password");
		password_text = new JPasswordField();

		submit = new JButton("Login");

		panel = new JPanel(new GridLayout(6, 6));

		panel.add(user_label);
		panel.add(userName_text);
		panel.add(password_label);
		panel.add(password_text);

		message = new JLabel();
		panel.add(message);
		panel.add(submit);


		submit.addActionListener(this);
		add(panel, BorderLayout.CENTER);
		setLocationByPlatform(true);
		setTitle("Student Information Details");
		setBounds(310,250,200,100);
		setSize(370,220);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

	public static void main(String[] args) 
	{


		new StudentInformation();		 
	}

	public void actionPerformed(ActionEvent ae) 
	{

		String userName = userName_text.getText();
		String password = password_text.getText();


		if (userName.trim().equals("software18") && password.trim().equals("lmntrix")) 
		{
			message.setText(" Successfully Login.. ");	

			this.dispose();

			String userial = JOptionPane.showInputDialog("Enter Student Roll Number:");
			try{  
				//step1 load the driver class  
				Class.forName("oracle.jdbc.driver.OracleDriver");  

				//step2 create  the connection object  
				Connection con=DriverManager.getConnection(  
						"jdbc:oracle:thin:@localhost:1521/orcl","scott","orcl");  

				//step3 create the statement object  
				Statement stmt=con.createStatement();  

				//step4 execute query 
				//forward only cursor type of query
				/*ResultSet rs=stmt.executeQuery(" select * from STUDENT_INFORMATION where roll_no = '18SW' ");  
				while(rs.next())  
					System.out.println(rs.getString(1)+ "  " +rs.getString(2)+ "  " +rs.getString(3) + " " + rs.getString(4));  
				 */
				switch (userial) 
				{
				case "01":
					ResultSet rs1=stmt.executeQuery(" select * from STUDENT_INFORMATION where roll_no = '18SW01' ");  
					this.show();
					while(rs1.next())
						JOptionPane.showMessageDialog(null,rs1.getString(1)+ "  " +rs1.getString(2)+ "  " +rs1.getString(3) + " " + rs1.getString(4));
					break;

				case "02":
					ResultSet rs2=stmt.executeQuery(" select * from STUDENT_INFORMATION where roll_no = '18SW02' ");
					this.show();
					while(rs2.next())  
						JOptionPane.showMessageDialog(null,rs2.getString(1)+ "  " +rs2.getString(2)+ "  " +rs2.getString(3) + " " + rs2.getString(4));
					break;

				case "03":
					ResultSet rs3=stmt.executeQuery(" select * from STUDENT_INFORMATION where roll_no = '18SW03' ");
					this.show();
					while(rs3.next())  
						JOptionPane.showMessageDialog(null,rs3.getString(1)+ "  " +rs3.getString(2)+ "  " +rs3.getString(3) + " " + rs3.getString(4));
					break;

				case "04":
					ResultSet rs4=stmt.executeQuery(" select * from STUDENT_INFORMATION where roll_no = '18SW04' ");
					this.show();
					while(rs4.next())  
						JOptionPane.showMessageDialog(null,rs4.getString(1)+ "  " +rs4.getString(2)+ "  " +rs4.getString(3) + " " + rs4.getString(4));
					break;

				case "05":
					ResultSet rs5=stmt.executeQuery(" select * from STUDENT_INFORMATION where roll_no = '18SW05' ");
					this.show();
					while(rs5.next())  
						JOptionPane.showMessageDialog(null,rs5.getString(1)+ "  " +rs5.getString(2)+ "  " +rs5.getString(3) + " " + rs5.getString(4));
					break;

				case "06":
					ResultSet rs6=stmt.executeQuery(" select * from STUDENT_INFORMATION where roll_no = '18SW06' ");
					this.show();
					while(rs6.next())  
						JOptionPane.showMessageDialog(null,rs6.getString(1)+ "  " +rs6.getString(2)+ "  " +rs6.getString(3) + " " + rs6.getString(4));
					break;

				case "07":
					ResultSet rs7=stmt.executeQuery(" select * from STUDENT_INFORMATION where roll_no = '18SW07' ");
					this.show();
					while(rs7.next())  
						JOptionPane.showMessageDialog(null,rs7.getString(1)+ "  " +rs7.getString(2)+ "  " +rs7.getString(3) + " " + rs7.getString(4));
					break;

				case "08":
					ResultSet rs8=stmt.executeQuery(" select * from STUDENT_INFORMATION where roll_no = '18SW08' ");
					this.show();
					while(rs8.next())  
						JOptionPane.showMessageDialog(null,rs8.getString(1)+ "  " +rs8.getString(2)+ "  " +rs8.getString(3) + " " + rs8.getString(4));
					break;

				case "09":
					ResultSet rs9=stmt.executeQuery(" select * from STUDENT_INFORMATION where roll_no = '18SW09' ");
					this.show();
					while(rs9.next())  
						JOptionPane.showMessageDialog(null,rs9.getString(1)+ "  " +rs9.getString(2)+ "  " +rs9.getString(3) + " " + rs9.getString(4));
					break;

				case "10":
					ResultSet rs10=stmt.executeQuery(" select * from STUDENT_INFORMATION where roll_no = '18SW10' ");
					this.show();
					while(rs10.next())  
						JOptionPane.showMessageDialog(null,rs10.getString(1)+ "  " +rs10.getString(2)+ "  " +rs10.getString(3) + " " + rs10.getString(4));
					break;
				case "11":
					ResultSet rs11=stmt.executeQuery(" select * from STUDENT_INFORMATION where roll_no = '18SW11' ");
					this.show();
					while(rs11.next())  
						JOptionPane.showMessageDialog(null,rs11.getString(1)+ "  " +rs11.getString(2)+ "  " +rs11.getString(3) + " " + rs11.getString(4));
					break;
				case "13":
					ResultSet rs13=stmt.executeQuery(" select * from STUDENT_INFORMATION where roll_no = '18SW13' ");
					this.show();
					while(rs13.next())  
						JOptionPane.showMessageDialog(null,rs13.getString(1)+ "  " +rs13.getString(2)+ "  " +rs13.getString(3) + " " + rs13.getString(4));
					break;
				case "14":
					ResultSet rs14=stmt.executeQuery(" select * from STUDENT_INFORMATION where roll_no = '18SW14' ");
					this.show();
					while(rs14.next())  
						JOptionPane.showMessageDialog(null,rs14.getString(1)+ "  " +rs14.getString(2)+ "  " +rs14.getString(3) + " " + rs14.getString(4));
					break;
				case "15":
					ResultSet rs15=stmt.executeQuery(" select * from STUDENT_INFORMATION where roll_no = '18SW15' ");
					this.show();
					while(rs15.next())  
						JOptionPane.showMessageDialog(null,rs15.getString(1)+ "  " +rs15.getString(2)+ "  " +rs15.getString(3) + " " + rs15.getString(4));
					break;
				case "139":
					ResultSet rs139=stmt.executeQuery(" select * from STUDENT_INFORMATION where roll_no = '18SW139' ");
					this.show();
					while(rs139.next())  
						JOptionPane.showMessageDialog(null,rs139.getString(1)+ "  " +rs139.getString(2)+ "  " +rs139.getString(3) + " " + rs139.getString(4));
					break;

				default:
					JOptionPane.showMessageDialog(null," is not a valid Student Number");
				}
				//step5 close the connection object  
				con.close();  

			}
			catch(Exception e)
			{ 
				JOptionPane.showMessageDialog(null, e.getMessage());
			}  
		}
		else 
		{
			message.setText(" Invalid User_Name OR Passowrd..!!!");
		}

	}
}
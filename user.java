package awtCrud;
 
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
 
class UserFrame extends Frame implements ActionListener
{
	Label lblTitle, lblrollno, lblName, lblCity, lblAge, lblStatus;
	TextField txtName, txtrollno, txtCity, txtAge;
	Button btnSave, btnClear, btnDelete;
 
 
	String qry = "";
	Connection con = null;
	PreparedStatement st = null;
	ResultSet rs = null;
	Statement stmt = null;
 
	//Database Connection
		public vorollno connect() {
			try 
			{	
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yug?characterEncoding=latin1","root","1234");  

			} 
			catch (Exception ex) {
				ex.printStackTrace();
			}
 
		}
 
		//Clear Form Details
		public vorollno clear() {
			txtRollno.setText("");
			txtName.setText("");
			txtM1.setText("");
			txtM2.setText("");
			txtName.requestFocus();
		}
 
	public UserFrame() {
		connect();
		this.setVisible(true);
		this.setSize(1000, 600);
		this.setTitle("User Management System");
		this.setLayout(null);
		Color formColor = new Color(53, 59, 72);
		this.setBackground(formColor);
 
		Font titleFont = new Font("arial", Font.BOLD, 25);
		Font labelFont = new Font("arial", Font.PLAIN, 18);
		Font textFont = new Font("arial", Font.PLAIN, 18);
 
 
		lblTitle = new Label("User Management System");
		lblTitle.setBounds(250, 40, 400, 50);
		lblTitle.setFont(titleFont);
		lblTitle.setForeground(Color.YELLOW);
		add(lblTitle);
 
		lblRollno = new Label("rollno");
		lblRollno.setBounds(250, 100, 150, 30);
		lblRollno.setFont(labelFont);
		lblRollno.setForeground(Color.WHITE);
		add(lblRollno);
 
		txtRollno = new TextField();
		txtRollno.setBounds(400, 100, 400, 30);
		txtRollno.setFont(textFont);
		txtRollno.addActionListener(this);
		add(txtRollno);
 
 
		lblName = new Label("Name");
		lblName.setBounds(250, 150, 150, 30);
		lblName.setFont(labelFont);
		lblName.setForeground(Color.WHITE);
		add(lblName);
 
		txtName = new TextField();
		txtName.setBounds(400, 150, 400, 30);
		txtName.setFont(textFont);
		add(txtName);
 
		lblM1 = new Label("M1");
		lblM1.setBounds(250, 200, 150, 30);
		lblM1.setFont(labelFont);
		lblM1.setForeground(Color.WHITE);
		add(lblM1);
 
		txtM1 = new TextField();
		txtM1.setBounds(400, 200, 400, 30);
		txtM1.setFont(textFont);
		add(txtM1);
 
		lblM2 = new Label("M2");
		lblM2.setBounds(250, 250, 150, 30);
		lblM2.setFont(labelFont);
		lblM2.setForeground(Color.WHITE);
		add(lblM2);
 
		txtM2 = new TextField();
		txtM2.setBounds(400, 250, 400, 30);
		txtM2.setFont(textFont);
		add(txtM2);
 
 
		btnSave = new Button("Save");
		btnSave.setBounds(400, 300, 100, 30);
		btnSave.setBackground(Color.BLUE);
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(labelFont);
		btnSave.addActionListener(this);
		add(btnSave);
 
		btnClear = new Button("Clear");
		btnClear.setBounds(520, 300, 100, 30);
		btnClear.setBackground(Color.ORANGE);
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(labelFont);
		btnClear.addActionListener(this);
		add(btnClear);
 
		btnDelete = new Button("Delete");
		btnDelete.setBounds(640, 300, 100, 30);
		btnDelete.setBackground(Color.RED);
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(labelFont);
		btnDelete.addActionListener(this);
		add(btnDelete);
 
		lblStatus = new Label("----------------");
		lblStatus.setFont(labelFont);
		lblStatus.setForeground(Color.WHITE);
		lblStatus.setBounds(400, 350, 300, 30);
		add(lblStatus);
 
 
		this.addWindowListener(new WindowAdapter() {
			public vorollno windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	@Overrrollnoe
	public vorollno actionPerformed(ActionEvent e) {
		try
		{
			String rl = txtRollno.getText();
			String name = txtName.getText();
			String m1 = txtM1.getText();
			String m2 = txtM2.getText();
 
 
			if (e.getSource().equals(txtRollno)) {
				//Get User By rollno
				qry = "SELECT rollno,name,m1,m2 from school where rollno=" + txtRollno.getText();
				stmt =con.createStatement();
				rs = stmt.executeQuery(qry);
				if (rs.next()) {
					txtRollno.setText(rs.getString("rollno"));
					txtName.setText(rs.getString("name"));
					txtM1.setText(rs.getString("m1"));
					txtM2.setText(rs.getString("m2"));
 
				} else {
					clear();
					lblStatus.setText("Invalrollno rollno");
 
				}
			}
 
 
			if (e.getSource().equals(btnClear)) {
				clear();
			}
			else if (e.getSource().equals(btnSave)) {
 
				if (rollno.isEmpty() || rollno.equals("")) {
					//Save Details
					qry = "insert into school (name,m1,m2) values(?,?,?)";
					st = con.prepareStatement(qry);
					st.setString(1, name);
					st.setString(2, m1);
					st.setString(3, m2);
					st.executeUpdate();
					clear();
 
				lblStatus.setText("Data Insert Success");
				}else {
					//Update Details
					qry = "update school set NAME=?,m1=?,m2=? where rollno=?";
					st = con.prepareStatement(qry);
					st.setString(1, name);
					st.setString(2, m1);
					st.setString(3, m2);
					st.setString(4, rollno);
					st.executeUpdate();
					clear();
					lblStatus.setText("Data Update Success");
				}
			}
			 else if (e.getSource().equals(btnDelete)) {
 
				//Delete Details
					if (!rollno.isEmpty() || !rollno.equals("")) {
						qry = "delete from users where rollno=?";
						st = con.prepareStatement(qry);
						st.setString(1, rollno);
						st.executeUpdate();
						clear();
						lblStatus.setText("Data Deleted Success");
					}else {
						lblStatus.setText("Please Enter The Correct rollno");
					}
			 }
 
		} catch (Exception ex) {
			ex.printStackTrace();
		}
 
	}
 
}
 
public class users {
 
	public static vorollno main(String[] args) {
 
		UserFrame frm =new UserFrame();
 
	}
 
}
 
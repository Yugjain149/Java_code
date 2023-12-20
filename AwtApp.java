import java.awt.*;

public class AwtApp 
{
	AwtApp()
	{
          Frame fm=new Frame();
		Label fn=new Label("FRIST NAME=");
		fn.setBounds(20,50,80,20);
		
		Label ln=new Label("last NAME=");
		ln.setBounds(20,80,80,20);
		
		Label dob=new Label("DATE OF BIRTH=");
		fn.setBounds(20,110,80,20);
		
		TextField fntf =new TextField();
		fntf.setBounds(120,50,100,20);
		
		TextField lntf =new TextField();
		lntf.setBounds(120,80,100,20);
		
		TextField dobtf =new TextField();
		dobtf.setBounds(120,110,100,20);
		
		Button sbmt = new Button("submit");
		sbmt.setBounds(20,160,100,30);
		
		Button ret = new Button("reset");
		ret.setBounds(120,160,100,30);
		
		fm.add(fn);
		fm.add(ln);
		fm.add(dob);
		fm.add(fntf);
		fm.add(lntf);
		fm.add(dobtf);
		fm.add(sbmt);
		fm.add(ret);
		
		fm.setSize(500,500);
		fm.setLayout(null);
		fm.setVisible(true);
	}
	
	public static void main(String []args)
	{
		AwtApp awt = new AwtApp();
	}
}